package com.winter.authorityManagementSystem.dao;

import com.winter.authorityManagementSystem.domain.Orders;
import com.winter.authorityManagementSystem.domain.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;

/*
* 订单的持久层接口
* */
public interface IOrdersDao {
    /*
    * 查询所有
    *
    * 关于mybatis的一点点知识
    * 封装其它的类时,一对一通过one注解来进行封装,column属性表示通过那个字段来查找这个类(表)
    * */
    @Select("select * from orders")
    @Results({  //根据订单页面查询信息,不查多余的数据
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "orderNum",column = "orderNum"),
            @Result(property = "orderTime",column = "orderTime"),
            @Result(property = "peopleCount",column = "peopleCount"),
            @Result(property = "orderDesc",column = "orderDesc"),
            @Result(property = "payType",column = "payType"),
            @Result(property = "orderStatue",column = "orderStatue"),
            @Result(property = "productId",column = "productId"),
            @Result(property = "memberId",column = "memberId"),
            @Result(property = "product",column = "productId",one = @One(select = "com.winter.authorityManagementSystem.dao.IProductDao.findById"))
    })
    List<Orders> findAll();

    /*
    * 根据id查询订单信息,注意这里查询的是订单详情,是一个多表查询
    * 注意property为domain实体类中的属性的值
    * */
    @Select("select * from orders where id = #{id}")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "orderNum",column = "orderNum"),
            @Result(property = "orderTime",column = "orderTime"),
            @Result(property = "peopleCount",column = "peopleCount"),
            @Result(property = "orderDesc",column = "orderDesc"),
            @Result(property = "payType",column = "payType"),
            @Result(property = "orderStatue",column = "orderStatue"),
            @Result(property = "productId",column = "productId"),
            @Result(property = "memberId",column = "memberId"),
            @Result(property = "travellers",column = "id",many = @Many(select = "com.winter.authorityManagementSystem.dao.ITravellerDao.findByOrdersId")),
            @Result(property = "member",column = "memberId",one = @One(select = "com.winter.authorityManagementSystem.dao.IMemberDao.findById")),
            @Result(property = "product",column = "productId",one = @One(select = "com.winter.authorityManagementSystem.dao.IProductDao.findById"))
    })
    Orders findById(int id);

}
