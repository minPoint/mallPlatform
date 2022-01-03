package org.minpoint.muxige.core.utils;

import org.minpoint.muxige.base.exception.MuXiGeException;
import org.minpoint.muxige.base.exception.SystemStatusEnum;
import org.minpoint.muxige.core.pojo.BaseModel;
import org.minpoint.muxige.core.pojo.BaseQuery;
import org.minpoint.muxige.base.exception.MuXiGeException;
import org.minpoint.muxige.base.exception.SystemStatusEnum;
import org.springframework.beans.BeanUtils;

/*
 * @ClassName BaseConvert
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/25 18:05
 */
public class BaseConvert {
    private static final String path = "org.minpoint.muxige.core.pojo.BaseModel";
    private static Class MODEL;


    static {
        try {
            MODEL = Class.forName(path);
        }catch (Exception e){
            throw new MuXiGeException(e, SystemStatusEnum.INIT_ERROR);
        }
    }

    public static <T extends BaseModel> T convertQueryToModel(BaseQuery baseQuery, T baseModel){
        if(baseModel == null){
            throw new MuXiGeException(SystemStatusEnum.OBJ_TRANSFORM_ERROR);
        }
        BeanUtils.copyProperties(baseQuery, baseModel);
        return baseModel;
    }

    public static <T extends BaseModel> T convertQueryToModel(BaseQuery baseQuery, Class<T> cls){
        if(!cls.getSuperclass().equals(MODEL)){
            throw new MuXiGeException(SystemStatusEnum.QUERY_COPY_MODEL_ERROR);
        }
        try {
            T model = cls.newInstance();
            BeanUtils.copyProperties(baseQuery, model);
            return model;
        }catch (Exception e){
            throw new MuXiGeException(SystemStatusEnum.OBJ_TRANSFORM_ERROR);
        }
    }
}
