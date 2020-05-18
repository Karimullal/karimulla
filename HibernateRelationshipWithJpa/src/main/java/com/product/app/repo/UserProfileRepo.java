package com.product.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.app.model.UserProfile;

public interface UserProfileRepo extends JpaRepository<UserProfile, Integer>{

}
