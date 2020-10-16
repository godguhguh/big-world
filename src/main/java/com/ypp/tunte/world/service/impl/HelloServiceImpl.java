package com.ypp.tunte.world.service.impl;

import com.ypp.tunte.world.service.HelloService;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service()
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "Hello";
    }

    @Override
    public int increase(int value) {
        return value + 1;
    }

    @Override
    public boolean remoteRequest() {
        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        return true;
    }
}
