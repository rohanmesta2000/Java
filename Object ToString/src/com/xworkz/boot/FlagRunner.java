package com.xworkz.boot;

import com.xworkz.java.Flag;

public class FlagRunner {
	public static void main(String[] args) {
		 System.out.println("Invoking main in Flag Runner");
		    
		    Flag flag = new Flag("India", "Saffron,White,Dark Green","Stars and Stripes");
	        System.out.println(flag);
	        
	        Flag flag1 = new Flag("United States", "Red, White, Blue","Stars and Stripes");
	        System.out.println(flag1);

	        Flag flag2 = new Flag("Japan", "White, Red","Red Circle");
	        System.out.println(flag2);
	}

}
