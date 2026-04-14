package com.customer.Customer.Management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerManagementApplication {

	public static void main(String[] args) {
		System.out.println("Started");
		SpringApplication.run(CustomerManagementApplication.class, args);
	}

}
