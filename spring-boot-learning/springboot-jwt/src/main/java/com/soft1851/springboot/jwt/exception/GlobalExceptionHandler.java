package com.soft1851.springboot.jwt.exception;

import com.auth0.jwt.exceptions.InvalidClaimException;
import com.soft1851.springboot.jwt.common.ResponseResult;
import com.soft1851.springboot.jwt.common.ResultCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author ysx
 * 全局异常
 */
@RestControllerAdvice(annotations = {RestController.class, Controller.class})
@Slf4j
public class GlobalExceptionHandler {

    /**
     *  自定义异常的处理，统一在这里捕获返回JSON格式的友好提示
     */
    @ExceptionHandler(value = {JwtException.class})
    @ResponseBody
    public ResponseResult sendError(JwtException exception) {
        log.error(exception.getMessage());
        return ResponseResult.failure(exception.getResultCode());
    }

    /**
     * NPE异常的处理
     */
    @ExceptionHandler(value = {NullPointerException.class})
    @ResponseBody
    public ResponseResult sendError(NullPointerException exception) {
        log.error(exception.getMessage());
        return ResponseResult.failure(ResultCode.RESULT_CODE_DATA_NONE);
    }

    /**
     * 算数异常的处理
     * @param exception
     * @return
     */
    @ExceptionHandler(value = {ArithmeticException.class})
    @ResponseBody
    public ResponseResult sendError(ArithmeticException exception) {
        log.error(exception.getMessage());
        return ResponseResult.failure(ResultCode.ARITHMETIC_ERROR);
    }

    @ExceptionHandler(value = InvalidClaimException.class)
    @ResponseBody
    public ResponseResult sendError(InvalidClaimException exception) {
        log.error(exception.getMessage());
        return ResponseResult.failure(ResultCode.USER_TOKEN_EXPIRES);
    }
}
