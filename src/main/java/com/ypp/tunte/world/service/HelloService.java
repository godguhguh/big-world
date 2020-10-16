package com.ypp.tunte.world.service;

public interface HelloService {
    String hello(String name);
    int increase(int value);
    /**
     * 该方法会等待1秒后返回true，这是在模拟一个耗时的远程调用
     * @return
     */
    boolean remoteRequest();
}
