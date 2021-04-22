package com.winter.authorityManagementSystem.domain;

import java.io.Serializable;
import java.util.List;

/*
* 用户的实体类
* */
public class Users implements Serializable {
    private Integer id;  //用户的id,主键,无实际意义
    private String email;  //用户的邮箱
    private String userName;  //用户名
    private String password;  //密码
    private String phoneNumber;  //电话号码
    private Integer status;  //用户的状态,0未开启,1开启
    private String statusStr;  //用户状态的字符串形式

    /*
    * 获取用户状态的字符串表现形式
    * */
    public String getStatusStr() {
        if(0 == status){
            return "未开启";
        }

        if(1 == status){
            return "开启";
        }

        throw new RuntimeException("用户状态异常!!!");
    }

    public void setStatusStr(String statusStr) {
        this.statusStr = statusStr;
    }

    private List<Role> roles;  //一个用户可能包含多个角色,这里存储角色引用的集合

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", status=" + status +
                ", roles=" + roles +
                '}';
    }
}
