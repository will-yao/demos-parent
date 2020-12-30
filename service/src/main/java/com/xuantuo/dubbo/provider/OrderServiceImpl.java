package com.xuantuo.dubbo.provider;

import com.xuantuo.dubbo.OrderDTO;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @Author:xuantuo
 * @Date: Created on 2020/12/30
 **/
@DubboService(protocol = {"dubbo"}, interfaceClass = OrderService.class)
public class OrderServiceImpl implements OrderService{

    @Override
    public void createOrder(OrderDTO orderDTO) {
        System.out.println("haha");
    }
}
