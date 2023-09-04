package com.xworkz.friday.boot;

import com.xworkz.friday.app.repository.Artist;
import com.xworkz.friday.app.repository.ArtistImps;

public class ArtistRunner {

	public static void main(String[] args) {
		System.out.println("invoking in main method");
		Artist repository=new ArtistImps();
		
		repository.save("Abanindranath Tagore");
		repository.save("Amrita Sher-Gi");
		repository.save("Jamini Roy");
		repository.save("Kalipada Ghosha");
		repository.save("Maniam");
		repository.save("Manishi Dey");
		repository.save("Mukul Chandra Dey");
		repository.save("Nandalal Bose");
		repository.save("B. Prabha");
		
		
		repository.save("Madhuri Bhaduri");
		

	}

}
