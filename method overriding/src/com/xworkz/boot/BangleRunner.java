package com.xworkz.boot;

import com.xworkz.app.Bangle;
import com.xworkz.app.SilverBangle;

public class BangleRunner {
	public static void main(String[] args) {
		System.out.println("invoking in main method");
		Bangle bangle=new SilverBangle();
		bangle.sound();
		}

}
