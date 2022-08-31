package com.bosonit.serviceproducts.service;

import com.bosonit.serviceproducts.entity.Category;
import com.bosonit.serviceproducts.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductsService {

    public List<Product> listAllProducts();

    public Product getProduct(Long id);

    public Product createProduct(Product product);

    public Product updateProduct(Product product);

    public Product deleteProduct(Long id);

    public List<Product> findByCategory(Category category);

    public Product updateStock(Long id, double quantity);

}

//https://www.youtube.com/watch?v=ag92DYmen84&list=PLxy6jHplP3Hi_W8iuYSbAeeMfaTZt49PW&index=5
