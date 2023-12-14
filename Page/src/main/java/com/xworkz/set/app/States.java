package com.xworkz.set.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class States {

	public static void main(String[] args) {
		Collection<String> collection = new ArrayList();

		collection.add("Andhra Pradesh");
		collection.add("Arunachal Pradesh");
		collection.add("Assam");
		collection.add("Bihar");
		collection.add("Chhattisgarh");
		collection.add("Goa");
		collection.add("Gujarat");
		collection.add("Haryana");
		collection.add("Himachal Pradesh");
		collection.add("Jharkhand");
		collection.add("Karnataka");
		collection.add("Kerala");
		collection.add("Madhya Pradesh");
		collection.add("Maharashtra");
		collection.add("Manipur");
		collection.add("Meghalaya");
		collection.add("Mizoram");
		collection.add("Nagaland");
		collection.add("Odisha");
		collection.add("Punjab");
		collection.add("Rajasthan");
		collection.add("Sikkim");
		collection.add("Tamil Nadu");
		collection.add("Telangana");
		collection.add("Tripura");
		collection.add("Uttar Pradesh");
		collection.add("Uttarakhand");
		collection.add("West Bengal");

		System.out.println("Total States: " + collection.size());

		Iterator<String> itr = collection.iterator();
		while (itr.hasNext()) {
			System.out.println("State: " + itr.next());
		}
	}
	
}

