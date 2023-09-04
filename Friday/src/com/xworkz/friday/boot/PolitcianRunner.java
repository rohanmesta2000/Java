package com.xworkz.friday.boot;

import com.xworkz.friday.app.repository.Politcian;
import com.xworkz.friday.app.repository.PoliticanImps;

public class PolitcianRunner {

	public static void main(String[] args) {
		System.out.println("Invoking the main method for Politician");
        Politcian politicianRepository = new PoliticanImps();

        politicianRepository.addPolitician("Narendra Modi");
        politicianRepository.addPolitician("Joe Biden");
        politicianRepository.addPolitician("Angela Merkel");
        politicianRepository.addPolitician("Emmanuel Macron");
        politicianRepository.addPolitician("Shinzo Abe");
        politicianRepository.addPolitician("Justin Trudeau");
        politicianRepository.addPolitician("Boris Johnson");
        politicianRepository.addPolitician("Vladimir Putin");
        politicianRepository.addPolitician("Xi Jinping");
        politicianRepository.addPolitician("Moon Jae-in");

        politicianRepository.addPolitician("Jacinda Ardern");

	}

}
