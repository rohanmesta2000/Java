package com.xworkz.boot;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Stream;

import com.xworkz.DTO.IceCreamDTO;

public class IceCreamDTORunner {

	public static void main(String[] args) {
		IceCreamDTO ice=new IceCreamDTO("Amul","Chocalte" , 300D,LocalDate.of(2023, 10, 3),"Cup");
		IceCreamDTO ice1=new IceCreamDTO("Haynigay","Mango",20d,LocalDate.of(2023, 10, 9),"Stick");
		IceCreamDTO ice2=new IceCreamDTO("Arun","Vanilla",30d,LocalDate.of(2023, 6,6),"Cup");
	    IceCreamDTO ice3=new IceCreamDTO("Pakash","strawberry",45d,LocalDate.of(2022, 1, 9),"Bowl");
	    IceCreamDTO ice4=new IceCreamDTO("Priy","Pista",69d,LocalDate.of(2023, 6, 12),"Box");
	    
	    
	    
	    Stream.of(ice4,ice3,ice2,ice1,ice).sorted().forEach(i->System.out.println(i));
	    
	    System.out.println("================");
	    
	    
	    Comparator<IceCreamDTO> com=(t1,t2)->t1.getFlavour().compareTo(t2.getFlavour());
	    
	    
	    Stream.of(ice4,ice3,ice2,ice1,ice).sorted(com).forEach(i->System.out.println(i));
	    
	    
	    
	    System.out.println("==============");
	    
//	    Comparator<IceCreamDTO> dateComparator=(t1,t2)->t2.getManDate().compareTo(t1.getManDate());
//	    Stream.of(ice4,ice3,ice2,ice1,ice).sorted(dateComparator).forEach(i->System.out.println(i));
//	   
	    Comparator<IceCreamDTO> dateComprator=(t1,t2)->t1.getManDate().compareTo(t2.getManDate());
//	    
//	    System.out.println("================");
//	    Comparator<IceCreamDTO> name=(t1,t2)->t1.getName().compareTo(t2.getName());
//	    Stream.of(ice4,ice3,ice2,ice1,ice).sorted(name).forEach(i->System.out.println(i));
//	    
	    Comparator<IceCreamDTO> priceComprator=(t1,t2)->Double.compare(t1.getPrice(), t2.getPrice());
	    
//	    System.out.println("================");
//	    Comparator<IceCreamDTO> type=(t1,t2)->t1.getType().compareTo(t2.getType());
//	    Stream.of(ice4,ice3,ice2,ice1,ice).sorted(name).forEach(i->System.out.println(i));
	    
	    
	    
	    System.out.println("================");
	    
	    Comparator<IceCreamDTO> dateComparator=(t1,t2)->t1.getManDate().compareTo(t2.getManDate());
	    
//	   Stream.of(null).sorted().n 
	    
	}

}
