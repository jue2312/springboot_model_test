package com.jue.controller.utils;

import lombok.Data;

@Data
public class R {
    //判断操作是否成功 true成功 false失败
    private Boolean flag;
    //data封装数据
    private Object data;
    //返回消息信息
    private String msg;

    public R(Boolean flag) {
        this.flag = flag;
    }

    public R() {
    }

    public R(Boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }

    public R(Boolean flag, String msg) {
        this.flag = flag;
        this.msg = msg;
    }

    public R(String msg) {
        this.flag = false;
        this.msg = msg;
    }
}

