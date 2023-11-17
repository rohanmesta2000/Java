package com.xworkz.boot;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.xworkz.DTO.HardwareDTO;

public class HardwareRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in HardwareRunner...");

		HardwareDTO hardware1 = new HardwareDTO("Hammer", "Tool", 15.99, 5);
		HardwareDTO hardware2 = new HardwareDTO("Screwdriver", "Tool", 10.49, 10);
		HardwareDTO hardware3 = new HardwareDTO("Wrench", "Tool", 20.99, 7);
		HardwareDTO hardware4 = new HardwareDTO("Hammer", "Tool", 15.99, 5);
		HardwareDTO hardware5 = new HardwareDTO("Screwdriver", "Tool", 10.49, 10);
		HardwareDTO hardware6 = new HardwareDTO("Tape Measure", "Tool", 8.99, 15);
		HardwareDTO hardware7 = new HardwareDTO("Pliers", "Tool", 12.99, 8);

		Collection<Object> items = new HashSet<>();
		items.add(hardware1);
		items.add(hardware2);
		items.add(hardware3);
		items.add(hardware4);
		items.add(hardware5);
		items.add(hardware6);
		items.add(hardware7);

		System.out.println("Total items: " + items.size());
		System.out.println(items.stream().filter(item -> item instanceof HardwareDTO)
				.map(item -> ((HardwareDTO) item).getHardwareName()).collect(Collectors.toSet()).size());
	}
}
