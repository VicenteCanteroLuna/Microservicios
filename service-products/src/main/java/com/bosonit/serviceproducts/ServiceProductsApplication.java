package com.bosonit.serviceproducts;

import com.bosonit.serviceproducts.entity.Category;
import com.bosonit.serviceproducts.entity.Product;
import com.bosonit.serviceproducts.repository.CategoryRepository;
import com.bosonit.serviceproducts.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Date;

@SpringBootApplication
public class ServiceProductsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceProductsApplication.class, args);
	}

	@Autowired
	ProductsRepository productsRepository;

	@Autowired
	CategoryRepository categoryRepository;

	@PostConstruct
	public void crearCategorias(){
		categoryRepository.save(new Category(1L, "shoes"));
		categoryRepository.save(new Category(2L, "books"));
		categoryRepository.save(new Category(3L, "electronics"));
		productsRepository.save(new Product(1L, "adidas","Walk in the air in the black / black CLOUDFOAM ULTIMATE running shoe from ADIDAS",
				5.0,178.89,"CREATED",new Date(), new Category(1L, "shoes")));
		productsRepository.save(new Product(2L, "nike","CLOUDFOAM ULTIMATE running shoe from nike",15.0,78.89,"CREATED",new Date(), new Category(1L, "shoes")));
		productsRepository.save(new Product(3L, "libro","el principito",2.0,34.0,"CREATED",new Date(), new Category(2L, "books")));
	}
}
