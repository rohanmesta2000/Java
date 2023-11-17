package com.xworkz.boot;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.xworkz.DTO.BridgeDTO;

public class BridgeRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in BridgeRunner...");

		BridgeDTO bridge1 = new BridgeDTO("Arch", 5000, false, "Steel");
		BridgeDTO bridge2 = new BridgeDTO("Suspension", 8000, true, "Iron");
		BridgeDTO bridge3 = new BridgeDTO("Cantilever", 6000, false, "Concrete");
		BridgeDTO bridge4 = new BridgeDTO("Arch", 5000, false, "Steel");
		BridgeDTO bridge5 = new BridgeDTO("Beam", 7000, false, "Wood");
		BridgeDTO bridge6 = new BridgeDTO("Cable-stayed", 9000, true, "Steel");
		BridgeDTO bridge7 =  new BridgeDTO("Arch", 5000, false, "Steel");
		Collection<Object> items = new HashSet<>();
		items.add(bridge1);
		items.add(bridge2);
		items.add(bridge3);
		items.add(bridge4);
		items.add(bridge5);
		items.add(bridge6);
		items.add(bridge7);
		

		System.out.println("Total items: " + items.size());
		System.out.println(items.stream().filter(item -> item instanceof BridgeDTO)
				.map(item -> ((BridgeDTO) item).getType()).collect(Collectors.toSet()).size());
	}
}
