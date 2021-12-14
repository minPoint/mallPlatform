package org.minpoint.muxige.core.manager.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import org.minpoint.muxige.core.manager.MuXiGeManager;
import org.minpoint.muxige.core.mapper.MuXiGeMapper;
import org.minpoint.muxige.core.pojo.BaseBo;
import org.minpoint.muxige.core.pojo.BaseEntity;
import org.minpoint.muxige.core.pojo.BaseQuery;
import org.minpoint.muxige.core.util.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;

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

    @Autowired
    private MuXiGeMapper<T, B, Q> mapper;

    @Override
    public int insert(T entity) {
        return mapper.insert(entity);
    }

    @Override
    public int deleteById(Serializable id) {
        return mapper.deleteById(id);
    }

    @Override
    public int deleteByMap(Map<String, Object> columnMap) {
        return mapper.deleteByMap(columnMap);
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
    public T selectById(Serializable id) {
        return mapper.selectById(id);
    }

    @Override
    public List<T> selectBatchIds(Collection<? extends Serializable> idList) {
        return mapper.selectBatchIds(idList);
    }

    @Override
    public T selectOne(Wrapper<T> queryWrapper) {
        return mapper.selectOne(queryWrapper);
    }

    @Override
    public List<T> selectByMap(Map<String, Object> columnMap) {
        return mapper.selectByMap(columnMap);
    }

    @Override
    public Integer selectCount(Wrapper<T> queryWrapper) {
        return mapper.selectCount(queryWrapper);
    }

    @Override
    public List<T> selectList(Wrapper<T> queryWrapper) {
        return mapper.selectList(queryWrapper);
    }

    @Override
    public List<B> listPaging(Q query) {
        return mapper.listPaging(query);
    }
}
