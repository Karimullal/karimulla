package com.product.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.app.model.response.ProductResponse;
import com.product.app.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	@GetMapping(value = "/")
	private ResponseEntity<List<ProductResponse>> getProducts(){
		return new ResponseEntity<List<ProductResponse>>(productService.getAllProduct(), HttpStatus.OK);
	}
	
	
	@GetMapping(value = "/findProductsByUserId/{userId}")
	private List<ProductResponse> findProductsByUserId(@PathVariable("userId") int id) {
		List<ProductResponse> products = productService.findProductsByUserId(id);
		return products;
	}
}
