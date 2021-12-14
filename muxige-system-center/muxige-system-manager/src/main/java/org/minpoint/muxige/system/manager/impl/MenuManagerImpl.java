package org.minpoint.muxige.system.manager.impl;

import org.minpoint.muxige.core.manager.impl.MuXiGeManagerImpl;
import org.minpoint.muxige.system.core.pojo.bo.MenuBo;
import org.minpoint.muxige.system.core.pojo.entity.MenuEntity;
import org.minpoint.muxige.system.core.pojo.query.MenuQuery;
import org.minpoint.muxige.system.manager.MenuManager;
import org.springframework.stereotype.Service;

/*
 * @ClassName MenuManagerImpl
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/8 17:24
 */
@Service
public class MenuManagerImpl extends MuXiGeManagerImpl<MenuEntity, MenuBo, MenuQuery> implements MenuManager {
}
