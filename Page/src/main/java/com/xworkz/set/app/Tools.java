package com.xworkz.set.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Tools {

	public static void main(String[] args) {
		Collection<String> tools = new ArrayList();
		tools.add("Plier");
		tools.add("Spanner");
		tools.add("Hammer");
		tools.add("Saw");
		tools.add("Screw Driver");
		tools.add("Jack");
		tools.add("Cutter");

		Collection<String> tools1 = new ArrayList();
		tools1.add("FlashLight");
		tools1.add("wrench");

		tools1.addAll(tools);

		Collection<String> tools2 = new ArrayList();
		tools2.add("Saw");
		tools2.add("Spanner");

		Collection<String> tools3 = new ArrayList();
		tools3.add("Spanner");
		tools3.add("Screw");

		boolean cont = tools.containsAll(tools1);
		System.out.println(cont);
		System.out.println(tools1.size());

		boolean cont1 = tools.removeAll(tools3);
		System.out.println(cont1);
		System.out.println(tools3.size());

		boolean cont2 = tools1.containsAll(tools2);
		System.out.println(cont2);
		System.out.println(tools2.size());

		System.out.println(tools1);

		System.out.println(tools);

	}

}



