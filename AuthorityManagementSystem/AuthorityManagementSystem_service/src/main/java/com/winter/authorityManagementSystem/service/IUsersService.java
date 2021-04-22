package com.winter.authorityManagementSystem.service;

import com.winter.authorityManagementSystem.domain.Users;

import java.util.List;

/*
* 用户的业务层接口
* */
public interface IUsersService {

    /*
    * 查询所有的用户
    * */
    List<Users> findAll(int pageNum,int pageSize);
}
