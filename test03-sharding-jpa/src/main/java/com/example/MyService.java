package com.example;

import com.example.entity.order.Order;
import com.example.entity.user.User;
import com.example.repository.user.UserRepository;
import com.example.repository.order.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;

@Service
public class MyService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    public void saveUserAndOrder() {
        // 使用用户数据源
        User user = new User();
        user.setId(new Date().getTime());
        user.setUsername("John Doe");
        user.setName("John Doe");
        user.setEmail("xxxxxx@example.com");
        userRepository.save(user);

        Order order = new Order();
        order.setId(new Date().getTime());
        order.setOrdernumber("Laptop");
        order.setAmount(new BigDecimal("100.00"));
        orderRepository.save(order);

    }


    void find(){
        userRepository.findAll();
        orderRepository.findAll();
    }

}