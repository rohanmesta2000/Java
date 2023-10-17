package com.xworkz.boot;

import com.xworkz.app.EngineeringRules;
import com.xworkz.div.PastEngineeringRules;

public class EngineeringRulesRunner {

	public static void main(String[] args) {
		EngineeringRules engineeringRules=new PastEngineeringRules();
		engineeringRules.attendance();
		engineeringRules.idCard();
		engineeringRules.fees();

	}

}
