package com.winter.authorityManagementSystem.controller;

import com.github.pagehelper.PageInfo;
import com.winter.authorityManagementSystem.domain.Users;
import com.winter.authorityManagementSystem.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private IUsersService usersService;

    /*
    * 查询系统的所用用户
    * */
    @RequestMapping("/findAll.do")
    public ModelAndView findAll(@RequestParam(name = "pageNum",required = true,defaultValue = "1")int pageNum,@RequestParam(name = "pageSize",required = true,defaultValue = "4")int pageSize){
        ModelAndView mv = new ModelAndView();
        List<Users> usersList = usersService.findAll(pageNum,pageSize);
        PageInfo pageInfo = new PageInfo(usersList);  //PageInfo是一个分页的bean
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("user-list");
        return mv;
    }
}
