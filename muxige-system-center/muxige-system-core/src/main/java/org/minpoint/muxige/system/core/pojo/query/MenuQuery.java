package org.minpoint.muxige.system.core.pojo.query;

import lombok.Getter;
import lombok.Setter;
import org.minpoint.muxige.core.pojo.BaseQuery;

/*
 * @ClassName MenuQuery
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/8 17:21
 */
@Getter
@Setter
public class MenuQuery extends BaseQuery {

    /**
     * router名称
     */
    private String name;
    /**
     * 标题
     */
    private String title;
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
}
