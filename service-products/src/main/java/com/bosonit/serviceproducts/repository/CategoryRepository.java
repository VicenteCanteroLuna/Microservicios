package com.bosonit.serviceproducts.repository;

import com.bosonit.serviceproducts.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
