package com.xworkz.app;

import java.util.function.DoubleBinaryOperator;
import java.util.function.Predicate;

public class Prediction {
	
//predicate -- boolean result
	public static void main(String[] args) {
		Predicate<String> checkLength=str->str.length()>6;
		//checking if length of string >6--true--else--false
		System.out.println(checkLength.test("c"));
		
		
		

		   
		        DoubleBinaryOperator adder = (a, b) -> a + b;

		        // Apply the DoubleBinaryOperator to two double values.
		        double result = adder.applyAsDouble(1.0, 2.0);

		        // Print the result.
		        System.out.println(result); // 3.0
		    }

		
	}

 