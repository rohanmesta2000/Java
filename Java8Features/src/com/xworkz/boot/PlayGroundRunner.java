package com.xworkz.boot;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.xworkz.DTO.PlayGroundDTO;

public class PlayGroundRunner {
	public static void main(String[] args) {
        System.out.println("Invoking main in PlayGroundRunner...");

        PlayGroundDTO playground1 = new PlayGroundDTO("Swing", 10, true, "Red");
        PlayGroundDTO playground2 = new PlayGroundDTO("Slide", 15, false, "Blue");
        PlayGroundDTO playground3 = new PlayGroundDTO("Swing", 10, true, "Red");
        PlayGroundDTO playground4 = new PlayGroundDTO("Merry-Go-Round", 20, true, "Yellow");
        PlayGroundDTO playground5 = new PlayGroundDTO("Sandbox", 12, true, "Green");
        PlayGroundDTO playground6 = new PlayGroundDTO("Slide", 15, false, "Blue");
        PlayGroundDTO playground7 = new PlayGroundDTO("Monkey Bars", 18, true, "Green");

        Collection<Object> items = new HashSet<>();
        items.add(playground1);
        items.add(playground2);
        items.add(playground3); 
        items.add(playground4);
        items.add(playground5);
        items.add(playground6); 
        items.add(playground7);

        System.out.println("Total items: " + items.size());
        System.out.println(items.stream().filter(item -> item instanceof PlayGroundDTO)
                .map(item -> ((PlayGroundDTO) item).getType()).collect(Collectors.toSet()).size());
    }
}

