package com.product.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.app.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{
}
