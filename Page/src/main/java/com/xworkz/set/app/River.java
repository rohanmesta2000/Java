package com.xworkz.set.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class River {

	public static void main(String[] args) {
		Collection<String> collection = new ArrayList();

		collection.add("kaveri");
		collection.add("saravati");
		collection.add("tunga");
		collection.add("yamuna");
		collection.add("riverNile");
		System.out.println("Total Rivers :" + collection.size());

		Iterator<String> itr = collection.iterator();
		while (itr.hasNext()) {
			System.out.println("elements" + itr.next());
		}

		collection.remove("tunga");
		Iterator<String> itr1 = collection.iterator();
		while (itr.hasNext()) {
			System.out.println("elements" + itr1.next());

		}

		collection.addAll(null);
		Iterator<String> itr6 = collection.iterator();
		while (itr.hasNext()) {
			System.out.println("elements" + itr6.next());
		}

		collection.contains("riverNile");
		Iterator<String> itr2 = collection.iterator();
		while (itr2.hasNext()) {
			System.out.println("elements" + itr.next());
		}

		collection.containsAll(null);
		Iterator<String> itr7 = collection.iterator();
		while (itr7.hasNext()) {
			System.out.println("elements" + itr.next());
		}

		collection.removeAll(null);
		Iterator<String> itr5 = collection.iterator();
		while (itr5.hasNext()) {
			System.out.println("elements" + itr.next());
		}

		collection.clear();
		Iterator<String> itr4 = collection.iterator();
		while (itr4.hasNext()) {
			System.out.println("elements" + itr.next());
		}

		collection.isEmpty();
		Iterator<String> itr3 = collection.iterator();
		while (itr3.hasNext()) {
			System.out.println("elements" + itr.next());
		}
	}
}



