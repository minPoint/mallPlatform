package org.minpoint.muxige.system.service.constants;

import org.minpoint.muxige.core.exception.ConstantsEnumInterface;

/*
 * @ClassName MenuConstants
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/8 23:24
 */
public enum MenuConstantseNum implements ConstantsEnumInterface {

    INSERT_FAILED(0x0001,"新增失败"),

    ;

    private int code;

    private String msg;

    MenuConstantseNum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public int getCode() {
        return this.code;
    }

    @Override
    public String getMsg() {
        return this.msg;
    }
}
