package com.winter.authorityManagementSystem.dao.test;

import com.winter.authorityManagementSystem.dao.IProductDao;
import com.winter.authorityManagementSystem.domain.Product;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class IProductDaoTest {

    /*
    * 测试查询所有
    * */
    @Test
    public void testFindAll(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        IProductDao productDao = ac.getBean(IProductDao.class);
        List<Product> products = productDao.findAll();
        for(Product product : products){
            System.out.println(product);
        }
    }

    /*
    * 根据id查询产品
    * */
    @Test
    public void testFindById(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        IProductDao productDao = ac.getBean(IProductDao.class);
        Product product = productDao.findById(1);
        System.out.println(product);
    }
}
