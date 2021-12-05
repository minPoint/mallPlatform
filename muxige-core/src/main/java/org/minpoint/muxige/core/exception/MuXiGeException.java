package org.minpoint.muxige.core.exception;

import lombok.Getter;
import lombok.Setter;

/*
 * @ClassName MuXiGeException
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/5 14:22
 */
@Getter
@Setter
public class MuXiGeException extends RuntimeException{

    private int errorCode;
    private String errorMsg;

    public MuXiGeException(int errorCode, String errorMsg) {
        super(errorMsg);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public MuXiGeException(Throwable cause, int errorCode, String errorMsg) {
        super(errorMsg, cause);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public MuXiGeException(SystemStatusEnum systemStatusEnum) {
        super(systemStatusEnum.toString());
        this.errorCode = systemStatusEnum.getCode();
        this.errorMsg = systemStatusEnum.getMsg();
    }
}
