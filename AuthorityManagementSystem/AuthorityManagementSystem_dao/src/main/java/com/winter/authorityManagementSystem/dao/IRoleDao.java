package com.winter.authorityManagementSystem.dao;

import com.winter.authorityManagementSystem.domain.Role;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/*
*
* 角色的持久层接口
* */
public interface IRoleDao {

    /*
    * 根据用户的id查询角色
    * */
    @Select("select * from role where id in (select roleId from users_role where userId = #{userId})")
    List<Role> findByUserId(int userId);
}
