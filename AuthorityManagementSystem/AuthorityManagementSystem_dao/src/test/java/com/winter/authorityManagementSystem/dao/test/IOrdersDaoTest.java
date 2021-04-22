package com.winter.authorityManagementSystem.dao.test;


import com.winter.authorityManagementSystem.dao.IOrdersDao;
import com.winter.authorityManagementSystem.domain.Orders;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.util.List;

public class IOrdersDaoTest {

    /*
    * 测试查询所有的订单
    * */
    @Test
    public void testFindAll(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        IOrdersDao ordersDao = ac.getBean(IOrdersDao.class);
        List<Orders> orders = ordersDao.findAll();
        for(Orders order : orders){
            System.out.println(order);
        }
    }


    /*
    * 测试多表查询,订单和旅客之间是对多对的关系,订单和会员之间是一对一的关系(一个订单只有一个会员,但一个会员可以处理多个订单)
    * */
    @Test
    public void testFindById(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        IOrdersDao iOrdersDao = ac.getBean(IOrdersDao.class);
        Orders orders = iOrdersDao.findById(1);
        System.out.println(orders);
    }
}
