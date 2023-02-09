package com.aetiosdigital.projetowebv1.repositories;

import com.aetiosdigital.projetowebv1.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
