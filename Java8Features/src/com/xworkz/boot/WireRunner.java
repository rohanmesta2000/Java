package com.xworkz.boot;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.xworkz.DTO.WireDTO;

public class WireRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in Wire...");

		WireDTO wire1 = new WireDTO("Copper", 15.5, false, 10);
		WireDTO wire2 = new WireDTO("Aluminum", 20.2, true, 15);
		WireDTO wire3 = new WireDTO("Copper", 15.5, false, 10);
		WireDTO wire4 = new WireDTO("Silver", 12.8, true, 20);
		WireDTO wire5 = new WireDTO("Gold", 18.7, true, 7);
		WireDTO wire6 = new WireDTO("Platinum", 25.3, false, 12);
		WireDTO wire7 = new WireDTO("Aluminum", 20.2, true, 15);

		Collection<Object> wireItems = new HashSet<>();
		wireItems.add(wire1);
		wireItems.add(wire2);
		wireItems.add(wire3);
		wireItems.add(wire4);
		wireItems.add(wire5);
		wireItems.add(wire6);
		wireItems.add(wire7);

		System.out.println("Total wire items: " + wireItems.size());
		System.out
				.println(wireItems.stream().map(item -> ((WireDTO) item).getType()).collect(Collectors.toSet()).size());
	}
}
