package com.product.app.model.response;

import java.util.List;

import com.product.app.model.User;

public class ProductUserResponse {
	
	private User user;
	private List<ProductResponse> products;
	public ProductUserResponse(User user, List<ProductResponse> listOfProduct) {
		this.user = user;
		this.products = listOfProduct;
	}
	public ProductUserResponse() {
	}
	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
	/**
	 * @return the list
	 */
	public List<ProductResponse> getList() {
		return products;
	}
	/**
	 * @param list the list to set
	 */
	public void setList(List<ProductResponse> products) {
		this.products = products;
	}
	
}
