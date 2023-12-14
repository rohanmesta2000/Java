package com.xwrokz.app.impl;

import com.xwrokz.app.rule.RTORule;
import com.xwrokz.app.rule.TaxpayerRule;

public class Citizen implements RTORule, TaxpayerRule {

	@Override
	public void payRoadTax() {
		System.out.println("invoking in main method");

	}

	@Override
	public void noticePeriod() {
		System.out.println("invoking in noticeperiod");

	}

	@Override
	public void payCess() {
		System.out.println("main method");
		RTORule.super.payCess();
	}
}
