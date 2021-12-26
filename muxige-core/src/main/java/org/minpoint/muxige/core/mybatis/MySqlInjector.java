package org.minpoint.muxige.core.mybatis;

import com.baomidou.mybatisplus.core.injector.AbstractMethod;
import com.baomidou.mybatisplus.core.injector.AbstractSqlInjector;
import com.baomidou.mybatisplus.core.injector.DefaultSqlInjector;
import org.minpoint.muxige.core.mybatis.method.ListPaging;

import java.util.List;

/*
 * @ClassName MySqlInjector
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/24 17:29
 */
public class MySqlInjector extends DefaultSqlInjector {

    @Override
    public List<AbstractMethod> getMethodList(Class<?> mapperClass) {
        List<AbstractMethod> methodList = super.getMethodList(mapperClass);
        //扩充自定义的方法
        methodList.add(new ListPaging());
        return methodList;
    }
}
