package com.bat.msbdemo.api.handler;

public class GlobalProcessException extends RuntimeException {

    // private Integer retCode;

    public GlobalProcessException(String message) {
        super(message);
    }
}
