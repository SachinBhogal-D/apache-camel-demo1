package com.example.integrator.client.pojos;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;


@XmlRootElement
public class Order {

    private String orderId;
    private String orderType;
    private List<OrderItems> orderItemsList;

    public String getOrderId() {
        return orderId;
    }

    @XmlElement
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderType() {
        return orderType;
    }

    @XmlElement
    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public List<OrderItems> getOrderItemsList() {
        return orderItemsList;
    }

    @XmlElement
    public void setOrderItemsList(List<OrderItems> orderItemsList) {
        this.orderItemsList = orderItemsList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", orderType='" + orderType + '\'' +
                ", orderItemsList=" + orderItemsList +
                '}';
    }
}
