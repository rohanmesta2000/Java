package com.xworkz.app;

public class IronGate extends Gate {
	@Override
	public boolean open() {
		System.out.println("invoking cell in IronGate");
		return super.open();
	}

}
