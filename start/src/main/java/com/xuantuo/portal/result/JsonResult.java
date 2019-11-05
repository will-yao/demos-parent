package com.xuantuo.portal.result;

import java.io.Serializable;
import java.net.Inet4Address;
import java.net.UnknownHostException;

/**
 * @Author:xuantuo
 * @Date: Created on 2019/11/5
 **/
public class JsonResult<T> implements Serializable {
    private static final long serialVersionUID = 1832911953365828366L;

    private static String staticIp;

    static {
        try {
            if (staticIp == null) {
                staticIp = Inet4Address.getLocalHost().getHostAddress();
            }
        } catch (UnknownHostException e) {
            //e.printStackTrace();
        }
    }

    private T data;

    private boolean success = true;

    private String errCode;

    private String errMsg;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public static <T> JsonResult<T> newResult(boolean success) {
        JsonResult<T> result = new JsonResult<T>();
        result.success = success;
        return result;
    }

    public static <T> JsonResult<T> newResult() {
        return new JsonResult<T>();
    }

    public static <T> JsonResult<T> error() {
        JsonResult<T> result = new JsonResult<T>();
        result.success = false;
        return result;
    }

    public static <T> JsonResult<T> error(String message) {
        JsonResult<T> result = new JsonResult<T>();
        result.errMsg = message;
        result.success = false;
        return result;
    }

}
