package org.minpoint.muxige.core.mybatis.method;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.injector.AbstractMethod;
import com.baomidou.mybatisplus.core.metadata.TableInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlSource;
import org.minpoint.muxige.core.mybatis.anno.QueryField;
import org.minpoint.muxige.core.mybatis.constants.SqlConditionConstants;
import org.minpoint.muxige.core.mybatis.constants.SqlScriptConstants;
import org.minpoint.muxige.core.mybatis.CommonSql;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/*
 * @ClassName ListPaging
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/24 17:35
 */
@Slf4j
public class ListPaging extends AbstractMethod {


    @Override
    public MappedStatement injectMappedStatement(Class<?> mapperClass, Class<?> modelClass, TableInfo tableInfo) {
        StringBuilder sb = new StringBuilder(SqlScriptConstants.WHERE_START.getScript());
        try{
            // 获取mapper的类型
            Type[] genericInterfaces = mapperClass.getGenericInterfaces();
            Type genericInterface = genericInterfaces[0];
            if( genericInterface instanceof ParameterizedType){
                ParameterizedType parameterizedType = (ParameterizedType) genericInterface;
                // 获取Model
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                Type typeArgument = actualTypeArguments[2];
                Class<?> cls = Class.forName(typeArgument.getTypeName());
                Field[] declaredFields = cls.getDeclaredFields();
                // 遍历model生成SQL
                for(Field field : declaredFields){
                    field.setAccessible(true);
                    // 只有QueryField的字段需要作为sql查询条件
                    QueryField annotation = field.getAnnotation(QueryField.class);
                    if(null == annotation){
                        continue;
                    }
                    String modelField = field.getName();
                    String column = modelField;
                    if(StrUtil.isNotEmpty(annotation.value())){
                        column = annotation.value();
                    }
                    Class<?> type = field.getType();
                    String typeName = type.getName();
                    if(SqlConditionConstants.SqlType.NUM.contains(typeName) ||  SqlConditionConstants.SqlType.STRING.contains(typeName)){
                        sb.append(String.format(SqlScriptConstants.IF_COMMON.getScript(), modelField, modelField))
                                .append(String.format(SqlScriptConstants.COMMON_CONDITION.getScript(), column, modelField))
                                .append(SqlScriptConstants.IF_END.getScript());
                    }
                    //else if( type.isAssignableFrom(List.class)){
                        //Type genericType = field.getGenericType();
                        //ParameterizedType listType = (ParameterizedType)genericType;
                        //Class aClass = (Class)listType.getActualTypeArguments()[0];
                        //System.out.println(aClass.isPrimitive());
                        //sb.append(String.format(SqlScriptConstants.IF_COLLECTION.getScript(), modelField, modelField))
                        //        .append(String.format(SqlScriptConstants.COLLECTION_CONDITION_START.getScript(), modelField))
                        //        .append(String.format(SqlScriptConstants.FOR_EACH.getScript(), column))
                        //        .append(SqlScriptConstants.IF_END.getScript());
                    //}
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        sb.append(SqlScriptConstants.WHERE_END.getScript());
        String sql = String.format(
                CommonSql.LIST_PAGING.getSql(),
                tableInfo.getAllSqlSelect(),
                tableInfo.getTableName(),
                sb.toString());
        log.info(sql);
        log.info("============================================================");


        //log.info("ListPagingSQL：{}", sql);
        SqlSource sqlSource = languageDriver.createSqlSource(configuration, sql, modelClass);

        return this.addSelectMappedStatementForTable(mapperClass, "listPaging", sqlSource, tableInfo);
    }



}
