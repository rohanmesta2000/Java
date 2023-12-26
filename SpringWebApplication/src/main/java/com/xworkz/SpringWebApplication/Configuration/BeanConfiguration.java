 package com.xworkz.SpringWebApplication.Configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.SpringWebApplication")
public class BeanConfiguration {
	public BeanConfiguration() {
		// TODO Auto-generated constructor stub
		System.out.println("created bean successfully");
	}

}
