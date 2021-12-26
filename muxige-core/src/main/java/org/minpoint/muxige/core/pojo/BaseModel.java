package org.minpoint.muxige.core.pojo;

import lombok.Getter;
import lombok.Setter;
import org.minpoint.muxige.core.constants.LogicConstants;

/*
 * @ClassName BaseModel
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/25 17:55
 */
@Getter
@Setter
public class BaseModel {

    /**
     *是否分页
     */
    private boolean paging = true;
    /**
     * 查询页数
     */
    private int pageNum = 1;
    /**
     * 查询个数
     */
    private int pageSize = 10;
    /**
     * 状态，默认为1：存在
     */
    private int deleted = LogicConstants.LOGIC_EXISTENCE;
    /**
     * id
     */
    private String id;
    /**
     * 创建时间
     */
    private Long createTime;
    /**
     * 修改时间
     */
    private Long modifyTime;
}
