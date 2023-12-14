package com.xworkz.app;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface BiFunctionInt {
	
	public static void main(String[] args) {
        // Create a BiFunction that takes two integers and returns their sum.
		
		
        BiFunction<Integer, Integer, Integer> sum = (x, y) -> x = y;

        // Apply the BiFunction to the numbers 1 and 2.
        int result =sum.apply(3, 4);

        // Print the result.
        System.out.println(result); // 7
        
        System.out.println();
        

    		BiConsumer<String, Integer> biCon2 = (name, age) -> System.out.println(name + " " + age);
    		biCon2.accept("Peter", 28);
    	}
	
	
	
        
        
    }
	

	



