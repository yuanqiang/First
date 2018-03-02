package com.timecaps.helper;

import com.timecaps.common.exception.BusinessException;
import com.timecaps.common.exception.ErrorCode;

import org.apache.commons.lang.StringUtils;

/**
 * Created by yuanqiang on 2018/3/1.
 */

public class ErrorHandler {
    public static void throwError(ErrorCode errorCode, String extMsg){
        throw new BusinessException(errorCode.getCode(), StringUtils.trimToNull(
                extMsg) == null ? errorCode.getMsg() : (errorCode.getMsg().replaceAll("。", "") + "," + extMsg));
    }

    public static void throwError(ErrorCode errorCode){
        throwError(errorCode, null);
    }

    public static void throwError(Integer code, String errorMsg) {
        throw new BusinessException(code, errorMsg);
    }
}
