package com.product.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.app.model.Review;

public interface ReviewRepo extends JpaRepository<Review, Integer>{

}
