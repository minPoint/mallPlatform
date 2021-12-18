package org.minpoint.muxige.core.constants;

/*
 * @ClassName SystemConstants
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/18 18:25
 */
public enum SystemConstants {

    RESPONSE_SUCCESS(0, "响应成功"),

    RESPONSE_FAILED(-1, "响应失败，请联系管理员"),

    ;


    private int code;
    private String msg;

    SystemConstants(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
