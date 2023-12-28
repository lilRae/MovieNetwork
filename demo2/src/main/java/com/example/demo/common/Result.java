package com.example.demo.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
//接口统一返回包装类
@Data
@Builder
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class Result {
    private String code;
    private String msg;
    private  Object data;
    public  static  Result success(){
        return  new Result(Constants.CODE_200,"",null);
    }
    public  static  Result success(Object data){
        return  new Result(Constants.CODE_200,"",data);
    }
    public  static  Result error(){
        return  new Result(Constants.COOE_500,"错误",null);
    }
}
