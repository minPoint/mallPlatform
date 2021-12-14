package org.minpoint.muxige.system.service;

import org.minpoint.muxige.core.page.ListData;
import org.minpoint.muxige.system.core.pojo.bo.MenuBo;
import org.minpoint.muxige.system.core.pojo.query.MenuQuery;
import org.minpoint.muxige.system.core.pojo.vo.MenuVo;

import java.util.List;

/*
 * @ClassName MenuService
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/8 17:38
 */
public interface MenuService {
    /**
     * @Author BabyBlackSkin
     * @Description //TODO 新增菜单
     * @Date 23:28 2021/12/8
     * @Param [menuBo]
     * @return int
     **/
    int addMenu(MenuBo menuBo);

    /**
     * @Author BabyBlackSkin
     * @Description //TODO 查询菜单配置，并以树形结构返回
     * @Date 21:49 2021/12/8
     * @Param [query] 查询模板
     * @return java.util.List<org.minpoint.muxige.system.core.pojo.bo.MenuBo>
     **/
    List<MenuVo> listMenuVoTree(MenuQuery query);
}
