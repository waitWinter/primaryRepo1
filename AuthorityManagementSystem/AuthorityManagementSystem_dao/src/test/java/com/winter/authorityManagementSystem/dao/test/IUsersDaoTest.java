package com.winter.authorityManagementSystem.dao.test;

import com.winter.authorityManagementSystem.dao.IUsersDao;
import com.winter.authorityManagementSystem.domain.Users;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class IUsersDaoTest {

    /*
    * 测试根据名称查询用户
    * */
    @Test
    public void testFindByUsername(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUsersDao usersDao = ac.getBean(IUsersDao.class);
        Users users = usersDao.findByUsername("张志扬");
        System.out.println(users);
    }

    /*
    * 测试查询所有的用户
    * */
    @Test
    public void testFindAll(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUsersDao usersDao = ac.getBean(IUsersDao.class);
        List<Users> usersList = usersDao.findAll();
        for(Users users : usersList){
            System.out.println(users);
        }
    }
}
