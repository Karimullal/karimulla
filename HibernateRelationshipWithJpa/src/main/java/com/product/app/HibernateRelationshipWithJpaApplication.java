package com.product.app;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.product.app.model.Address;
import com.product.app.model.Product;
import com.product.app.model.User;
import com.product.app.model.UserProfile;
import com.product.app.service.ProductService;
import com.product.app.service.UserService;

@SpringBootApplication
public class HibernateRelationshipWithJpaApplication implements CommandLineRunner{
	@Autowired
	private UserService userService;
	@Autowired
	private ProductService productService;

	public static void main(String[] args) {
		SpringApplication.run(HibernateRelationshipWithJpaApplication.class, args);
	}
	@Transactional
	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * User user = new User("jaitun@gmail.com", "jaitun", "jaitun", "shaik");
		 * Calendar cal = Calendar.getInstance(); cal.set(1996, 07, 22); UserProfile
		 * profile= new UserProfile(cal.getTime(), "female", "9866525100");
		 * user.setProfile(profile); Address address=new Address("Nehru nagar",
		 * "chilakaluripet", "guntur", "ap", "india", 522616L);
		 * user.setAddress(address); Product products= new Product("curry", 200.00, 1);
		 * user.addProducts(products); products.setUser(user);
		 * userService.saveUserDetails(user);
		 */
		/*
		 * User user = new User("karimulla@gmail.com", "karim", "karim", "shaik");
		 * UserProfile profile= new UserProfile(new Date("22/12/1993"), "male",
		 * "7995952191"); user.setProfile(profile); Address address1 = new
		 * Address("Nehru nagar", "Chilakaluripet", "Guntur", "AP", "India", 522616L);
		 * user.setAddress(address1);
		 * 
		 * userService.saveUserDetails(user);
		 */
		/*
		 * List<Product> products = new ArrayList<Product>(); Product product1 = new
		 * Product("Chair", 1000.00, 2); Product product2 = new Product("Bed", 2000.00,
		 * 1); User user = new User(); user.setId(3); product1.setUser(user);
		 * product2.setUser(user); products.add(product1); products.add(product2);
		 * productService.saveProductDetails(products);
		 */
		
		
	
		/*
		 * Optional<User> optional = userService.getUserDetails(3);
		 * System.out.println(optional); UserProfile profile =
		 * optional.get().getProfile(); System.out.println(profile); Address address =
		 * optional.get().getAddress(); System.out.println(address); List<Product>
		 * products = optional.get().getProducts(); products.forEach(p ->
		 * System.out.println(p));
		 */
		
		/*
		 * List<Product> products = productService.getAllProduct();
		 * products.forEach(System.out::println);
		 */
	}

}
