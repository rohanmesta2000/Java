package com.xwrokz.boot;

import com.xwrokz.app.impl.Citizen;
import com.xwrokz.app.rule.RTORule;
import com.xwrokz.app.rule.TaxpayerRule;

public class CitizenRunner {
	public static void main(String[] args) {
		System.out.println("invoking in main method");
		RTORule rtoRule = new Citizen();
		rtoRule.payRoadTax();

		TaxpayerRule ref = new Citizen();
		ref.noticePeriod();
	}
}
