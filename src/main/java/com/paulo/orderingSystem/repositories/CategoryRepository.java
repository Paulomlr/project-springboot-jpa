package com.paulo.orderingSystem.repositories;

import com.paulo.orderingSystem.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository -> não é necessário pois ela está herdando do JpaRepository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
