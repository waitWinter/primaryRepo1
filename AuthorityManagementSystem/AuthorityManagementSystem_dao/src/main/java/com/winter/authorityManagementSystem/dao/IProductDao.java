package com.winter.authorityManagementSystem.dao;

import com.winter.authorityManagementSystem.domain.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IProductDao {

    /*
    * 查询所有的商品
    * */
    @Select("select * from product")
    List<Product> findAll();

    /*
    * 保存产品
    * */
    @Insert("insert into product(productNum, productName, cityName, DepartureTime, productPrice, productDesc, productStatus) values(#{productNum},#{productName},#{cityName},#{DepartureTime},#{productPrice},#{productDesc},#{productStatus})")
    void saveProduct(Product product);

    /*
    * 根据主键查询id
    * */
    @Select("select * from product where id = #{id}")
    Product findById(Integer id);
}
