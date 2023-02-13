package com.aetiosdigital.projetowebv1.repositories;

import com.aetiosdigital.projetowebv1.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
