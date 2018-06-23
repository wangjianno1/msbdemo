package com.bat.msbdemo.api.handler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bat.msbdemo.common.ResultBody;
import com.bat.msbdemo.common.ResultUtil;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = GlobalProcessException.class)
    @ResponseBody
    public ResultBody<Object> handleProcessException(Exception ex, HttpServletRequest request) {
        return ResultUtil.exception(ex.getMessage());
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultBody<Object> handleUnknownException(Exception ex, HttpServletRequest request) {
        return ResultUtil.error();
    }
}
