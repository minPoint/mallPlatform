package org.minpoint.muxige.core.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Getter;
import lombok.Setter;

/*
 * @ClassName BaseEntity
 * @Description 实体类
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/5 13:41
 */
@Getter
@Setter
public class BaseEntity {

    private Integer dbId;


    @TableField("id")
    @TableId(type = IdType.ASSIGN_UUID)
    private String id;
}
