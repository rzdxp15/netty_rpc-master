package com.zhou15.rpc.loadBalancer;


import com.alibaba.nacos.api.naming.pojo.Instance;

import java.util.List;

/**
 * 负载均衡算法
 *
 * @author zhoudz15
 */
public interface LoadBalancer {

    Instance getInstance(List<Instance> list);

}
