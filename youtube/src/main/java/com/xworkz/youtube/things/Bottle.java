package com.xworkz.youtube.things;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class Bottle {
public Bottle() {
System.out.println("created bottle");	
}
@Bean
public Bottle bottle1() {
	System.out.println("Created new bottlee list");
	Bottle bottle1=new Bottle();
	return bottle1;
	
}


}
