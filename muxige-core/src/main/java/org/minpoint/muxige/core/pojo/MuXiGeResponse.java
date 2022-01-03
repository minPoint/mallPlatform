package org.minpoint.muxige.core.pojo;

import lombok.Getter;
import lombok.Setter;
import org.minpoint.muxige.base.constants.SystemConstants;

/*
 * @ClassName Result
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/18 18:20
 */
@Getter
@Setter
public class MuXiGeResponse {

    /**
     * 响应码
     */
    private int code;

    /**
     * 返回内容
     */
    private Object data;

    /**
     * 返回信息
     */
    private String message;
    /**
     * 错误信息（正常情况下不会返回）
     */
    private String errorMsg;

    /**
     * 耗时
     */
    private long costTime;

    private MuXiGeResponse(){

    }


    public static MuXiGeResponse create(Object data){
        MuXiGeResponse muXiGeResponse = new MuXiGeResponse();
        muXiGeResponse.setCode(SystemConstants.RESPONSE_SUCCESS.getCode());
        muXiGeResponse.setMessage(SystemConstants.RESPONSE_SUCCESS.getMsg());
        muXiGeResponse.setData(data);
        return muXiGeResponse;
    }

    public static MuXiGeResponse error(Object data){
        MuXiGeResponse muXiGeResponse = new MuXiGeResponse();
        muXiGeResponse.setCode(SystemConstants.RESPONSE_FAILED.getCode());
        muXiGeResponse.setMessage(SystemConstants.RESPONSE_SUCCESS.getMsg());
        muXiGeResponse.setData(data);
        return muXiGeResponse;
    }



}
