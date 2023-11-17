package com.xworkz.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Roles {
	public static void main(String[] args) {

		Collection<String> roles = new ArrayList<String>();
		roles.add("Software Enginnering");
		roles.add("Data Analyst");
		roles.add("Web Developer");
		roles.add("Manager");
		roles.add("HR");
		roles.add("Java Developer");
		roles.add("Recuriter");
		roles.add("Automation Tester");
		roles.add("Performance Tester");
		roles.add("System Support");
		roles.add("Architect");

		System.out.println("total number of roles" + roles.size());

		System.out.println(".............");

		for (String ref : roles) {
			if (ref.endsWith("Tester")) {
				System.out.println(ref);
			}
		}
		System.out.println("...............");
		roles.stream().filter((ref) -> ref.endsWith("Java Developer")).forEach(r -> System.out.println(r));
		System.out.println("...........");

		roles.stream().filter((ref) -> !ref.contains("r")).forEach(r1 -> System.out.println(r1));
        System.out.println("......................");
        
        roles.stream().filter(ref->ref.contains("m")).collect(Collectors.toList());
	System.out.println("............");
	
	   roles.stream().filter(ref->ref.contains("m")).forEach(r2 -> System.out.println(r2));
		System.out.println("............");
	
		
		
	}
}
