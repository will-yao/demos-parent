package com.xuantuo.dubbo.provider;

import com.xuantuo.dubbo.OrderDTO;

/**
 * @Author:xuantuo
 * @Date: Created on 2020/12/30
 **/
public interface OrderService {

    public void createOrder(OrderDTO orderDTO);
}
