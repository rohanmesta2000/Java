package com.xworkz.youtube.things;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Radio {
	public Radio() {
		System.out.println("craeted  Radio");
		}
		@Bean
		public Radio radio1() {
			System.out.println("created Elevator in radio config");
			Radio radio=new Radio();
			return radio;
			
		}
}
