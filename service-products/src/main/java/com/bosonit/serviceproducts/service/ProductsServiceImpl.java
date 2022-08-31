package com.bosonit.serviceproducts.service;

import com.bosonit.serviceproducts.entity.Category;
import com.bosonit.serviceproducts.entity.Product;
import com.bosonit.serviceproducts.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class ProductsServiceImpl implements ProductsService {
    @Autowired
    private ProductsRepository productsRepository;

    @Override
    public List<Product> listAllProducts() {
        return productsRepository.findAll();
    }

    @Override
    public Product getProduct(Long id) {
        return productsRepository.findById(id).orElse(null);
    }

    @Override
    public Product createProduct(Product product) {
        product.setStatus("CREATED");
        product.setCreateAt(new Date());
        return productsRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        Product productDB= getProduct(product.getId());
        if(null == productDB){
            return null;
        }
        productDB.setName(product.getName());
        productDB.setDescription(product.getDescription());
        productDB.setCategory(product.getCategory());
        productDB.setPrice(product.getPrice());
        return productsRepository.save(productDB);
    }

    @Override
    public Product deleteProduct(Long id) {
        Product productDB= getProduct(id);
        if(null == productDB){
            return null;
        }
        productDB.setStatus("DELETED");
        return productsRepository.save(productDB);
    }

    @Override
    public List<Product> findByCategory(Category category) {
        return productsRepository.findByCategory(category);
    }

    @Override
    public Product updateStock(Long id, double quantity) {
        Product productDB= getProduct(id);
        if(null == productDB){
            return null;
        }
        Double stock =productDB.getStock() + quantity;
        productDB.setStock(stock);
        return productsRepository.save(productDB);
    }
}

//https://www.youtube.com/watch?v=ag92DYmen84&list=PLxy6jHplP3Hi_W8iuYSbAeeMfaTZt49PW&index=5