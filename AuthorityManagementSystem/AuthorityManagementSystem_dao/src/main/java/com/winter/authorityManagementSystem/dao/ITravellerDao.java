package com.winter.authorityManagementSystem.dao;

import com.winter.authorityManagementSystem.domain.Traveller;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/*
*旅客的持久层接口
* */
public interface ITravellerDao {

    /*
    * 根据旅客的id查询相应的旅客信息
    * */
    @Select("select * from traveller where id = #{id}")
    Traveller findById(int id);

    /*
     * 根据订单id查询旅客信息
     * 需要注意的是,旅客和订单之间是多对多的关系，需要通过一张中间表来实现二者的多表查询
     * */
    @Select("select * from traveller where id in (select travellerId from orders_traveller where ordersId = #{ordersId})")
    List<Traveller> findByOrdersId(int OrdersId);
}
