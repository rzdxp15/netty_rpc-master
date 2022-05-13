package com.zhou15.rpc.service;

import com.zhou15.rpc.annotation.server.RpcServer;

@RpcServer
public class HelloServiceImpl implements HelloService{
    @Override
    public String sayHello(String name) {

    return "你好, " + name;
    }
}
