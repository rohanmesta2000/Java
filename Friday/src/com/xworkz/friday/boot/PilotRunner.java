package com.xworkz.friday.boot;

import com.xworkz.friday.app.repository.Pilot;
import com.xworkz.friday.app.repository.PilotImps;

public class PilotRunner {

	public static void main(String[] args) {
		System.out.println("flying in air");
		Pilot air=new PilotImps();
		air.savePilot("Capt. Russi Bunsha");
		air.savePilot("Capt. S. Balasubramanian");
		air.savePilot("Capt. Rajeev Bajpai");
		air.savePilot("Capt. Vivek Kulkarni");
		air.savePilot("Capt. Pankaj Agrawal");
		air.savePilot("Capt. Pushpinder Singh");
		air.savePilot("Capt. Karan Mehra");
		air.savePilot("Capt. Trisha Mohan");
		air.savePilot("Capt. Kurush Keki Tarapor");
		air.savePilot("Capt. Kurush Keki Tarapor");
		
		
		air.savePilot("Capt. Bibhuti Mohan Jha");
		

	}

}
