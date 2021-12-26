package org.minpoint.muxige.store.service;

import org.minpoint.muxige.core.page.ListData;
import org.minpoint.muxige.store.core.pojo.bo.MallBo;
import org.minpoint.muxige.store.core.pojo.query.MallQuery;

/*
 * @ClassName MallService
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/23 20:19
 */
public interface MallService {
    /**
     * @Author BabyBlackSkin
     * @Description 新增门店信息
     * @Date 22:45 2021/12/23
     * @Param [query]
     * @return int
     **/
    int add(MallQuery query);
    
    /**
     * @Author BabyBlackSkin
     * @Description 查询门店信息
     * @Date 20:20 2021/12/23
     * @Param [query]
     * @return java.util.List<org.minpoint.muxige.store.core.pojo.bo.MallBo>
     **/
    ListData<MallBo> listInfo(MallQuery query);
}
