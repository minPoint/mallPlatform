package org.minpoint.muxige.core.mybatis.constants;

/*
 * @ClassName SqlScriptConstants
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/25 20:38
 */
public enum SqlScriptConstants {

    WHERE_START("<where>"),

    WHERE_END("</where>"),

    IF_COMMON("<if test=\" %s != null and %s != ''\">"),

    COMMON_CONDITION("AND %s = #{%s}"),

    IF_COLLECTION("<if test=\"%s != null and %s.size > \">"),

    COLLECTION_CONDITION_START("AND %s IN "),

    FOR_EACH("<foreach collection=\"%s\" item=\"prop\" index=\"inx\" open=\"(\" separator=\",\" close=\")\">#{prop}</foreach>"),

    IF_END("</if>"),

    ;
    private final String script;

    SqlScriptConstants(String script) {
        this.script = script;
    }

    public String getScript() {
        return script;
    }
}
