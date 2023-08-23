package com.xworkz.boot;

import com.xworkz.app.Military;
import com.xworkz.div.SMilitary;

public class MilitaryRunner {

	public static void main(String[] args) {
		Military military=new SMilitary();
		military.commands();
		military.idCard();
		military.name();

	}

}
