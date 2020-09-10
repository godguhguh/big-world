package com.ypp.tunte.world.controller;

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
        return "welcome to big world!";
    }


    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/now")
    public String currentDate(){
        return LocalDateTime.now().toString();
    }
}
