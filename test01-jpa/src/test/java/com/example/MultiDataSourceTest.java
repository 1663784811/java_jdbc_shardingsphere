package com.example;

import com.example.entity.user.User;
import com.example.entity.order.Order;
import com.example.repository.user.UserRepository;
import com.example.repository.order.OrderRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class MultiDataSourceTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Test
    public void testSaveUserAndOrder() {
        User user = new User();
        user.setId(new Date().getTime());
        user.setName("John Doe");
        userRepository.save(user);

        Order order = new Order();
        order.setId(new Date().getTime());
        order.setProductName("Laptop");
        orderRepository.save(order);
    }
}