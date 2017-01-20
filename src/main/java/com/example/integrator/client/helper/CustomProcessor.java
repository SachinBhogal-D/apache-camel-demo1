package com.example.integrator.client.helper;


import com.example.integrator.client.pojos.Order;

public interface CustomProcessor {

    public boolean validate();

    public Order transformCreateOrder(Order order);

}
