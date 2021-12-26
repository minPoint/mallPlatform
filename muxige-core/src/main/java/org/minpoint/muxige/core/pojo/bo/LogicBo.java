package org.minpoint.muxige.core.pojo.bo;

import lombok.Getter;
import lombok.Setter;

/*
 * @ClassName LogicBo
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/23 9:33
 */
@Getter
@Setter
public class LogicBo extends DateBo{
    /**
     * 逻辑删除
     */
    private Integer deleted;
}
