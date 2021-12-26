package org.minpoint.muxige.core.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Getter;
import lombok.Setter;

/*
 * @ClassName LogicEntity
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/23 9:26
 */
@Getter
@Setter
public class LogicEntity extends DateEntity{
    /**
     * 状态
     */
    @TableField( value = "deleted")
    @TableLogic
    private Integer deleted;
}
