package com.product.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.app.model.Passport;
import com.product.app.repo.PassportRepo;

@Service
public class PassportService {
	@Autowired
	private PassportRepo passportRepo;
	
	public Passport savePassportDetails(Passport passport) {
		return passportRepo.save(passport);		 
	}
	
	public List<Passport> getAllPassportDetails() {
		return passportRepo.findAll();		 
	}
	
	public Optional<Passport> getPassportDetails(Integer id){
		return passportRepo.findById(id);
	}
}
