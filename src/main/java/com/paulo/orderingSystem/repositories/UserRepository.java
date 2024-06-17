package com.paulo.orderingSystem.repositories;

import com.paulo.orderingSystem.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
