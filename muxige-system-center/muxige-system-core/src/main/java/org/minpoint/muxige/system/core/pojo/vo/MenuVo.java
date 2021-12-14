package org.minpoint.muxige.system.core.pojo.vo;

import lombok.Getter;
import lombok.Setter;
import org.minpoint.muxige.core.pojo.BaseVo;

import java.util.List;

/*
 * @ClassName MenuVo
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/8 17:06
 */
@Getter
@Setter
public class MenuVo extends BaseVo {
    /**
     * 页面名称
     */
    private String name;
    /**
     * 路径
     */
    private String path;
    /**
     * 图标
     */
    private String icon;
    /**
     * 父级菜单ID
     */
    private String parentId;
    /**
     * 组件
     */
    private String component;
    /**
     * 子集菜单
     */
    private List<MenuVo> sonMenuList;
}
