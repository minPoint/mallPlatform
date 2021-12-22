package org.minpoint.muxige.system.service;

import org.minpoint.muxige.core.page.ListData;
import org.minpoint.muxige.system.core.pojo.bo.MenuBo;
import org.minpoint.muxige.system.core.pojo.query.MenuQuery;
import org.minpoint.muxige.system.core.pojo.vo.MenuVo;

import java.awt.*;
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
     * @Description  新增菜单
     * @Date 23:28 2021/12/8
     * @Param [menuBo]
     * @return int
     **/
    int addMenu(MenuBo menuBo);
    
    /**
     * @Author BabyBlackSkin
     * @Description  根据id删除 菜单
     * @Date 0:34 2021/12/18
     * @Param [id]
     * @return int
     **/
    int delMenu(String id);

    /**
     * @Author BabyBlackSkin
     * @Description  查询菜单配置，并以树形结构返回
     * @Date 21:49 2021/12/8
     * @Param [query] 查询模板
     * @return java.util.List<org.minpoint.muxige.system.core.pojo.bo.MenuBo>
     **/
    List<MenuBo> listMenuVoTree(MenuQuery query);

    /**
     * 查询菜单
     * @param query 查询模板
     * @return 集合
     */
    ListData<MenuBo> listMenu(MenuQuery query);
}
