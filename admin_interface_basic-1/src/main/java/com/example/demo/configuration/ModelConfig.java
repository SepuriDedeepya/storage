package com.example.demo.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class ModelConfig {
	@Bean
	public ModelMapper modelMapper() {
		// TODO Auto-generated method stub
		return new ModelMapper();
	}
	
}
