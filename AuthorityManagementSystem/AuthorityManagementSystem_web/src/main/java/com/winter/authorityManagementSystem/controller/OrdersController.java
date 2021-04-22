package com.winter.authorityManagementSystem.controller;

import com.github.pagehelper.PageInfo;
import com.winter.authorityManagementSystem.domain.Orders;
import com.winter.authorityManagementSystem.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/*
* 订单的controller
* */
@Controller
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private IOrdersService ordersService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll(@RequestParam(name = "pageNum",required = true,defaultValue = "1") int pageNum,@RequestParam(name = "pageSize",required = true,defaultValue = "4") int pageSize){
        ModelAndView mv = new ModelAndView();
        List<Orders> orders = ordersService.findAll(pageNum,pageSize);
        //PageInfo就是一个分页的bean
        PageInfo pageInfo = new PageInfo(orders);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("orders-list");
        return mv;
    }

    /*
    * 根据订单id查询订单(单独一页不用分页)
    * */
    @RequestMapping("/findById.do")
    public ModelAndView findById(int id){
        ModelAndView mv = new ModelAndView();
        Orders orders = ordersService.findById(id);
        mv.addObject("orders",orders);
        mv.setViewName("orders-details");
        return mv;
    }
}
