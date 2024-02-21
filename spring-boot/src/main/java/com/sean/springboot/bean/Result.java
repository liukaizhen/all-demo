package com.sean.springboot.bean;

import lombok.*;
import org.springframework.util.StringUtils;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = false)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> extends TokenResult implements Serializable {

    protected int code;

    protected String message;

    protected T result;


    /* 提供快捷方法 */
    public static <T> Result<T> ok() {
        return new Result<>(ResponseCode.STATUS_OK, "操作成功", null) ;
    }

    public static <T> Result<T> ok(T result) {
        return new Result<>(ResponseCode.STATUS_OK, "操作成功" , result) ;
    }

    public static <T> Result<T> ok(T result, String msg) {
        return new Result<>(ResponseCode.STATUS_OK, StringUtils.isEmpty(msg) ? "操作成功" : msg , result) ;
    }

    public static <T> Result<T> error(String msg) {
        return new Result<>(ResponseCode.UNKNOWN_ERROR, StringUtils.isEmpty(msg) ? "操作失败" : msg , null) ;
    }

    public static <T> Result<T> error(Integer code, String msg) {
        return new Result<>(code, StringUtils.isEmpty(msg) ? "操作失败" : msg , null) ;
    }

    public static <T> Result<T> error(Integer code) {
        return new Result<>(code,  ResponseCode.STATUS_DEFAULT_MESSAGE.get(code) , null) ;
    }
}


