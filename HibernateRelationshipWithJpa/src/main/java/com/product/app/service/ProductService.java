package com.product.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.app.model.Product;
import com.product.app.model.response.ProductResponse;
import com.product.app.repo.ProductRepo;

@Service
public class ProductService {
	@Autowired
	private ProductRepo productRepo;

	public List<Product> saveProductDetails(List<Product> product) {
		return productRepo.saveAll(product);
	}

	public List<ProductResponse> getAllProduct() {
		List<ProductResponse> listProductResponse = new ArrayList<ProductResponse>();
		List<Product> products = productRepo.findAll();
		for (Product product : products) {
			ProductResponse productResponse = new ProductResponse(product.getId(), product.getProductName(),
					product.getPrice(), product.getQuantity(), product.getUser().getId());
			listProductResponse.add(productResponse);
		}
		return listProductResponse;
	}
	
	public List<ProductResponse> findProductsByUserId(int id) {
		List<Product> products = productRepo.findProductsByUserId(id);
		List<ProductResponse> list = new ArrayList<ProductResponse>();
		for(Product product : products) {
			ProductResponse response = new ProductResponse();
			response.setId(product.getId());response.setPrice(product.getPrice());
			response.setQuantity(product.getQuantity());response.setProductName(product.getProductName());
			list.add(response);
		}
		return list;
	}
}
