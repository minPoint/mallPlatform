package org.minpoint.muxige.store.core.pojo.query;

import lombok.Getter;
import lombok.Setter;
import org.minpoint.muxige.core.mybatis.anno.Logic;
import org.minpoint.muxige.core.mybatis.anno.QueryField;
import org.minpoint.muxige.core.pojo.BaseModel;

/*
 * @ClassName MallModel
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/25 17:55
 */
@Getter
@Setter
@Logic
public class MallModel extends BaseModel {
    /**
     * 门店名称
     */
    @QueryField()
    private String name;

    /**
     * 审核状态
     */
    @QueryField()
    private Integer checkStatus;

    /**
     * 编码
     */
    @QueryField()
    private String code;



}
