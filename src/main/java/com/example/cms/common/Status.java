package com.example.cms.common;

import lombok.Getter;

@Getter
public enum Status implements IStatus{

    SUCCESS(200,"操作成功!"),

    ERROR(500,"操作异常!"),

    LOGOUT(200,"登出成功"),

    HTTP_BAD_METHOD(405,"请求方式不存在"),

    REQUEST_NOT_FOUND(404,"请求不存在");

    private Integer code;
    private String message;

    Status(Integer code,String message){
        this.code = code;
        this.message = message;

    }

    @Override
    public String toString() {
        return String.format("Status:{code=%s,message=%s}",getCode(),getMessage());
    }
}
