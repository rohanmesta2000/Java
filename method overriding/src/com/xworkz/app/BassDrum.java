package com.xworkz.app;

public class BassDrum extends Drum {
	@Override
	public void sound() {
		System.out.println("invoking sound in BassDrum");
		 super.sound();
	}
}
