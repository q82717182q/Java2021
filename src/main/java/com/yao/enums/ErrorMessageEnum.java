package com.yao.enums;
/*
 * @author Jack
 * @date 2023/1/2
 * */

public enum ErrorMessageEnum {
    TEST_ERROR("000001001", "Test error"),

        ;
    private String code;
    private String message;

    private ErrorMessageEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "ErrorMessageEnum{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
