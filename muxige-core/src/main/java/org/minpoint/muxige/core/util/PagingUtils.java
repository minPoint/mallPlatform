package org.minpoint.muxige.core.util;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.minpoint.muxige.core.pojo.BaseQuery;

/*
 * @ClassName PagingUtils
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/18 11:42
 */
public class PagingUtils {

    /**
     * @Author BabyBlackSkin
     * @Description //TODO 默认分页，每次查询1000条
     * @Date 11:44 2021/12/18
     * @Param []
     * @return void
     **/
    public static void defaultPaging(){
        PageHelper.startPage(1, 1000);
    }

    /**
     * @Author BabyBlackSkin
     * @Description //TODO  自动分页，按照入参分页，如果入参没有分页则默认分页
     * @Date 11:44 2021/12/18
     * @Param
     * @return
     **/
    public static void autoPaging(BaseQuery query){
        if(query.isPaging()){
            PageHelper.startPage(query.getPageNum(), query.getPageSize());
        }else{
            defaultPaging();
        }
    }
}
