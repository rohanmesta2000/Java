package com.xworkz.app;

public class DynamicMic extends Mic {
	@Override
	public void sound() {
		System.out.println("invoking sound in DynamicMic");
		 super.sound();
	}
}
