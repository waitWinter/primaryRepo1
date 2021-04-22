package com.winter.authorityManagementSystem.controller;

import com.github.pagehelper.PageInfo;
import com.winter.authorityManagementSystem.domain.Product;
import com.winter.authorityManagementSystem.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService productService;

    /*
    * 查询所有的产品
    * */
    @RequestMapping("/findAll.do")
    public ModelAndView findAll(@RequestParam(name = "pageNum",required = true,defaultValue = "1") int pageNum,@RequestParam(name = "pageSize",required = true,defaultValue = "4") int pageSize){
        ModelAndView mv = new ModelAndView();
        List<Product> products = productService.findAll(pageNum,pageSize);  //调用持久层查询所有的商品
        PageInfo pageInfo = new PageInfo(products);  //初始化一个分页的javaBean
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("product-list");
        return mv;
    }

    /*
    * 添加产品,添加成功后跳转到查询所有的界面
    * */
    @RequestMapping("/save.do")
    public String saveProduct(Product product){
        productService.saveProduct(product);
        return "redirect:findAll.do";
    }
}
