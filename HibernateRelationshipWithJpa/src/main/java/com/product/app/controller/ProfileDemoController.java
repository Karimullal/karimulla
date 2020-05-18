package com.product.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.app.cfg.ProfileDemoService;
@RestController
@RequestMapping("/demo")
public class ProfileDemoController {
	@Autowired
	private ProfileDemoService demoService;
	@RequestMapping("/demo")
	private String getName(){
		return demoService.name();
	}
}
