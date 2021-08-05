package com.example.demo.exception;

import lombok.Data;

/**
 * @author : mac
 * create at:  2019-12-16  10:49
 * @description:
 */
@Data
public class ErrorReturn {
    private String code;
    private String message;

    public ErrorReturn(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
