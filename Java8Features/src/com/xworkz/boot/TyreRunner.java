package com.xworkz.boot;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.xworkz.DTO.TyreDTO;

public class TyreRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in TyreRunner...");

		TyreDTO tyre1 = new TyreDTO("Bridgestone", 18.0, 95, false);
		TyreDTO tyre2 = new TyreDTO("Michelin", 19.5, 102, true);
		TyreDTO tyre3 = new TyreDTO("Goodyear", 17.5, 89, false);
		TyreDTO tyre4 = new TyreDTO("Bridgestone", 18.0, 95, false);
		TyreDTO tyre5 = new TyreDTO("Pirelli", 20.0, 105, true);
		TyreDTO tyre6 = new TyreDTO("Michelin", 19.5, 102, true);
		TyreDTO tyre7 = new TyreDTO("Continental", 18.0, 99, false);

		Collection<Object> items = new HashSet<>();
		items.add(tyre1);
		items.add(tyre2);
		items.add(tyre3);
		items.add(tyre4);
		items.add(tyre5);
		items.add(tyre6);
		items.add(tyre7);

		System.out.println("Total items: " + items.size());
		System.out.println(items.stream()
			.map(i ->i.getClass() ).collect(Collectors.toSet()).size());
		
		
	}
}