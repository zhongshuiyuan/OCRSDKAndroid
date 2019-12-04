package com.jxd.wanttospend.utils;


import java.io.Serializable;
import java.sql.SQLTransactionRollbackException;

/**
 * @author renji
 * @date 2017/12/28
 * 所有的请求参数
 */

public class RequestBean implements Serializable {

    private String institutionCode;
    private String password;
    private int type;
    private String className;
    private String channelId="01";

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getInstitutionCode() {
        return institutionCode;
    }

    public void setInstitutionCode(String institutionCode) {
        this.institutionCode = institutionCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
