package org.minpoint.muxige.system.service.util;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.stream.CollectorUtil;
import cn.hutool.core.util.StrUtil;
import org.minpoint.muxige.system.core.pojo.bo.MenuBo;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * @ClassName MenuUtils
 * @Description 菜单工具类
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/8 22:00
 */
public class MenuUtils {

    /**
     * @return java.util.List<org.minpoint.muxige.system.core.pojo.bo.MenuBo>
     * @Author BabyBlackSkin
     * @Description //TODO 生成菜单树
     * @Date 23:11 2021/12/8
     * @Param [menuBoList]
     **/
    public static List<MenuBo> getMenuTree(List<MenuBo> menuBoList, int level) {
        if (CollectionUtil.isEmpty(menuBoList)) {
            return null;
        }
        // 菜单
        List<MenuBo> levelMatchMenuList = menuBoList.stream().filter(e -> level == e.getLevel()).collect(Collectors.toList());
        // 次级菜单
        Map<Integer, Map<String, List<MenuBo>>> collect = menuBoList.stream().filter(e -> level != e.getLevel()).collect(Collectors.groupingBy(e -> e.getLevel(), Collectors.groupingBy(e -> e.getParentId())));
        // 生成tree
        return fullTree(levelMatchMenuList, collect, level + 1);
    }

    /**
     * @return java.util.List<org.minpoint.muxige.system.core.pojo.bo.MenuBo>
     * @Author BabyBlackSkin
     * @Description //TODO 填充菜单树
     * @Date 23:10 2021/12/8
     * @Param [fatherMenu, sonMap]
     **/
    public static List<MenuBo> fullTree(List<MenuBo> fatherMenu, Map<Integer, Map<String, List<MenuBo>>> notMatchList, int level) {
        // 先获取等级相等的集合
        Map<String, List<MenuBo>> levelMatchList = notMatchList.remove(level);
        if (CollUtil.isEmpty(levelMatchList)) {
            return fatherMenu;
        }
        for(MenuBo menu : fatherMenu){
            // 子菜单
            List<MenuBo> menuBoList = levelMatchList.get(menu.getId());
            fullTree(menuBoList, notMatchList, level+1);
            menu.setSonMenuList(menuBoList);
        }
        return fatherMenu;
    }

}
