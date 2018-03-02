package com.timecaps.common.exception;


import com.alibaba.fastjson.JSONException;
import com.timecaps.common.core.HttpResult;
import com.timecaps.common.exception.SystemErrorCodeConstant;
import com.timecaps.common.exception.BusinessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 全局异常拦截控制器.
 *
 * @author wiflish
 * @since 1.0.0
 */
@ControllerAdvice
public class SpringControllerExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(SpringControllerExceptionHandler.class);

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(BadRequestException.class)
    public void handle400() {
    }

    @ResponseStatus(HttpStatus.FORBIDDEN)
    @ExceptionHandler(ForbiddenException.class)
    public void handle403() {
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(ResourceNotFoundException.class)
    public void handle404() {
    }

    @ExceptionHandler(JSONException.class)
    public @ResponseBody
    HttpResult handleJsonException(JSONException e) {
        logger.error("JSON解析异常.", e);
        return HttpResult.failureWithErrorCode(SystemErrorCodeConstant.JSON_FORMAT_ERROR);
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public void handle500(Exception ex) {
        logger.error("服务器内部异常", ex);
    }

    @ExceptionHandler(BusinessException.class)
    public @ResponseBody HttpResult handleBusiness(BusinessException e) {
        logger.warn("业务逻辑异常:{}", e.getMessage());

        HttpResult result = new HttpResult();

        result.setCode(e.getCode());
        result.setMsg(e.getMessage());

        return result;
    }

}

