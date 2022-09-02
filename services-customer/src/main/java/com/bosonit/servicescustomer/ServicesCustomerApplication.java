package com.bosonit.servicescustomer;

import com.bosonit.servicescustomer.entity.Customer;
import com.bosonit.servicescustomer.entity.Region;
import com.bosonit.servicescustomer.repository.CustomerRepository;
import com.bosonit.servicescustomer.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import javax.annotation.PostConstruct;
import java.util.Date;

@SpringBootApplication
@EnableEurekaClient
public class ServicesCustomerApplication {

	@Autowired
	RegionRepository regionRepository;

	@Autowired
	CustomerRepository customerRepository;


	public static void main(String[] args) {
		SpringApplication.run(ServicesCustomerApplication.class, args);
	}

	@PostConstruct
	public void crearClientes() {
		regionRepository.save(new Region(1L, "América"));
		regionRepository.save(new Region(2L, "Europa"));
		regionRepository.save(new Region(3L, "Africa"));
		regionRepository.save(new Region(4L, "Oceanía"));
		regionRepository.save(new Region(5L, "Asia"));

		customerRepository.save(new Customer(1L, "32404580", "Andrés", "Guzmán", "profesor@emil.com", "", new Region(1L, "Américas"), "CREATED"));
	}
}
