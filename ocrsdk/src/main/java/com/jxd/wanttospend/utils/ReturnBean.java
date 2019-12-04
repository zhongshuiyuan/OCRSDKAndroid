package com.jxd.wanttospend.utils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ReturnBean implements Serializable {

    private String code;
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ReturnBean{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
