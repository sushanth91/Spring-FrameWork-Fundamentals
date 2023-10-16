package com.transaction.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.transaction.entity.Product;

@Repository
public class ProductRepo {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Transactional(propagation = Propagation.REQUIRED)     // 
	//@Transactional(propagation = Propagation.REQUIRES_NEW) // starts new transaction
	public void saveProduct(Product product) {
		String sql = "INSERT INTO PRODUCT VALUES (?, ?)";
	Object[] args = {product.getId(),product.getName()};
	jdbcTemplate.update(sql, args);
	System.out.println("saved");
		
	}
}
