package com.xwrokz.app.rule;

public interface RTORule {
	void payRoadTax();

	default void payCess() {
		System.out.println("invoking in impl class");

	}
}
