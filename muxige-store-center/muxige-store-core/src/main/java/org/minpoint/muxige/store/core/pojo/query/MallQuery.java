package org.minpoint.muxige.store.core.pojo.query;

import lombok.Getter;
import lombok.Setter;
import org.minpoint.muxige.core.pojo.BaseQuery;

/*
 * @ClassName MallQuery
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/23 20:09
 */
@Getter
@Setter
public class MallQuery extends BaseQuery {
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
