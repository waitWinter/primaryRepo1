package com.winter.authorityManagementSystem.service.impl;

import com.github.pagehelper.PageHelper;
import com.winter.authorityManagementSystem.dao.IOrdersDao;
import com.winter.authorityManagementSystem.domain.Orders;
import com.winter.authorityManagementSystem.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/*
* 订单的业务层接口的实现类
* */
@Service
@Transactional
public class IOrdersServiceImpl implements IOrdersService {

    @Autowired
    private IOrdersDao ordersDao;

    @Override
    public List<Orders> findAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);  //pageNum表示页码值,pageSize表示每一页显示条数
        List<Orders> orders = ordersDao.findAll();
        return orders;
    }

    @Override
    public Orders findById(int id) {
        return ordersDao.findById(id);
    }

}
