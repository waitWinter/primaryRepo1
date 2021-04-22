package com.winter.authorityManagementSystem.dao.test;

import com.winter.authorityManagementSystem.dao.IRoleDao;
import com.winter.authorityManagementSystem.domain.Role;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class IRoleDaoTest {

    /*
    * 根据用户id查询角色
    * */
    @Test
    public void testFindByUserId(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        IRoleDao roleDao = ac.getBean(IRoleDao.class);
        List<Role> roles = roleDao.findByUserId(4);
        for(Role role : roles){
            System.out.println(role);
        }
    }
}
