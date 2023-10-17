package com.xworkz.boot;

import com.xworkz.app.Kalla;

public class KallaKiller {

	public static void main(String[] args) {
		        System.out.println("Invoking main in ThiefEncounter");
		        Kalla kalla = new Kalla("Jack", "The Shadow", 30, "Nightshade Gang", 50000.0, true);
		        Kalla kalla1 = new Kalla("Jack", "The Shadow", 30, "Nightshade Gang", 50000.0, true);
		        System.out.println(kalla);
		        boolean same = kalla.equals(kalla1);
		        System.out.println("Kalla and Kalla1 are same: " + same);
		    }
}
