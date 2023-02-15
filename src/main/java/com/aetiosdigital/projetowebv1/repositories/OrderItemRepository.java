package com.aetiosdigital.projetowebv1.repositories;

import com.aetiosdigital.projetowebv1.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
