package com.xworkz.boot;

import com.xworkz.java.Cave;

public class CaveKiller {
	public static void main(String[] args) {
    	System.out.println("Inovking main in CaveKiller");
        Cave cave1 = new Cave("Crystal Cavern", 15, 60.0, 70.0, 120.0,true, false, "Mountains", true, "A stunning cave with crystal formations.");
        System.out.println(cave1);

        Cave cave2 = new Cave("Dark Abyss", 3, 40.0, 25.0, 15.0,false, false, "Underground", false, "A mysterious and unexplored cave.");
        System.out.println(cave2);

        Cave cave3 = new Cave("Echoing Grotto", 8, 70.0, 40.0, 25.0,true, true, "Forest", true, "A cave known for its echoing acoustics.");
        System.out.println(cave3);
    }
}
