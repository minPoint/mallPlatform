package org.minpoint.muxige.store.core.pojo.vo;

import lombok.Getter;
import lombok.Setter;
import org.minpoint.muxige.core.pojo.vo.LogicVo;

/*
 * @ClassName MallVo
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/23 20:10
 */
@Getter
@Setter
public class MallVo extends LogicVo {
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
