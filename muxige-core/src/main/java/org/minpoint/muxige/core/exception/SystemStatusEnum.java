package org.minpoint.muxige.core.exception;

/*
 * @ClassName ErrorEnum
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/5 14:25
 */
public enum SystemStatusEnum implements ConstantsEnumInterface{


    SYSTEM_ERROR_SUCCESS(0x7FFFFFFF, "系统繁忙，请稍后再试"),
    SYSTEM_SUCCESS(0x00000001, "响应成功"),
    NULL_ERROR(0x00000100, "对象为NULL"),
    OBJ_TRANSFORM_ERROR(0x00000101, "对象转换失败"),

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
