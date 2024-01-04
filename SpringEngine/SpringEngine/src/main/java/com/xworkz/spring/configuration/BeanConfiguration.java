package com.xworkz.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.spring")
@EnableWebMvc
public class BeanConfiguration {
	public BeanConfiguration() {
		// TODO Auto-generated constructor stub
		System.out.println("created bean configuration");
	}

	@Bean
	public ViewResolver viewResolver() {
		System.out.println("created viewResolver");
		ViewResolver resolver = new InternalResourceViewResolver("/", ".jsp");
		return resolver;
	}

}
