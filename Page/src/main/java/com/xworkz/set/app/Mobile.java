package com.xworkz.set.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Mobile {

	public static void main(String[] args) {
		Collection<Long> collection = new ArrayList();
		collection.add(9538984440l);
		collection.add(7624941824l);
		collection.add(8495924401l);
		collection.add(789221960l);
		collection.add(7892156871l);
		collection.add(7829475896l);
		collection.add(6360230545l);
		collection.add(9945920203l);
		collection.add(9900886655l);
		collection.add(9538985440l);
		collection.add(7624946824l);
		collection.add(8495927401l);
		collection.add(789221860l);
		collection.add(7892159871l);
		collection.add(7829471896l);
		collection.add(6360232545l);
		collection.add(9945914203l);
		collection.add(9900876655l);
		collection.add(8495977401l);
		collection.add(789225860l);
		collection.add(7892169871l);
		collection.add(7829441896l);
		collection.add(6360222545l);
		collection.add(9945934203l);
		collection.add(9900816655l);
		collection.add(7892159871l);
		collection.add(7829471896l);
		collection.add(6360232545l);
		collection.add(9945924203l);
		collection.add(9900856655l);
		
		
		System.out.println("Total Phone Numbers :" + collection.size());
		
		Iterator<Long> itr = collection.iterator();
		while (itr.hasNext()) {
			System.out.println("numbers :" + itr.next());
		}

	}
	
	

}
