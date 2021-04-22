package com.winter.authorityManagementSystem.service.impl;

import com.github.pagehelper.PageHelper;
import com.winter.authorityManagementSystem.dao.IUsersDao;
import com.winter.authorityManagementSystem.domain.Users;
import com.winter.authorityManagementSystem.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/*
* 用户的持久层接口的实现类
* */
@Service("usersService")
@Transactional
public class IUsersServiceImpl implements IUsersService {

    @Autowired
    private IUsersDao usersDao;

    @Override
    public List<Users> findAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize); //pageNum表示页码值,pageSize表示每一页显示条数
        List<Users> usersList = usersDao.findAll();
        return usersList;
    }

}
