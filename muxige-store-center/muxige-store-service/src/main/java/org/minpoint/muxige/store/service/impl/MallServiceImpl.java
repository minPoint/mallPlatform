package org.minpoint.muxige.store.service.impl;

import cn.hutool.core.bean.BeanUtil;
import org.minpoint.muxige.store.service.MallService;
import org.minpoint.muxige.core.page.ListData;
import org.minpoint.muxige.core.utils.BaseConvert;
import org.minpoint.muxige.store.core.pojo.bo.MallBo;
import org.minpoint.muxige.store.core.pojo.entity.MallEntity;
import org.minpoint.muxige.store.core.pojo.query.MallModel;
import org.minpoint.muxige.store.core.pojo.query.MallQuery;
import org.minpoint.muxige.store.manager.MallManager;
import org.minpoint.muxige.store.service.constants.MallConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * @ClassName MallServiceImpl
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/23 20:20
 */
@Service
public class MallServiceImpl implements MallService {

    private MallManager mallManager;

    @Autowired
    public MallServiceImpl(MallManager mallManager) {
        this.mallManager = mallManager;
    }

    @Override
    public int add(MallQuery query) {
        MallEntity entity = BeanUtil.copyProperties(query, MallEntity.class);
        entity.setAuditStatus(MallConstants.AUDIT_STATUS.APPROVED);
        return mallManager.insert(entity);
    }

    @Override
    public ListData<MallBo> listInfo(MallQuery query) {
        List<MallBo> mallBoList = this.mallManager.listPaging(BaseConvert.convertQueryToModel(query, MallModel.class));
        return ListData.create(mallBoList);
    }
}
