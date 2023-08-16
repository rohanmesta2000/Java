package com.xworkz.boot;

import com.xworkz.java.Logo;

public class LogoKiller {

	
		public void main(String[] args) {
		System.out.println("Invoking main in Logo Maker");
		Logo logo=new Logo("Mercedes Benz","Silver",100,200,"https://www.Mercedes-Benz-logo.png");
		System.out.println(logo);
		
		Logo logo1=new Logo("BMW","White and Blue",280,100,"https://www.Bmw-logo.png");
		System.out.println(logo1);
		
		Logo logo2=new Logo("Nissan Gtr","Red,Black and Silver",290,230,"https://www.Nissan_gtr-logo.png");
		System.out.println(logo2);
		}
	}

	
