package com.winter.authorityManagementSystem.service.impl;

import com.winter.authorityManagementSystem.dao.IUsersDao;
import com.winter.authorityManagementSystem.domain.Role;
import com.winter.authorityManagementSystem.domain.Users;
import com.winter.authorityManagementSystem.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
/*
*
* 配置spring-security的service
* */
@Service("userService")
@Transactional
public class IUserServiceImpl implements IUserService {

    @Autowired
    private IUsersDao usersDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users users = usersDao.findByUsername(username);

        //获取用户的角色(只有指定的角色才会登录成功)
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        for(Role role : users.getRoles()){
            authorities.add(new SimpleGrantedAuthority("ROLE_"+role.getRoleName()));
        }

        //将用户对象users封装为UserDetails对象,在这里spring内置的User类实现了UserDetails类,我们只需要将自己的用户类users封装为User即可
        User user = new User(users.getUserName(),"{noop}"+users.getPassword(),authorities);
        return user;
    }

}
