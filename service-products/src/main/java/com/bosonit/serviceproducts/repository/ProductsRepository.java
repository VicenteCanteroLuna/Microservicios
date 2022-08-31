package com.bosonit.serviceproducts.repository;

import com.bosonit.serviceproducts.entity.Category;
import com.bosonit.serviceproducts.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductsRepository extends JpaRepository<Product, Long> {

    public List<Product> findByCategory(Category category);
}
