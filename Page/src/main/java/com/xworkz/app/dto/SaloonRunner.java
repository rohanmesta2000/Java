package com.xworkz.app.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SaloonRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in SaloonRunner...");
		Collection<SaloonItemDTO> saloon = new ArrayList<>();
		SaloonItemDTO beautyfly=new SaloonItemDTO(1,"Beautyfly", 150,"Dryer", false);
		saloon.add(beautyfly);
		
		SaloonItemDTO encapture=new SaloonItemDTO(2,"Encapture", 100,"Freshner", true);
		saloon.add(encapture);
		
		SaloonItemDTO beautyBounty=new SaloonItemDTO(3,"Beauty Bounty", 200,"Washer", false);
		saloon.add(beautyBounty);
		
		SaloonItemDTO bellissimo=new SaloonItemDTO(4,"Bellissimo", 150,"HairCleaner", true);
		saloon.add(bellissimo);
		
		SaloonItemDTO tresses=new SaloonItemDTO(5,"Tresses", 250,"Washer", false);
		saloon.add(tresses);
		
		SaloonItemDTO xanadu=new SaloonItemDTO(6,"Xanadu", 300,"Washer", true);
		saloon.add(xanadu);
		
		SaloonItemDTO curlapalooza=new SaloonItemDTO(7,"Curlapalooza", 450,"Washer", false);
		saloon.add(curlapalooza);
		
		SaloonItemDTO rootzSalon=new SaloonItemDTO(8,"Rootz Salon", 600,"Washer", false);
		saloon.add(rootzSalon);
		
		SaloonItemDTO aura=new SaloonItemDTO(9,"Aura", 900,"Washer", true);
		saloon.add(beautyBounty);
		
		SaloonItemDTO purabelle=new SaloonItemDTO(10,"Purabelle", 800,"Washer", false);
		saloon.add(purabelle);
		
		Iterator<SaloonItemDTO> itr = saloon.iterator();
		while (itr.hasNext()) {
			SaloonItemDTO saloon1 = itr.next();
			System.out.println("Name: " + saloon1.getName());

		}
		
		System.out.println("Total no of Saloon =" + saloon.size());
		
		
		Collection<SaloonItemDTO> saloon1 = new ArrayList<>();
		SaloonItemDTO rejuvenate=new SaloonItemDTO(11,"Rejuvenate", 520,"Combo", true);
		SaloonItemDTO zenesty=new SaloonItemDTO(12,"Zenesty", 800,"Washer", false);
		boolean set1=saloon1.containsAll(saloon);
		System.out.println(set1);
		System.out.println();
		
		
		boolean set2=saloon.contains(rejuvenate);
		System.out.println(set2);
		System.out.println();
		
		
		
		Collection<SaloonItemDTO> saloon2 = new ArrayList<>();
		SaloonItemDTO browBaroque=new SaloonItemDTO(13,"Brow Baroque", 520,"Combo", true);
		SaloonItemDTO endlessCharm=new SaloonItemDTO(14,"Endless Charm", 800,"Washer", false);
		boolean set3=saloon.removeAll(saloon2);
		System.out.println(set3);
		System.out.println();
		
		
		boolean set4=saloon.remove(endlessCharm);
		System.out.println(set4);
		System.out.println();
		
		
	
		
	}

}
