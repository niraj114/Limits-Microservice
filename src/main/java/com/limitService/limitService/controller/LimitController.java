package com.limitService.limitService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.limitService.limitService.bean.Limits;
import com.limitService.limitService.configuration.Configuration;

@RestController
public class LimitController {
	
	@Autowired
	public Configuration  configuration;
	
	@GetMapping("/limits")
	public Limits retrieveLimits() {
		return new Limits(configuration.getMinimum(), configuration.getMaximum());
		
	}

}
