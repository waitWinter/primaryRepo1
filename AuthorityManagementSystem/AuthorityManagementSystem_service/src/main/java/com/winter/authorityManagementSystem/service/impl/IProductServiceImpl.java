package com.winter.authorityManagementSystem.service.impl;

import com.github.pagehelper.PageHelper;
import com.winter.authorityManagementSystem.dao.IProductDao;
import com.winter.authorityManagementSystem.domain.Product;
import com.winter.authorityManagementSystem.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/*
* 业务层接口的实现类
* */
@Service("IProductService")
@Transactional
public class IProductServiceImpl implements IProductService {

    @Autowired
    private IProductDao productDao;

    @Override
    public List<Product> findAll(int pageNum, int pageSize) {
        //业务层调用持久层查询所有产品方法
        PageHelper.startPage(pageNum,pageSize);
        List<Product> products = productDao.findAll();
        return products;
    }

    @Override
    public void saveProduct(Product product) {
        productDao.saveProduct(product);
    }


}
