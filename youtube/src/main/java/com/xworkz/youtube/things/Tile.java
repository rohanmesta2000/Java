package com.xworkz.youtube.things;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Component 
public class Tile {
	private Perfume perfume1;
	public Tile(Perfume perfume1) {
		this.perfume1=perfume1;
		System.out.println("craeted  perfume" +this.perfume1);
		}


}
