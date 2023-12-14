package com.xworkz.constant;

import java.util.Scanner;

public class ExceptionCo {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		int quotient=0;
		while(a>=b) {
			a=a-b;
			quotient++;
		}
		
		System.out.println("Quotient is" +quotient +"reamainder" +a);
	}
	
	
	
	
}
