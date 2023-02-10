package com.aetiosdigital.projetowebv1.repositories;

import com.aetiosdigital.projetowebv1.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}