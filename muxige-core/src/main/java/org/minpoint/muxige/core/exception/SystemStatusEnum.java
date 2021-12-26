package org.minpoint.muxige.core.exception;

/*
 * @ClassName ErrorEnum
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/5 14:25
 */
public enum SystemStatusEnum implements ConstantsEnumInterface{


    SYSTEM_ERROR_SUCCESS(-1, "系统繁忙，请稍后再试"),
    SYSTEM_SUCCESS(1, "响应成功"),
    INIT_ERROR(101, "系统初始化异常"),
    NULL_ERROR(1001, "对象为NULL"),
    OBJ_TRANSFORM_ERROR(1002, "对象转换失败"),
    QUERY_COPY_MODEL_ERROR(1003, "Query对象不能拷贝到非Model对象上"),

    ;

    private final int errorCode;

    private final String errorMsg;

    SystemStatusEnum(int errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    @Override
    public int getCode() {
        return this.errorCode;
    }

    @Override
    public String getMsg() {
        return this.errorMsg;
    }

    @Override
    public String toString() {
        return String.format("[%s]%s", this.errorCode,this.errorMsg);
    }
}
