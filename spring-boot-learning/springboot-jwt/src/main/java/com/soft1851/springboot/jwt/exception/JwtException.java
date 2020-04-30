package com.soft1851.springboot.jwt.exception;

import com.soft1851.springboot.jwt.common.ResultCode;

/**
 * @author ysx
 * 自定义异常
 */

public class JwtException extends RuntimeException{
    protected ResultCode resultCode;

    public JwtException(String msg, ResultCode resultCode) {
        super(msg);
        this.resultCode = resultCode;
    }

    public ResultCode getResultCode() {
        return resultCode;
    }
}
