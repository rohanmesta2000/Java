package com.xworkz.div;

import com.xworkz.app.EngineeringRules;

public class PastEngineeringRules implements EngineeringRules {

	@Override
	public void attendance() {
		
		System.out.println("invoking in attendance");
	}

	@Override
	public Boolean idCard() {
        System.out.println("compulsory");
		return true;
	}

	@Override
	public int fees() {
		System.out.println("fee");
		return 12880;
	
	}

}
