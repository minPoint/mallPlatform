package org.minpoint.muxige.system.core.pojo.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import org.minpoint.muxige.core.pojo.BaseEntity;
import org.minpoint.muxige.core.pojo.DateEntity;

/*
 * @ClassName MenuEntity
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/8 16:17
 */
@Getter
@Setter
@TableName(value = "menu_info", schema = "mxg_system_center")
public class MenuEntity extends DateEntity {
    /**
     * 页面名称
     */
    @TableField( value = "name")
    private String name;
    /**
     * 路径
     */
    @TableField( value = "path")
    private String path;
    /**
     * 图标
     */
    @TableField( value = "icon")
    private String icon;
    /**
     * 父级菜单
     */
    @TableField( value = "parent_id")
    private String parentId;
    /**
     * 组件
     */
    @TableField( value = "component")
    private String component;
    /**
     * 状态
     */
    @TableField( value = "status")
    private Integer status;
}
