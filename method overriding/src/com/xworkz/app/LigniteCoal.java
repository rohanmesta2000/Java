package com.xworkz.app;

public class LigniteCoal extends Coal{
	@Override
	public void burn() {
	System.out.println("invoking burn in LigniteCoal");
	super.burn();
	}
}
