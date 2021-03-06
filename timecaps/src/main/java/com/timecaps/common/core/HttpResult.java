package com.timecaps.common.core;

import com.timecaps.common.exception.ErrorCode;
import com.timecaps.common.exception.ErrorPropertiesUtils;

import java.io.Serializable;

/**
 * Created by yuanqiang on 2018/3/1.
 */


public class HttpResult<T> {

    /**
     * 响应码，与http的状态码一致, code = 200表示成功.
     */
    private int code = 200;
    private String msg;
    private T data;

    public HttpResult() {
    }

    public HttpResult(T data) {
        this.data = data;
    }

    public HttpResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public HttpResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public HttpResult(ErrorCode errorCode) {
        this.code = errorCode.getCode();
        this.msg = errorCode.getMsg();
    }

    /**
     * 返回成功, 结构如下:
     * <p>{"code":200,"msg":"","data":{}}</p>
     *
     * @return
     */
    public static HttpResult successObject() {
        return new HttpResult(new Object());
    }

    /**
     * 返回成功, 结构如下:
     * <p>{"code":200,"msg":"","data":[]}</p>
     *
     * @return
     */
    public static HttpResult successArray() {
        return new HttpResult(new Object[]{});
    }

    public static <T> HttpResult<T> successWithData(T data) {
        return new HttpResult(data);
    }

    public static HttpResult failureWithCodeMsg(int code, String msg) {
        return new HttpResult(code, msg);
    }

    public static HttpResult failureWithErrorCode(ErrorCode errorCode) {
        return new HttpResult(errorCode);
    }

    public static <T> HttpResult<T> failureWithCodeMsg(int code, String msg, T data) {
        return new HttpResult(code, msg, data);
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return ErrorPropertiesUtils.getProperty(String.valueOf(code), msg);
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

