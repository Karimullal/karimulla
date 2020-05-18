package com.product.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.app.model.Passport;

public interface PassportRepo extends JpaRepository<Passport, Integer>{

}
