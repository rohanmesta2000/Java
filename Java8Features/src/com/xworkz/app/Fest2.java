package com.xworkz.app;

public class Fest2 {

	// Main driver method
	public static void main(String[] args) {
		// Size of array is 10 
		int[] a = new int[10];

		// Case 1: Custom index within array size
		// Valid
		System.out.println(a[0]);

		// Case 2: Index greater than the size of the array
		// Invalid
		// ArrayIndexOutOfBoundsException
		System.out.println(a[100]);

		// ArrayIndexOutOfBoundsException
		System.out.println(a[-100]);
	}
}
