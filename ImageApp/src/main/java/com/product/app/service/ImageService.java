package com.product.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.app.dao.ImageDao;
import com.product.app.model.ImageModel;

@Service
public class ImageService {

	@Autowired
	private ImageDao imageDao;
	
	
	public ImageModel saveImage(ImageModel imageModel) {
		return imageDao.save(imageModel);
	} 
	
	public ImageModel getImageByName(String imageName) {
		return imageDao.findByName(imageName);
	} 
	
}
