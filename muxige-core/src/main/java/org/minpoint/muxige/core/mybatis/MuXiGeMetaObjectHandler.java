package org.minpoint.muxige.core.mybatis;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.minpoint.muxige.core.util.DateTimeUtils;
import org.springframework.stereotype.Component;

/*
 * @ClassName MetaObjectHandler
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/15 22:09
 */

@Component
public class MuXiGeMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("createTime", DateTimeUtils.currentTimeStamp(), metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("modifyTime", DateTimeUtils.currentTimeStamp(), metaObject);
    }
}
