package com.example.animarket.common.exception;

import lombok.Getter;


@Getter
public class SimpleRunAppException extends RuntimeException {
    private ErrorCode errorCode;
    private String detailMessage;


    public SimpleRunAppException(ErrorCode errorCode) {
        this(errorCode, errorCode.getMessage());
    }

    public SimpleRunAppException(ErrorCode errorCode, String detailMessage) {
        super(detailMessage);
        this.errorCode = errorCode;
        this.detailMessage = detailMessage;
    }
}
