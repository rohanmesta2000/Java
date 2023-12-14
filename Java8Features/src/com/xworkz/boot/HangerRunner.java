package com.xworkz.boot;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.xworkz.DTO.HangerDTO;

public class HangerRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in HangerRunner...");
		HangerDTO hanger1 = new HangerDTO("Coat Hanger", "Black", 12, true);
        HangerDTO hanger2 = new HangerDTO("Pants Hanger", "Brown", 10, false);
        HangerDTO hanger3 = new HangerDTO("Cot Hanger", "llack", 12, true);
        HangerDTO hanger4 = new HangerDTO("Skirt Hanger", "White", 8, false);
        HangerDTO hanger5 = new HangerDTO("Pants Hanger", "Brown", 10, false);
        HangerDTO hanger6 = new HangerDTO("C Hanger", "Red", 12, true);
        HangerDTO hanger7 = new HangerDTO("Skirt Hanger", "White", 8, false);

        Collection<Object> items = new HashSet<>();
        items.add(hanger1);
        items.add(hanger2);
        items.add(hanger3);
        items.add(hanger4);
        items.add(hanger5);
        items.add(hanger6);
        items.add(hanger7);

        System.out.println("Total items: " + items.size());
        System.out.println(items.stream().filter(item -> item instanceof HangerDTO)
                .map(item -> ((HangerDTO) item).getType()).collect(Collectors.toSet()).size());
    }
}