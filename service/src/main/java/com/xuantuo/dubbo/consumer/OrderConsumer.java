package com.xuantuo.dubbo.consumer;

import com.xuantuo.dubbo.OrderDTO;
import com.xuantuo.dubbo.provider.OrderService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @Author:xuantuo
 * @Date: Created on 2020/12/30
 **/
@Service
public class OrderConsumer {

    @DubboReference(protocol = "dubbo")
    private OrderService orderService;

    public void createOne() {
        OrderDTO orderDTO = new OrderDTO();
        orderService.createOrder(orderDTO);
    }
}
