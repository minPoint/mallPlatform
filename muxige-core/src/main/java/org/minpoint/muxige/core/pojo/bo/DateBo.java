package org.minpoint.muxige.core.pojo.bo;

import lombok.Getter;
import lombok.Setter;

/*
 * @ClassName DateBi
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/23 9:30
 */
@Getter
@Setter
public class DateBo extends BaseBo{

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 修改时间
     */
    private Long modifyTime;
}
