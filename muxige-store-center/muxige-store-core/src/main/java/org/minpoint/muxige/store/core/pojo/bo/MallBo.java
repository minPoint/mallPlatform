package org.minpoint.muxige.store.core.pojo.bo;

import lombok.Getter;
import lombok.Setter;
import org.minpoint.muxige.core.pojo.bo.LogicBo;
import org.minpoint.muxige.core.pojo.entity.LogicEntity;

/*
 * @ClassName MallEntity
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/23 20:06
 */
@Getter
@Setter
public class MallBo extends LogicBo {
    /**
     * 门店名称
     */
    private String name;

    /**
     * 审核状态
     */
    private Integer checkStatus;

    /**
     * 编码
     */
    private String code;
}
