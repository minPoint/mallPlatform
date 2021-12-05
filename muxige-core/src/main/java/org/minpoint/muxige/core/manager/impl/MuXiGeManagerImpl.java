package org.minpoint.muxige.core.manager.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import org.minpoint.muxige.core.manager.MuXiGeManager;
import org.minpoint.muxige.core.mapper.MuXiGeMapper;
import org.minpoint.muxige.core.pojo.BaseBo;
import org.minpoint.muxige.core.pojo.BaseEntity;
import org.minpoint.muxige.core.pojo.BaseQuery;
import org.minpoint.muxige.core.util.JsonUtils;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/*
 * @ClassName MuXiGeManagerImpl
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/5 14:10
 */
public class MuXiGeManagerImpl<T extends BaseEntity, B extends BaseBo, Q extends BaseQuery> implements MuXiGeManager<T, B, Q> {

    private MuXiGeMapper<T, B, Q> mapper;

    public MuXiGeManagerImpl(MuXiGeMapper<T, B, Q> mapper) {
        this.mapper = mapper;
    }

    @Override
    public int insert(T entity) {
        return mapper.insert(entity);
    }

    @Override
    public int deleteById(Serializable id) {
        return mapper.deleteById(id);
    }

    @Override
    public int delete(Wrapper<T> wrapper) {
        return mapper.deleteById(wrapper);
    }

    @Override
    public int deleteBatchIds(Collection<? extends Serializable> idList) {
        return mapper.deleteBatchIds(idList);
    }

    @Override
    public int updateById(T entity) {
        return mapper.updateById(entity);
    }

    @Override
    public int update(T entity, Wrapper<T> updateWrapper) {
        return mapper.update(entity, updateWrapper);
    }

    @Override
    public B selectById(Serializable id) {
        T entity = mapper.selectById(id);
        return (B) JsonUtils.toObject(entity, BaseBo.class);
    }

    @Override
    public List<B> selectBatchIds(Collection<? extends Serializable> idList) {
        List<T> entityList = mapper.selectBatchIds(idList);
        return (List<B>) JsonUtils.toObject(entityList, BaseBo.class);
    }

    @Override
    public B selectOne(Wrapper<T> queryWrapper) {
        T entity = mapper.selectOne(queryWrapper);
        return (B) JsonUtils.toObject(entity, BaseBo.class);
    }

    @Override
    public Integer selectCount(Wrapper<T> queryWrapper) {
        return mapper.selectCount(queryWrapper);
    }

    @Override
    public List<B> selectList(Wrapper<T> queryWrapper) {
        List<T> entityList = mapper.selectList(queryWrapper);
        return (List<B>) JsonUtils.toObject(entityList, BaseBo.class);
    }

    @Override
    public List<B> listPaging(Q query) {
        return mapper.listPaging(query);
    }
}
