package com.winter.authorityManagementSystem.dao;

import com.winter.authorityManagementSystem.domain.Member;
import com.winter.authorityManagementSystem.domain.Traveller;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/*
* 会员的持久层接口
* */
public interface IMemberDao {
    /*
    * 根据会员id查询相应的会员信息
    * */
    @Select("select * from member where id = #{id}")
    Member findById(int id);

}
