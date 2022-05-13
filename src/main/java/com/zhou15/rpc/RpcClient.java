package com.zhou15.rpc;

import com.zhou15.rpc.manager.ClientProxy;
import com.zhou15.rpc.manager.RpcClientManager;
import com.zhou15.rpc.service.HelloService;
import com.zhou15.rpc.service.LBWServiceImpl;

/**
 * 客户端测试
 *
 * @author zhoudz15
 */
public class RpcClient {
    public static void main(String[] args) {
            a();
    }

    private static void a() {
        RpcClientManager clientManager = new RpcClientManager();
        //创建代理对象
        HelloService service = new ClientProxy(clientManager).getProxyService(LBWServiceImpl.class);
        System.out.println(service.sayHello("zhangsan"));
    }
}
