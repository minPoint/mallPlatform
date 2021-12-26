package org.minpoint.muxige.store.core.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import org.minpoint.muxige.core.pojo.entity.LogicEntity;

/*
 * @ClassName MallEntity
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/5 16:20
 */
@Getter
@Setter
@TableName(value = "mall_info", schema = "mxg_store_center")
public class MallEntity extends LogicEntity {

    @TableField( value = "name" )
    private String name;

    @TableField( value = "check_status" )
    private Integer checkStatus;

    @TableField( value = "code" )
    private String code;

}
