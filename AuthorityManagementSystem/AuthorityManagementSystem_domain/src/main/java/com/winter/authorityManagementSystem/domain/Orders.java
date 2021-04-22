package com.winter.authorityManagementSystem.domain;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/*
* 订单信息的实体类
* */
public class Orders implements Serializable {
    private Integer id;  // 主键,无意义
    private String orderNum; // 订单号
    private Date orderTime;  // 订单时间
    private String orderTimeStr;  //订单时间的字符串表示形式
    private Integer peopleCount;  //订单人数
    private String orderDesc; // 订单描述
    private Integer payType;  // 支付方式,0支付宝,1微信
    private String payTypeStr;  //支付方式的字符串的表现形式
    private Integer orderStatue; // 订单状态,0未支付,1已支付
    private String orderStatueStr;  //订单状态的字符串表现形式
    private Integer productId;   //外键,关联产品表
    private Integer memberId;    //外键,关联会员表

    private Product product; // 订单与参品,1对1的关系,订单存放参品的引用
    private Member member;   // 订单与会员,1对1的关系,订单存放会员的引用
    private List<Traveller> travellers;  //订单和出行的旅客,多对多的关系

    public String getPayTypeStr() {
        if(0 == payType){
            return "支付宝";
        }

        if(1 == payType){
            return "微信";
        }

        throw new RuntimeException("支付方式异常!!!");
    }

    public void setPayTypeStr(String payTypeStr) {
        this.payTypeStr = payTypeStr;
    }

    /*
    * 下单时间日期格式转字符串形式
    * */
    public String getOrderTimeStr() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(orderTime);
    }

    public void setOrderTimeStr(String orderTimeStr) {
        this.orderTimeStr = orderTimeStr;
    }

    /*
    * 订单状态的字符串形式,0未支付,1已支付
    * */
    public String getOrderStatueStr() {
        if(0 == orderStatue){
            return "未支付";
        }

        if(1 == orderStatue){
            return "已支付";
        }

        throw new RuntimeException("订单状态异常!");
    }

    public void setOrderStatueStr(String orderStatueStr) {
        this.orderStatueStr = orderStatueStr;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Integer getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(Integer peopleCount) {
        this.peopleCount = peopleCount;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getOrderStatue() {
        return orderStatue;
    }

    public void setOrderStatue(Integer orderStatue) {
        this.orderStatue = orderStatue;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public List<Traveller> getTravellers() {
        return travellers;
    }

    public void setTravellers(List<Traveller> travellers) {
        this.travellers = travellers;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", orderNum='" + orderNum + '\'' +
                ", orderTime=" + orderTime +
                ", peopleCount=" + peopleCount +
                ", orderDesc='" + orderDesc + '\'' +
                ", payType=" + payType +
                ", orderStatue=" + orderStatue +
                ", product=" + product +
                ", member=" + member +
                ", travellers=" + travellers +
                '}';
    }
}
