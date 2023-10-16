package com.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.transaction.service.ProductService;

@SpringBootApplication
@ComponentScan("com.transaction")
public class TransactionApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TransactionApplication.class, args);
		
//		
//		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(ProductConfig.class);
//		context.registerShutdownHook();
//		
//		ProductService productService = context.getBean("productService", ProductService.class);
//		
//		
		//context.close();
	}
	

	@Autowired
	ProductService productService;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		productService.saveProductInfo();
		
	}

}
