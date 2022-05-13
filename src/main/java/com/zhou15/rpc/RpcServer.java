package com.zhou15.rpc;


import com.alibaba.nacos.api.exception.NacosException;
import com.zhou15.rpc.annotation.server.RpcServerScan;
import com.zhou15.rpc.manager.RpcServiceManager;

/**
 * 服务端测试
 *
 * @author zhoudz15
 */
@RpcServerScan
public class RpcServer {
    public static void main(String[] args) throws InterruptedException, NacosException {
        //创建服务管理器  启动服务
        new RpcServiceManager("127.0.0.1",8080).start();

    }
}
