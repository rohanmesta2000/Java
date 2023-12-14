package com.xworkz.runner;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.xworkz.DTO.CountryDTO;
import com.xworkz.DTO.PresidentDTO;

public class CountryAndPresidentRunner {

	public static void main(String[] args) {
		CountryDTO country1=new CountryDTO(1, "INDIA");
		CountryDTO country2=new CountryDTO(2, "SRI LANKA");
		CountryDTO country3=new CountryDTO(3, "PAKISTAN");
		CountryDTO country4=new CountryDTO(4, "WEST INDIES");
		CountryDTO country5=new CountryDTO(5, "AFGHANISTAN");
		
		
		PresidentDTO pres1=new PresidentDTO(1, "Modi");
		PresidentDTO pres2=new PresidentDTO(2, "Prajwal");
		PresidentDTO pres3=new PresidentDTO(3, "Virat");
		PresidentDTO pres4=new PresidentDTO(4, "Rohit");
		PresidentDTO pres5=new PresidentDTO(5, "Bavuma");
		

	Map<CountryDTO, PresidentDTO> hmap=new HashMap<CountryDTO, PresidentDTO>();
	
	hmap.put(country5, pres5);
	hmap.put(country4, pres4);
	hmap.put(country3, pres3);
	hmap.put(country2, pres2);
	hmap.put(country1, pres1);
	
	Set<CountryDTO> countryDTO=hmap.keySet();
	countryDTO.forEach(p->System.out.println(p));
	
	System.out.println("=============================");
	
	
	Collection<PresidentDTO> presidentDTO=hmap.values();
	presidentDTO.forEach(s->System.out.println(s));
  
	
	System.out.println("-=================");
	
	Set<Entry<CountryDTO, PresidentDTO>> ref=hmap.entrySet();
	ref.forEach(r->System.out.println(r));
	
	System.out.println("////////////////");
	
    hmap.forEach((k,v)-> System.out.println(k +":" +v));
    System.out.println("=============================");
    
    
    Iterator<Entry<CountryDTO,PresidentDTO>> itr=ref.iterator();
    while(itr.hasNext()) {
    	Entry<CountryDTO,PresidentDTO> ref2=itr.next();
    	System.out.println(ref2);
    }
	
	
	
	
	}

}
