package org.minpoint.muxige.core.mybatis;

/*
 * @ClassName CommonSql
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/25 15:51
 */
public enum CommonSql {

    LIST_PAGING("SELECT","通用分页查询", "<script> SELECT %s FROM %s %s </script>"),

    ;

    CommonSql(String method, String desc, String sql) {
        this.method = method;
        this.desc = desc;
        this.sql = sql;
    }

    private final String method;
    private final String desc;
    private final String sql;

    public String getMethod() {
        return method;
    }

    public String getDesc() {
        return desc;
    }

    public String getSql() {
        return sql;
    }
}
