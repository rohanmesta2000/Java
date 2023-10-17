package com.xworkz.boot;

import com.xworkz.app.Sniper;

public class SniperKiller {
	public static void main(String[] args) {
        System.out.println("Invoking main in Sniper");
        Sniper sniper1 = new Sniper("Chris", "M40A5", 32, "US Marine Corps", 95.5, true);
        Sniper sniper2 = new Sniper("Chris", "M40A5", 28, "US Marine Corps", 98.2, true);
        System.out.println(sniper1);
        boolean same = sniper1.equals(sniper2);
        System.out.println("Sniper1 and Sniper2 are the same: " + same);
    }
}
