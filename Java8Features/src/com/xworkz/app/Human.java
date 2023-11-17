package com.xworkz.app;

import java.util.function.Consumer;

public class Human {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Human h = new Human();
		Consumer<Human> setName = t -> t.setName("Body");
		// consumer
		setName.accept(h);
		System.out.println(h.getName());

	}
}