package com.product.app.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.product.app.model.ImageModel;
import com.product.app.service.ImageService;
import com.product.app.util.ImageHelperClass;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/image")
public class ImageController {

	@Autowired
	private ImageService imageService;
	@Autowired
	private ImageHelperClass imageHelperClass;
	
	@PostMapping("/upload")
	public ResponseEntity saveImage(@RequestParam("imageFile") MultipartFile file) throws IOException {
		ImageModel imageModel = new ImageModel(file.getOriginalFilename(), file.getContentType(), imageHelperClass.compressImage(file.getBytes()));
		imageModel = imageService.saveImage(imageModel);
		return new ResponseEntity(HttpStatus.OK);		
	}
	
	@GetMapping("/get/{imageName}")
	public ResponseEntity<ImageModel> getImage(@PathVariable("imageName") String imageName) throws IOException {
		ImageModel model = imageService.getImageByName(imageName);
		ImageModel imageModel = new ImageModel(model.getName(), model.getType(), imageHelperClass.decompressBytes(model.getPicImage()));
		return new ResponseEntity<ImageModel>(imageModel,HttpStatus.OK);		
	}
	
	
	
}
