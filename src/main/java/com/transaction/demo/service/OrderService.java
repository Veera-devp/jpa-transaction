package com.transaction.demo.service;


import com.transaction.demo.dto.OrderRequest;
import com.transaction.demo.dto.OrderResponse;

public interface OrderService {
    OrderResponse placeOrder(OrderRequest orderRequest);
}
