package com.product.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.app.model.User;
import com.product.app.model.response.ProductResponse;
import com.product.app.model.response.ProductUserResponse;
import com.product.app.repo.UserRepo;

@Service
public class UserService {
	@Autowired
	private UserRepo userRepo;
	@Autowired
	private UserProfileService profileService;
	@Autowired
	private AddressService addressService;
	@Autowired
	private ProductService productService;
	
	public User saveUserDetails(User user) {
		profileService.saveUserProfileDetails(user.getProfile());
		addressService.saveAddressDetails(user.getAddress());
		productService.saveProductDetails(user.getProducts());
		return userRepo.save(user);
	}
	
	public Optional<User> getUserDetails(int id){
		return userRepo.findById(id);
	}
		
	public List<ProductUserResponse> findAllProductsAndUsers() {
		List<ProductUserResponse> list = new ArrayList<ProductUserResponse>();
		List<User> users = userRepo.findAll();
		for (User user : users) {
			List<ProductResponse> products = productService.findProductsByUserId(user.getId());
			ProductUserResponse productUserResponse = new ProductUserResponse(user, products);
			list.add(productUserResponse);
		}
		return list;
	}	
	
}
