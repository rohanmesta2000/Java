package com.xworkz.scientist.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.scientist")
@EnableWebMvc
public class BeanConfiguration {
public BeanConfiguration() {
	System.out.println("Created BeanConfiguration");
}

@Bean
public ViewResolver viewResolver() {
	System.out.println("created viewResolver");
	ViewResolver resolver= new InternalResourceViewResolver("/",".jsp");
	return resolver;
}
}