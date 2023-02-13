package com.aetiosdigital.projetowebv1.config;

import com.aetiosdigital.projetowebv1.entities.Order;
import com.aetiosdigital.projetowebv1.entities.User;
import com.aetiosdigital.projetowebv1.entities.enums.OrderStatus;
import com.aetiosdigital.projetowebv1.repositories.OrderRepository;
import com.aetiosdigital.projetowebv1.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "user 1", "user1@gmail.com", "988888888", "123456");
        User u2 = new User(null, "user 2", "user2@gmail.com", "977777777", "123456");

        Order o1 = new Order(null, Instant.parse("2023-02-10T13:30:07Z"), OrderStatus.DELIVERED,u1);
        Order o2 = new Order(null, Instant.parse("2023-02-11T14:30:10Z"),OrderStatus.CANCELED, u2);
        Order o3 = new Order(null, Instant.parse("2023-02-12T15:30:22Z"),OrderStatus.WAITING_PAYMENT, u1);

        userRepository.saveAll(Arrays.asList(u1,u2));
        orderRepository.saveAll(Arrays.asList(o1,o2,o3));
    }
}
