package org.minpoint.muxige.core.manager;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import org.minpoint.muxige.core.pojo.BaseBo;
import org.minpoint.muxige.core.pojo.BaseEntity;
import org.minpoint.muxige.core.pojo.BaseQuery;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/*
 * @ClassName MuXiGeManager
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/5 14:09
 */
public interface MuXiGeManager<T extends BaseEntity, B extends BaseBo, Q extends BaseQuery> {

    int insert(T entity);

    int deleteById(Serializable id);

    int deleteByMap(Map<String, Object> columnMap);

    int delete(Wrapper<T> wrapper);

    int deleteBatchIds(Collection<? extends Serializable> idList);

    int updateById(T entity);

    int update( T entity, Wrapper<T> updateWrapper);

    T selectById(Serializable id);

    List<T> selectBatchIds(Collection<? extends Serializable> idList);

    T selectOne(Wrapper<T> queryWrapper);

    List<T> selectByMap(Map<String, Object> columnMap);

    Integer selectCount(Wrapper<T> queryWrapper);

    List<T> selectList(Wrapper<T> queryWrapper);

    List<B> listPaging(Q query);
}
