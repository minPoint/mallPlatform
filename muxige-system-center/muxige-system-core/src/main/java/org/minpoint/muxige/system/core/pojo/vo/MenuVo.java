package org.minpoint.muxige.system.core.pojo.vo;

import lombok.Getter;
import lombok.Setter;
import org.minpoint.muxige.core.pojo.vo.BaseVo;

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
     * router名称
     */
    private String name;
    /**
     * 标题
     */
    private String title;
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
     * 登记
     */
    private Integer level;
    /**
     * 是否主页
     */
    private Integer homePage;
    /**
     * 子集菜单
     */
    private List<MenuVo> sonMenuList;
}
