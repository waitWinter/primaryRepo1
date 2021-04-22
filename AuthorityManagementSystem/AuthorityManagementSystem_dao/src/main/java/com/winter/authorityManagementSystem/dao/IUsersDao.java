package com.winter.authorityManagementSystem.dao;

import com.winter.authorityManagementSystem.domain.Users;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/*
* 用户的持久层接口
* */
public interface IUsersDao {

    /*
    * 根据用户名称查询用户
    * */
    @Select("select * from users where username = #{username}")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "email",column = "email"),
            @Result(property = "userName",column = "userName"),
            @Result(property = "password",column = "password"),
            @Result(property = "phoneNumber",column = "phoneNumber"),
            @Result(property = "status",column = "status"),
            @Result(property = "roles",column = "id",many = @Many(select = "com.winter.authorityManagementSystem.dao.IRoleDao.findByUserId"))
    })
    Users findByUsername(String username);

    /*
    * 查询所有的用户
    * */
    @Select("select * from users")
    List<Users> findAll();

}
