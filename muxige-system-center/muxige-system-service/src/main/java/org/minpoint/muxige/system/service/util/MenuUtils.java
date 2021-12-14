package org.minpoint.muxige.system.service.util;

import cn.hutool.core.collection.CollectionUtil;
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
     * @Author BabyBlackSkin
     * @Description //TODO 生成菜单树
     * @Date 23:11 2021/12/8
     * @Param [menuBoList]
     * @return java.util.List<org.minpoint.muxige.system.core.pojo.bo.MenuBo>
     **/
    public static List<MenuBo> getMenuTree(List<MenuBo> menuBoList) {
        if (CollectionUtil.isEmpty(menuBoList)) {
            return null;
        }
        // 顶级菜单
        List<MenuBo> topMenuList = menuBoList.stream().filter(e -> StrUtil.isEmpty(e.getParentId())).collect(Collectors.toList());
        // 非顶级菜单
        Map<String, List<MenuBo>> sonMap = menuBoList.stream().filter(e -> StrUtil.isNotEmpty(e.getParentId())).collect(Collectors.groupingBy(e -> e.getParentId()));
        // 生成tree
        return fullTree(topMenuList, sonMap);
    }

    /**
     * @Author BabyBlackSkin
     * @Description //TODO 填充菜单树
     * @Date 23:10 2021/12/8
     * @Param [fatherMenu, sonMap]
     * @return java.util.List<org.minpoint.muxige.system.core.pojo.bo.MenuBo>
     **/
    public static List<MenuBo> fullTree(List<MenuBo> fatherMenu, Map<String, List<MenuBo>> sonMap) {
        if (CollectionUtil.isEmpty(fatherMenu)) {
            return null;
        }
        if (CollectionUtil.isEmpty(sonMap)) {
            return fatherMenu;
        }
        for (MenuBo father : fatherMenu) {
            List<MenuBo> sonList = sonMap.remove(father.getId());
            if (CollectionUtil.isEmpty(sonList)) {
                continue;
            }
            fullTree(sonList, sonMap);
            father.setSonMenuList(sonList);
        }
        return fatherMenu;
    }

}
