package com.xuantuo.dubbo;

/**
 * @Author:xuantuo
 * @Date: Created on 2020/12/30
 **/
public class OrderDTO {

    private String orderId;

    private String buyerName;

    public OrderDTO() {
    }

    public OrderDTO(String orderId, String buyerName) {
        this.orderId = orderId;
        this.buyerName = buyerName;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }
}
