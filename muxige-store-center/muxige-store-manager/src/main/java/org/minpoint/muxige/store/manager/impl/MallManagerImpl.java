package org.minpoint.muxige.store.manager.impl;

import org.minpoint.muxige.core.manager.impl.MuXiGeManagerImpl;
import org.minpoint.muxige.store.core.mapper.MallMapper;
import org.minpoint.muxige.store.core.pojo.bo.MallBo;
import org.minpoint.muxige.store.core.pojo.entity.MallEntity;
import org.minpoint.muxige.store.core.pojo.query.MallModel;
import org.minpoint.muxige.store.core.pojo.query.MallQuery;
import org.minpoint.muxige.store.manager.MallManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/*
 * @ClassName MallManagerImpl
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/23 20:12
 */
@Service
public class MallManagerImpl extends MuXiGeManagerImpl<MallEntity, MallBo, MallModel>  implements MallManager{

    private MallMapper mapper;

    @Autowired
    public MallManagerImpl(MallMapper mapper) {
        this.mapper = mapper;
    }

}
