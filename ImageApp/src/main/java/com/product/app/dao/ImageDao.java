package com.product.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.app.model.ImageModel;

public interface ImageDao extends JpaRepository<ImageModel, Integer>{	
	ImageModel findByName(String imageName);
}
