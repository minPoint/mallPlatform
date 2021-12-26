package org.minpoint.muxige.core.pojo.bo;

import lombok.Getter;
import lombok.Setter;

/*
 * @ClassName BaseBo
 * @Description Manager层数据传输Service层对象
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/5 13:42
 */
@Getter
@Setter
public class BaseBo {
    /**
     * db_id
     */
    private Integer dbId;
    /**
     * id
     */
    private String id;
}
