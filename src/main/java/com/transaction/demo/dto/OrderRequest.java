package com.transaction.demo.dto;

import com.transaction.demo.entity.Order;
import com.transaction.demo.entity.Payment;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRequest {
    private Order order;
    private Payment payment;
}
