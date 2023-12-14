package com.xworkz.youtube.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.youtube.things.Bottle;
import com.xworkz.youtube.things.Bulb;
import com.xworkz.youtube.things.Elevator;
import com.xworkz.youtube.things.Generator;

@Configuration
@ComponentScan("com.xworkz.youtube")
public class SpringConfig {
	public SpringConfig() {
	System.out.println("created SpringConfig");
	}
	@Bean
	public void beanMethod() {
		System.out.println("created beanmethod");
	}
	
	@Bean
	public Bottle bottle1() {
		System.out.println("Created new bottlee list");
		Bottle bottle1=new Bottle();
		return bottle1;
		
	}
	
	@Bean
	public Bulb bulb1() {
		System.out.println("created Bulb in bean config");
		Bulb bulb=new Bulb();
		return bulb;
		
	}
	
	
	@Bean
	public Generator generator1() {
		System.out.println("created Generator in bean config");
		Generator generator=new Generator();
		return generator;
		
	}
	@Bean
	public Elevator elevator1() {
		System.out.println("created Elevator in bean config");
		Elevator elevator=new Elevator(null);
		return elevator;
		
	}

}
