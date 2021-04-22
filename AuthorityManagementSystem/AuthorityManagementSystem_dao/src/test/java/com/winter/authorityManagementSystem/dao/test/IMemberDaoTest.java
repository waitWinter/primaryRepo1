package com.winter.authorityManagementSystem.dao.test;

import com.winter.authorityManagementSystem.dao.IMemberDao;
import com.winter.authorityManagementSystem.dao.ITravellerDao;
import com.winter.authorityManagementSystem.domain.Member;
import com.winter.authorityManagementSystem.domain.Traveller;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/*
* 旅客持久层接口的测试类
* */
public class IMemberDaoTest {

    /*
    * 测试根据id查询相应的会员信息
    * */
    @Test
    public void testFindById(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        IMemberDao memberDao = ac.getBean(IMemberDao.class);
        Member member = memberDao.findById(1);
        System.out.println(member);
    }

}
