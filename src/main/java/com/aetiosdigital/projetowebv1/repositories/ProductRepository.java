package com.aetiosdigital.projetowebv1.repositories;

import com.aetiosdigital.projetowebv1.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
