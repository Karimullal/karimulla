package com.product.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.app.model.Address;
import com.product.app.repo.AddressRepo;

@Service
public class AddressService {
	@Autowired
	private AddressRepo addressRepo;
	
	public Address saveAddressDetails(Address address) {
		return addressRepo.save(address);
	}
}
