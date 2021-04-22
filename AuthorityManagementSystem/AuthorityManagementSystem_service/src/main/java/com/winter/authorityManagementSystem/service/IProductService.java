package com.winter.authorityManagementSystem.service;

import com.winter.authorityManagementSystem.domain.Product;

import java.util.List;

/*
* 产品的业务层接口
* */
public interface IProductService {

    /*
    * 业务层查询所有的方法
    * */
    public List<Product> findAll(int pageNum,int pageSize);

    /*
    * 保存产品
    * */
    public void saveProduct(Product product);
}
