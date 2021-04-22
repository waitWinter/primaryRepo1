package com.winter.authorityManagementSystem.dao.test;

import com.winter.authorityManagementSystem.dao.ITravellerDao;
import com.winter.authorityManagementSystem.domain.Traveller;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/*
* 旅客的持久层的测试类
* */
public class ITravellerDaoTest {

    /*
    * 测试根据id查询相应的旅客信息
    * */
    @Test
    public void testFindById(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ITravellerDao travellerDao = ac.getBean(ITravellerDao.class);
        Traveller traveller = travellerDao.findById(1);
        System.out.println(traveller);
    }

    /*
     * 多表查询测试,旅客和订单之间是多对多的关系
     * */
    @Test
    public void testFindByOrdersId(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ITravellerDao travellerDao = ac.getBean(ITravellerDao.class);
        List<Traveller> travellers = travellerDao.findByOrdersId(1);
        for (Traveller traveller : travellers){
            System.out.println("================================");
            System.out.println(traveller);
            System.out.println(traveller.getOrders());
            System.out.println("================================");
        }
    }
}
