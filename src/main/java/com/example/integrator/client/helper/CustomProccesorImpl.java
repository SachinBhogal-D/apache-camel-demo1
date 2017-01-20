package com.example.integrator.client.helper;

import com.example.integrator.client.helper.CustomProcessor;
import com.example.integrator.client.pojos.Order;
import org.springframework.stereotype.Component;


@Component
public class CustomProccesorImpl  implements CustomProcessor{

    @Override
    public boolean validate() {

        System.out.println("validating");
        return true;
    }

    @Override
    public Order transformCreateOrder(Order order) {
        order.setOrderId("################");
        System.out.println("transforming Order:::::::====>>>>");
        return order;
    }
}
