package com.paulo.orderingSystem.repositories;

import com.paulo.orderingSystem.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository -> não é necessário pois ela está herdando do JpaRepository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
