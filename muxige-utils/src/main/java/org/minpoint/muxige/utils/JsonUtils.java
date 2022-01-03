package org.minpoint.muxige.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.minpoint.muxige.base.exception.MuXiGeException;
import org.minpoint.muxige.base.exception.SystemStatusEnum;

import java.util.List;

/*
 * @ClassName JsonUtils
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/5 15:43
 */
@Slf4j
public class JsonUtils {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    // 通过该方法对mapper对象进行设置，所有序列化的对象都将按改规则进行系列化
    // Include.Include.ALWAYS 默认
    // Include.NON_DEFAULT 属性为默认值不序列化
    // Include.NON_EMPTY 属性为 空（""） 或者为 NULL 都不序列化，则返回的json是没有这个字段的。这样对移动端会更省流量
    // Include.NON_NULL 属性为NULL 不序列化
    static {
        // 对于空的对象转json的时候不抛出错误
        objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        // 允许属性名称没有引号
        objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        // 允许单引号
        objectMapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
        // 设置输入时忽略在json字符串中存在但在java对象实际没有的属性
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        // 设置输出时包含属性的风格,忽略null
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    /**
     * 序列化
     *
     * @param obj 对象
     * @return 字符串
     */
    public static String toJson(@NonNull Object obj) {
        // 尝试转成String
        try {
            return objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            log.error("Json转换异常：。", new MuXiGeException(SystemStatusEnum.OBJ_TRANSFORM_ERROR));
        }
        // 如果转换出错，则返回null
        return null;
    }


    /**
     * 反序列化
     *
     * @param json json字符串
     * @param cls  转换的类
     * @param <T>  泛型
     * @return 转换对象
     */
    public static <T> T toObject(@NonNull String json, Class<T> cls) {
        try {
            return objectMapper.readValue(json, cls);
        } catch (Exception e) {
            log.error("Json转换异常。", new MuXiGeException(SystemStatusEnum.OBJ_TRANSFORM_ERROR));
        }
        return null;
    }

    /**
     * 反序列化
     *
     * @param obj json字符串
     * @param cls  转换的类
     * @param <T>  泛型
     * @return 转换对象
     */
    public static <T> List<T> listToList(@NonNull Object obj, Class<T> cls) {
        try {
            JavaType javaType = objectMapper.getTypeFactory().constructParametricType(List.class, cls);
            String json = JsonUtils.toJson(obj);
            return objectMapper.readValue(json, javaType);
        } catch (Exception e) {
            log.error("Json转换异常。", new MuXiGeException(SystemStatusEnum.OBJ_TRANSFORM_ERROR));
        }
        return null;
    }

}
