package com.example.cms.common;


import lombok.Data;

@Data
public class ApiResponse {
    private Integer code;

    private String message;

    private Object data;

    private ApiResponse(){

    }

    public ApiResponse(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 自定义API返回构造函数
     *
     * @param code
     * @param message
     * @param data
     * @return ApiResponse
     */
    public static ApiResponse of(Integer code,String message,Object data){
        return new ApiResponse(code,message,data);
    }

    /**
     * 成功不返回任何数据的API的构造函数
     * @return ApiResponse
     */
    public static ApiResponse ofSuccess(){
        return ofSuccess(null);
    }

    /**
     * 成功返回数据的API的构造函数
     * @param data
     * @return
     */
    public static ApiResponse ofSuccess(Object data){
        return ofStatus(Status.SUCCESS,data);
    }

    /**
     * 成功只返回消息的API的构造函数
     * @param message
     * @return ApiResponse
     */
    public static ApiResponse ofMessage(String message){
        return of(Status.SUCCESS.getCode(), message,null);
    }

    /**
     * 返回状态的API的构造函数
     * @param status
     * @return
     */
    public static ApiResponse ofStatus(Status status){
        return ofStatus(status,null);
    }

    /**
     * 返回一个有状态并带有数据的API返回
     * @param status
     * @param data
     * @return
     */
    public static ApiResponse ofStatus(IStatus status,Object data){
        return of(status.getCode(), status.getMessage(), data);
    }

    /**
     * 返回异常的API的构造函数
     * @param t
     * @param <T> {@link BaseException}
     * @return ApiResponse
     */
    public  static <T extends BaseException> ApiResponse ofException(T t){
        return of(t.getCode(),t.getMessage(),t.getData());
    }

}
