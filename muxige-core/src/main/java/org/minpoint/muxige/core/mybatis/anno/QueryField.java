package org.minpoint.muxige.core.mybatis.anno;

import java.lang.annotation.*;

/*
 * @ClassName QueryField
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/25 19:23
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.ANNOTATION_TYPE})
public @interface QueryField {

    String value() default "";


}
