package org.minpoint.muxige.core.mybatis.anno;

import java.lang.annotation.*;

/*
 * @ClassName Logic
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2022/1/8 23:26
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface Logic {

    /**
     * 默认需要逻辑删除字段
     * @return 0 查询未删除的
     */
    int value() default 0;
}
