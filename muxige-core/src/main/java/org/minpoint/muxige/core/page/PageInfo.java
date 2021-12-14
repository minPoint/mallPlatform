package org.minpoint.muxige.core.page;

import lombok.Getter;
import lombok.Setter;

/*
 * @ClassName PageInfo
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/8 21:39
 */
@Getter
@Setter
public class PageInfo {
    /**
     * 总记录数
     */
    private long total;
    /**
     * 页大小
     */
    private long pageSize;
    /**
     * 当前页
     */
    private long pageNum;
    /**
     * 总页数
     */
    private long pages;

    public PageInfo(long total, long pageSize, long pageNum, long pages) {
        this.total =  total;
        this.pageSize =  pageSize;
        this.pageNum =  pageNum;
        this.pages =  pages;
    }
}
