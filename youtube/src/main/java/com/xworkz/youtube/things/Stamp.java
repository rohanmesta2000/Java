package com.xworkz.youtube.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component

public class Stamp {
	private Bottle bottle1;
	
	@Autowired
	 public Stamp(Bottle bottle1) {
		System.out.println("created stamp");
		this.bottle1=bottle1;
	}

}
