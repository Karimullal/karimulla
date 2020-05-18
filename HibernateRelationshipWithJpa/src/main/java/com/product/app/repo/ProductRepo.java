package com.product.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.product.app.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{
	@Query(value ="Select * from PRODUCT_TBL p where p.USER_ID=?1",nativeQuery = true)
	public List<Product> findProductsByUserId(int id);
}
