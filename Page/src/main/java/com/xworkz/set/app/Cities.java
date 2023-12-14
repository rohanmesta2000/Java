package com.xworkz.set.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Cities {

	public static void main(String[] args) {

		Collection<String> cityCollection = new ArrayList<>();

		cityCollection.add("Bangalore");
		cityCollection.add("Mysore");
		cityCollection.add("Hubli");
		cityCollection.add("Mangalore");
		cityCollection.add("Belgaum");
		cityCollection.add("Gulbarga");
		cityCollection.add("Davanagere");
		cityCollection.add("Bellary");
		cityCollection.add("Shimoga");
		cityCollection.add("Hospet");
		cityCollection.add("Tumkur");
		cityCollection.add("Raichur");
		cityCollection.add("Bidar");
		cityCollection.add("Gadag");
		cityCollection.add("Hassan");
		cityCollection.add("Bagalkot");
		cityCollection.add("Kolar");
		cityCollection.add("Udupi");
		cityCollection.add("Chitradurga");
		cityCollection.add("Honnavar");

		System.out.println("Total Karnataka Cities: " + cityCollection.size());

		Iterator<String> itr = cityCollection.iterator();
		while (itr.hasNext()) {
			System.out.println("Cities: " + itr.next());
		}

	}
	
	

}

 
