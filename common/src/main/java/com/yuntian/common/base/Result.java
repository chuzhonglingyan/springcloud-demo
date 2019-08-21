package com.yuntian.common.base;

/**
 * @Auther: yuntian
 * @Date: 2019/8/21 0021 00:45
 * @Description:
 */
public class Result<T> {

    private T  data;

    private String msg;

    private Integer code;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
