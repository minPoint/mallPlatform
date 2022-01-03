package org.minpoint.muxige.system.core.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.minpoint.muxige.system.core.pojo.bo.MenuBo;
import org.minpoint.muxige.system.core.pojo.entity.MenuEntity;
import org.minpoint.muxige.system.core.pojo.query.MenuModel;
import org.minpoint.muxige.core.mapper.MuXiGeMapper;

/*
 * @ClassName MenuMapper
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/8 17:11
 */
@Mapper
public interface MenuMapper extends MuXiGeMapper<MenuEntity, MenuBo, MenuModel> {
}
