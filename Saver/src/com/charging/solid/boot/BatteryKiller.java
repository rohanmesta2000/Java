package com.charging.solid.boot;

import com.charging.solid.app.Battery;

public class BatteryKiller {
	public static void main(String[] args) {
		System.out.println("Invoking main in BatteryKiller");
		Battery battery=new Battery();
		battery.charging1();
		battery.run();
	}

}
