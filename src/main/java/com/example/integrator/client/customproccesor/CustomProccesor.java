package com.example.integrator.client.customproccesor;

import com.example.integrator.client.pojos.Order;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
public class CustomProccesor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        if(exchange.getFromRouteId().equalsIgnoreCase("godamCreateOrder")) {
            Order order = exchange.getIn().getBody(Order.class);
            godamCreateOrderTransformer(order,exchange);
        }
    }


    public void godamCreateOrderTransformer(Order order , Exchange exchange){
        System.out.println(order);
        order.setOrderId("AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        exchange.getIn().setBody(order);
    }
}
