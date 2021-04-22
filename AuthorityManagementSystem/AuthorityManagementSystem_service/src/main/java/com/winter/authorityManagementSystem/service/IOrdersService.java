package com.winter.authorityManagementSystem.service;

import com.winter.authorityManagementSystem.domain.Orders;
import org.springframework.stereotype.Service;

import java.util.List;

/*
* 订单的持久层接口
* */
public interface IOrdersService {

    /*
    * 查询所有订单
    * */
    List<Orders> findAll(int pageNum,int pageSize);

    /*
    * 根据id查询订单
    * */
    Orders findById(int id);
}
