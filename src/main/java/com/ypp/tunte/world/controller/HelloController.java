package com.ypp.tunte.world.controller;

import com.ypp.tunte.world.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String hello(@PathVariable String name){
        return helloService.hello(name);
    }
}
