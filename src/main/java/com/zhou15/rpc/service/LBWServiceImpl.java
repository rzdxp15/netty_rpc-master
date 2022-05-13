package com.zhou15.rpc.service;

import com.zhou15.rpc.annotation.server.RpcServer;

@RpcServer
public class LBWServiceImpl implements HelloService{
    @Override
    public String sayHello(String name) {
        return "卢本伟说你好"+name;
    }
}
