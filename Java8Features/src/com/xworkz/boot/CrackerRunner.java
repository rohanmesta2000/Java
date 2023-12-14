package com.xworkz.boot;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.xworkz.DTO.CrackerDTO;

public class CrackerRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in PlayGroundRunner...");

		CrackerDTO cracker1 = new CrackerDTO("Loud Bang", 5.99, true, 10);
		CrackerDTO cracker2 = new CrackerDTO("Colorful Sparklers", 3.49, false, 20);
		CrackerDTO cracker3 = new CrackerDTO("Mega Explosion", 12.99, true, 5);
		CrackerDTO cracker4 = new CrackerDTO("Loud Bang", 5.99, true, 10);
		CrackerDTO cracker5 = new CrackerDTO("Colorful Sparklers", 3.49, false, 20);
		CrackerDTO cracker6 = new CrackerDTO("Quiet Pop", 1.99, false, 15);
		CrackerDTO cracker7 = new CrackerDTO("Glowing Fountain", 8.99, false, 8);

		Collection<CrackerDTO> items = new HashSet<>();
		items.add(cracker1);
		items.add(cracker2);
		items.add(cracker3);
		items.add(cracker4);
		items.add(cracker5);
		items.add(cracker6);
		items.add(cracker7);

		System.out.println("Total items: " + items.size());
		System.out.println(items.stream()
				.map(r->r.getName()).collect(Collectors.toSet()).size());
	}
}
