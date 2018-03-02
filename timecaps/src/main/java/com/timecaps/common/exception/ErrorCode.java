package com.timecaps.common.exception;

import java.io.Serializable;

/**
 * Created by yuanqiang on 2018/3/1.
 */

public class ErrorCode implements Serializable {
    private static final long serialVersionUID = 4661206403858374344L;
    private int code;
    private String msg;

    public ErrorCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}

