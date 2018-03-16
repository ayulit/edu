package com.example.demo.controller;

import com.example.demo.domain.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by st10902 on 3/16/2018.
 */
@RestController
public class OrdersController {

    @GetMapping("/order")
    public Order get() {
//        Order order = orderRepository.get(orderId);
        Order order = new Order();
        order.setId("1");
        order.setName("Blah");
        return order;
    }
}
