package org.minpoint.muxige.core.page;


import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import lombok.Getter;
import lombok.Setter;
import org.minpoint.muxige.core.util.JsonUtils;

import java.util.List;

/*
 * @ClassName ListData
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/8 21:38
 */
@Getter
@Setter
public class ListData<T>{

    private List<T> list;

    private PageInfo pageInfo;

    public static <T> ListData<T> setData(List list, Class<T> tClass){
        ListData<T> listData = new ListData<>();
        if(list instanceof Page){
            Page<T> page = (Page<T>) list;
            listData.setPageInfo(new PageInfo(page.getTotal(), page.getPageSize(), page.getPageNum(), page.getPages()));
        }
        listData.setList(JsonUtils.listToList(list, tClass));
        return listData;
    }

    public static <T> ListData<T> setData(List list){
        ListData<T> listData = new ListData<>();
        if(list instanceof Page){
            Page<T> page = (Page<T>) list;
            listData.setPageInfo(new PageInfo(page.getTotal(), page.getPageSize(), page.getPageNum(), page.getPages()));
        }
        listData.setList(list);
        return listData;
    }

}
