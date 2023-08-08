package com.xworkz.boot;

import com.xworkz.app.BassDrum;
import com.xworkz.app.Drum;

public class DrumKiller {
	public static void main(String[] args) {
		System.out.println("invoking in main method");
		Drum drum=new BassDrum();
			drum.sound();
			}
}
