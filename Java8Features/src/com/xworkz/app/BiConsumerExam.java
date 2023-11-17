package com.xworkz.app;

import java.util.function.BiConsumer;

public interface BiConsumerExam {

	static void ShowDetails(String name, Integer age) {
		System.out.println(name + " " + age);
	}

	public static void main(String[] args) {

		BiConsumer<String, Integer> biCon2 = (name, age) -> System.out.println(name + " " + age);
		biCon2.accept("Peter", 28);
	}
}
