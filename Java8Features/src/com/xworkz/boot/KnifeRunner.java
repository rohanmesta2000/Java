package com.xworkz.boot;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.xworkz.DTO.KnifeDTO;

public class KnifeRunner {
	public static void main(String[] args) {
        System.out.println("Invoking main in KnifeRunner...");

        KnifeDTO knife1 = new KnifeDTO("Chef's Knife", 29.99, true, 5);
        KnifeDTO knife2 = new KnifeDTO("Bread Knife", 24.49, true, 8);
        KnifeDTO knife3 = new KnifeDTO("Serrated Knife", 19.99, true, 10);
        KnifeDTO knife4 = new KnifeDTO("Chef's Knife", 29.99, true, 5);
        KnifeDTO knife5 = new KnifeDTO("Cleaver Knife", 34.99, true, 3);
        KnifeDTO knife6 = new KnifeDTO("Paring Knife", 12.99, true, 12);
        KnifeDTO knife7 = new KnifeDTO("Serrated Knife", 19.99, true, 10);

        Collection<Object> items = new HashSet<>();
        items.add(knife1);
        items.add(knife2);
        items.add(knife3);
        items.add(knife4);
        items.add(knife5);
        items.add(knife6);
        items.add(knife7);

        System.out.println("Total items: " + items.size());
        System.out.println(items.stream().filter(item -> item instanceof KnifeDTO)
                .map(item -> ((KnifeDTO) item).getName()).collect(Collectors.toSet()).size());
    }
}
