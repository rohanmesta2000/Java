package com.xworkz.boot;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.xworkz.DTO.FireDTO;

public class FireRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in FireRunner...");

		FireDTO fire1 = new FireDTO("Blazing Inferno", 15.99, true, 5);
		FireDTO fire2 = new FireDTO("Sizzling Blaze", 9.49, true, 10);
		FireDTO fire3 = new FireDTO("Crackling Flames", 7.99, false, 20);
		FireDTO fire4 = new FireDTO("Sparking Heat", 12.49, true, 8);
		FireDTO fire5 = new FireDTO("Blazing Inferno", 15.99, true, 5); // Duplicate
		FireDTO fire6 = new FireDTO("Glowing Embers", 6.99, false, 15);
		FireDTO fire7 = new FireDTO("Crackling Flames", 7.99, false, 20); // Duplicate

		Collection<Object> items = new HashSet<>();
		items.add(fire1);
		items.add(fire2);
		items.add(fire3);
		items.add(fire4);
		items.add(fire5);
		items.add(fire6);
		items.add(fire7);

		System.out.println("Total items: " + items.size());
		System.out.println(items.stream().filter(item -> item instanceof FireDTO)
				.map(item -> ((FireDTO) item).getName()).collect(Collectors.toSet()).size());
	}
}
