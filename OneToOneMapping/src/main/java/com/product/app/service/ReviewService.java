package com.product.app.service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.app.model.Course;
import com.product.app.model.Review;
import com.product.app.repo.ReviewRepo;

@Service
public class ReviewService {
	@Autowired
	private ReviewRepo reviewRepo;
	@Autowired
	private CourseService courseService;
	
	public void saveReview(Review review) {
		Optional<Course> optional = courseService.getById(review.getCourse().getId());
		if(optional.get() != null)
			reviewRepo.save(review);
	}
	
	public void saveReviews(int id,List<Review> reviews) {
		Optional<Course> optional = courseService.getById(id);
		if(optional.get() != null) {
			List<Review> list = optional.get().getListReviews();
			list.forEach(System.out::println);
			reviewRepo.saveAll(reviews);
		}
	}
}
