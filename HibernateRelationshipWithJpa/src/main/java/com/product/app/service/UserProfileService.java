package com.product.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.app.model.UserProfile;
import com.product.app.repo.UserProfileRepo;

@Service
public class UserProfileService {
	@Autowired
	private UserProfileRepo profileRepo;
	
	public UserProfile saveUserProfileDetails(UserProfile profile) {
		return profileRepo.save(profile);
	}
	
	/*
	 * public Optional<UserProfile> getUserProfileDetails(int id) { return
	 * profileRepo.findById(id); }
	 */
}
