package com.winter.authorityManagementSystem.domain;

import java.util.List;

/*
* 旅客的实体类
* */
public class Traveller {
    private Integer id;  //主键,无意义
    private String name; //旅客姓名
    private String sex;  //旅客性别
    private String phoneNumber;  //旅客电话号，啊
    private Integer credentialsType;  //证件类型,0身份证,1护照,2军官证
    private String credentialsTypeStr;  //证件的字符串表现形式
    private String credentialsNum;    //证件号码
    private Integer travellerType;    //旅客类型,0成人,1儿童
    private String travellerTypeStr;  //旅客类型的字符串表现形式

    /*
    * 旅客证件类型的字符串表现形式
    * */
    public String getCredentialsTypeStr() {
        if(0 == credentialsType){
            return "身份证";
        }

        if(1 == credentialsType){
            return "护照";
        }

        if(2 == credentialsType){
            return "儿童";
        }

        throw new RuntimeException("旅客身份类型异常!!!");
    }

    public void setCredentialsTypeStr(String credentialsTypeStr) {
        this.credentialsTypeStr = credentialsTypeStr;
    }

    /*
    * 旅客类型的字符串表现形式
    * */
    public String getTravellerTypeStr() {
        if(0 == travellerType){
            return "成人";
        }

        if(1 == travellerType){
            return "儿童";
        }

        throw new RuntimeException("旅客类型异常!!!");
    }

    public void setTravellerTypeStr(String travellerTypeStr) {
        this.travellerTypeStr = travellerTypeStr;
    }

    private List<Orders> orders;  //旅客和订单是多对多的关系,在旅客的实体类中存放订单的引用的集合

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getCredentialsType() {
        return credentialsType;
    }

    public void setCredentialsType(Integer credentialsType) {
        this.credentialsType = credentialsType;
    }

    public String getCredentialsNum() {
        return credentialsNum;
    }

    public void setCredentialsNum(String credentialsNum) {
        this.credentialsNum = credentialsNum;
    }

    public Integer getTravellerType() {
        return travellerType;
    }

    public void setTravellerType(Integer travellerType) {
        this.travellerType = travellerType;
    }

    @Override
    public String toString() {
        return "Traveller{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", credentialsType=" + credentialsType +
                ", credentialsNum='" + credentialsNum + '\'' +
                ", travellerType=" + travellerType +
                '}';
    }
}
