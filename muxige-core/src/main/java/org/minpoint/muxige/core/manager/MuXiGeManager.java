package org.minpoint.muxige.core.manager;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import org.minpoint.muxige.core.pojo.BaseModel;
import org.minpoint.muxige.core.pojo.bo.BaseBo;
import org.minpoint.muxige.core.pojo.entity.BaseEntity;
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
public interface MuXiGeManager<T extends BaseEntity, B extends BaseBo, M extends BaseModel> {

    int insert(T entity);

    int deleteById(Serializable id);

    int deleteByMap(Map<String, Object> columnMap);

    int delete(Wrapper<T> wrapper);

    int deleteBatchIds(Collection<? extends Serializable> idList);

    int updateById(T entity);

    int update( T entity, Wrapper<T> updateWrapper);

    T getById(Serializable id);

    List<T> listBatchIds(Collection<? extends Serializable> idList);

    T getOne(Wrapper<T> queryWrapper);

    List<T> listByMap(Map<String, Object> columnMap);

    Integer getCount(Wrapper<T> queryWrapper);

    List<T> listPaging(Wrapper<T> queryWrapper);

    List<B> listPaging(M model);
}
