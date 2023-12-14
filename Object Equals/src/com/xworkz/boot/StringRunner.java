package com.xworkz.boot; 

public class StringRunner {
	public static void main(String[] args) {
		
		String string=new String();
		System.out.println("invoking in main method");
		string="Rohit Sharma";
		char ref=string.charAt(7);
		System.out.println(ref);
		
		
		System.out.println("invoking in split[] method");
		String[] ref1=string.split("h");
		for(int i=0;i<ref1.length;i++)
		{
			System.out.println(ref1[i]);
		}
	    
		System.out.println("invoking in split-overload[] method");
		String[] ref2=string.split("o",13);
		for(int i=0;i<ref2.length;i++)
		{
			System.out.println(ref2[i]);
		}
		
		System.out.println("invoking in concat[] method");
		String ref3=string.concat("h");
		System.out.println(ref3);
		
		System.out.println("invokig in compareTo[] method");
		int ref4=string.compareTo("a");
		System.out.println(ref4);
		
		
		System.out.println("invokig in substringover[] method");
		String ref5=string.substring(3);
		System.out.println(ref5);
		
		
		
		System.out.println("invokig in substringoverloaded[] method");
		String ref6=string.substring(1, 9);
		System.out.println(ref6);
		
		
		
		System.out.println("invokig in isEmpty[] method");
		Boolean ref7=string.isEmpty();
		System.out.println(ref7);
		
		
		System.out.println("invokig in length[] method");
		int ref8=string.length();
		System.out.println(ref8);
		
		
		System.out.println("invokig in startwith[] method");
		Boolean ref9=string.startsWith("R");
		System.out.println(ref9);
		
		
		System.out.println("invokig in endsWith[] method");
		Boolean word=string.endsWith("a");
		System.out.println(word);
		
		System.out.println("invokig in equalsIgnorecare[] method");
		Boolean ref10=string.equalsIgnoreCase("m");
		System.out.println(ref10);
		
		System.out.println("invokig in equals[] method");
		Boolean ref11=string.equals("a");
		System.out.println(ref11);
		
		
		System.out.println("invokig in uppercase[] method");
		String ref12=string.toUpperCase();
		System.out.println(ref12);
		
		System.out.println("invokig in lowercase[] method");
		String ref13=string.toLowerCase();
		System.out.println(ref13);
		
		
		System.out.println("invokig in isBlank[] method");
		Boolean ref14=string.isBlank();
		System.out.println(ref14);
		
		
		System.out.println("invokig in indexOf[] method");
		int ref15=string.indexOf(9);
		System.out.println(ref15);
		
		
		System.out.println("invokig in trim[] method");
		String ref16=string.trim();
		System.out.println(ref16);
		

	}
	
}
