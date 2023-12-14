package com.xworkz.youtube.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Temple {
	private Generator generator1;
	private Tile tile1;
	private Elevator elevator1;

	@Autowired
	public Temple(Generator generator1, Tile tile1, Elevator elevator1) {
		System.out.println("craeted  Temple");
		this.generator1 = generator1;
		this.tile1 = tile1;
		this.elevator1 = elevator1;
	}

}
