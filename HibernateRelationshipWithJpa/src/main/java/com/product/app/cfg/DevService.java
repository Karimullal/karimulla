package com.product.app.cfg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class DevService implements ProfileDemoService{
	@Value("${msg}")
	private String name;

	@Override
	public String name() {
		return this.name;
	}

}
