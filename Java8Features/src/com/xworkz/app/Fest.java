package com.xworkz.app;

public class Fest {
	int num = 5;

	public void method() {
		for (int i = 0; i < 10; i++) {
			if (num / 0 == i) {

			}
		}
	}

	public static void main(String[] args) {
		Fest f = new Fest();
		f.method();
	}
}




