package com.example.demo.exception;

import lombok.Data;

/**
 * @author : mac
 * create at:  2019-12-16  10:58
 * @description:
 */
@Data
public class NotFoundException extends RuntimeException {

    private String code;

    private String message;

    public NotFoundException(ErrorCodeEnum errorCodeEnum) {
        this.code = errorCodeEnum.getErrorCode();
        this.message = errorCodeEnum.getMessage();
    }
}
