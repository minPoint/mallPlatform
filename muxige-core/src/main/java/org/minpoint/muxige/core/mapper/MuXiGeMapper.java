package org.minpoint.muxige.core.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.minpoint.muxige.core.pojo.BaseModel;
import org.minpoint.muxige.core.pojo.bo.BaseBo;
import org.minpoint.muxige.core.pojo.entity.BaseEntity;
import org.minpoint.muxige.core.pojo.BaseQuery;

import java.util.List;

/*
 * @ClassName MuXiGeMapper
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/5 14:07
 */
public interface MuXiGeMapper<T extends BaseEntity,B extends BaseBo, M extends BaseModel>  extends BaseMapper<T> {

    List<B> listPaging(M query);
}
