package org.minpoint.muxige.core.pojo;

import lombok.Getter;
import lombok.Setter;
import org.minpoint.muxige.core.constants.SystemConstants;

/*
 * @ClassName Result
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/18 18:20
 */
@Getter
@Setter
public class Result {

    /**
     * 响应码
     */
    private int code;

    /**
     * 返回内容
     */
    private Object content;

    /**
     * 返回信息
     */
    private String message;
    /**
     * 错误信息（正常情况下不会返回）
     */
    private String errorMsg;


    public static Result set(Object content){
        Result result = new Result();
        result.setCode(SystemConstants.RESPONSE_SUCCESS.getCode());
        result.setMessage(SystemConstants.RESPONSE_SUCCESS.getMsg());
        result.setContent(content);
        return result;
    }

}
