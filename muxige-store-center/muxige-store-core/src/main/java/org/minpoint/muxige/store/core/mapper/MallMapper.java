package org.minpoint.muxige.store.core.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.minpoint.muxige.core.mapper.MuXiGeMapper;
import org.minpoint.muxige.store.core.pojo.bo.MallBo;
import org.minpoint.muxige.store.core.pojo.entity.MallEntity;
import org.minpoint.muxige.store.core.pojo.query.MallModel;
import org.minpoint.muxige.store.core.pojo.query.MallQuery;

/*
 * @ClassName MallMapper
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/5 16:17
 */
@Mapper
public interface MallMapper extends MuXiGeMapper<MallEntity, MallBo, MallModel> {
}
