package org.minpoint.muxige.core.pojo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Getter;
import lombok.Setter;

/*
 * @ClassName DateEntity
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/8 17:07
 */
@Getter
@Setter
public class DateEntity extends BaseEntity{

    /**
     * 创建时间
     */
    @TableField( value = "create_time", fill = FieldFill.INSERT)
    private Long createTime;
    /**
     * 修改时间
     */
    @TableField( value = "modify_time", fill = FieldFill.UPDATE)
    private Long modifyTime;
}
