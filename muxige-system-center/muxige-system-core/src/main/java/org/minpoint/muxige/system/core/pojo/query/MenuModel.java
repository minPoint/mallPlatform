package org.minpoint.muxige.system.core.pojo.query;

import lombok.Getter;
import lombok.Setter;
import org.minpoint.muxige.core.mybatis.anno.QueryField;
import org.minpoint.muxige.core.pojo.BaseModel;

/*
 * @ClassName MenuModel
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/25 17:56
 */
@Getter
@Setter
public class MenuModel extends BaseModel {

    /**
     * router名称
     */
    @QueryField
    private String name;
    /**
     * 标题
     */
    @QueryField
    private String title;
    /**
     * 父级菜单ID
     */
    @QueryField( value = "parent_id")
    private String parentId;
    /**
     * 组件
     */
    @QueryField
    private String component;
    /**
     * 登记
     */
    @QueryField
    private Integer level;
    /**
     * 是否主页
     */
    @QueryField
    private Integer homePage;
}
