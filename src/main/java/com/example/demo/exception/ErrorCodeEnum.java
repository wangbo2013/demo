package com.example.demo.exception;

/**
 * @author : mac
 * create at:  2019-12-16  10:53
 * @description:
 */
public enum ErrorCodeEnum {
    USER_NOT_FOUND_EXCEPTION("InvalidUser.NoFound", "The specified user does not exist.");

    private String errorCode;

    private String message;

    ErrorCodeEnum(String errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
