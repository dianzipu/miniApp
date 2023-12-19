package com.example.mini.Common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 接口统一返回包装类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private int code;
    private String message;
    private Object data;

    public static Result Success() {
        return new Result(Constants.code_200, "", null);
    }

    public static Result SuccessOb(Object data) {
        return new Result(Constants.code_200, "", data);
    }

    public static Result Error(int code, String message){
        return new Result(code, message, null);
    }

    public static Result ErrorSys(){
        return new Result(Constants.code_500, "系统错误", null);
    }
}
