package com.imooc.myspringboot01.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @Value("${mail.config.name}")
    private String name;

    @Value("${mail.config.description}")
    private String description;

    @Value("${mail.config.hot-sales}")
    private Integer hotSales;

    @Value("${mail.config.show-advert}")
    private String showAdvert;


    @RequestMapping("/out")
    @ResponseBody
    public String out(){
        return "hello spring boot";
    }

    @RequestMapping("/info")
    @ResponseBody
    public String info(){
        return  String.format("name:%s,description:%s,hot-sales:%s,show-advert:%s",
        name,description,hotSales,showAdvert);
    }


}
