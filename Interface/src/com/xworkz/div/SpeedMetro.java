package com.xworkz.div;

import com.xworkz.app.Metro;

public class SpeedMetro implements Metro{

	@Override
	public int ticket() {
		System.out.println("ticket");
		return 30;
	}

	@Override
	public String junction() {
		System.out.println("junction");
		return null;
	}

	@Override
	public double passenger() {
		System.out.println("passenger");
		return 1990;
	}

}
