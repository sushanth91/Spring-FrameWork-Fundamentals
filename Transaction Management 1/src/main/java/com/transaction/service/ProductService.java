package com.transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.transaction.entity.Product;
import com.transaction.repository.ProductRepo;

@Component
public class ProductService {

	private final ProductRepo productRepo;

	@Autowired
	public ProductService(ProductRepo productRepo) {
		this.productRepo = productRepo;
	}

	@Transactional(rollbackFor = Exception.class)
	//@Transactional(noRollbackFor =RuntimeException.class)
	public void saveProductInfo() throws Exception {
		Product product = new Product();

		for (int i = 1; i <= 10; i++) {
			product.setId(i);
			product.setName("product " + i);
			productRepo.saveProduct(product);
			
			// Un Checked Exception
			if(i==7) {
				throw new RuntimeException("runtime exception");
			}
			
			// Checked Exception
			
//			if(i==7) {
//				throw new Exception("runtime exception");
//			}

		}

	}

}// commit
