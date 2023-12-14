package com.xworkz.youtube.things;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Elevator {
	private Perfume perfume;
	
	
	public Elevator(Perfume perfume) {
		super();
		System.out.println("craeted  Elevator");
		this.perfume = perfume;
		System.out.println("perfume: "+this.perfume);
	}


 
		
}
