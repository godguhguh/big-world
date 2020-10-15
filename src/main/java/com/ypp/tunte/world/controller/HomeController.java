package com.ypp.tunte.world.controller;

import cn.hutool.core.util.RandomUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;

/**
 * 功能说明
 *
 * @author yanpp
 * @createDateTime 2020/1/16
 **/
@RestController
public class HomeController {


    @RequestMapping("/")
    public String index(){
        return "welcome to big world!" + RandomUtil.randomString(3);
    }


    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/now")
    public String currentDate(){
        return LocalDateTime.now().toString();
    }

    @RequestMapping("/now1")
    public String currentDate1(){
        return LocalDateTime.now().toString();
    }
}
