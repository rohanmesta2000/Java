package com.xworkz.app;

public class HardFlex extends Flex {

	@Override
	public boolean cell() {
		System.out.println("invoking cell in HardFlex");
		return super.cell();
	}
}
