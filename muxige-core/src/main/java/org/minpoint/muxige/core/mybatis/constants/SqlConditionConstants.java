package org.minpoint.muxige.core.mybatis.constants;

import cn.hutool.core.collection.CollUtil;

import java.util.List;

/*
 * @ClassName SqlConditionConstants
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/25 21:14
 */
public class SqlConditionConstants {
    private SqlConditionConstants() {}

    public static class SqlType{
        private SqlType() {}
        public static final List<String> NUM = CollUtil.newArrayList(
                "short","java.lang.Short",
                "int","class java.lang.Integer",
                "long","class java.lang.Long",
                "float","class java.lang.Float",
                "double","class java.lang.Double"
                );
        public static final List<String> STRING = CollUtil.newArrayList(
                "char","java.lang.Character",
                "java.lang.String"
        );
    }

}
