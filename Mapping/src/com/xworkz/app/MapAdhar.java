package com.xworkz.app;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapAdhar {

	
	public static void main(String[] args) {
		
	
	
	Map<String, Long> adhar=new HashMap<String, Long>();
	
	System.out.println(adhar.isEmpty());
	adhar.put("Rohan",3568790879l);
	adhar.put("Rohit",546789032l);
	adhar.put("Warner",432879032l);
	adhar.put("Darshan",784932032l);
	adhar.put("Prajwal",4873920548l);
	adhar.put("chandhan",6348729032l);
	adhar.put("santosha",347298304l);
	adhar.put("Charan",83479203827l);
	adhar.put("tushar",26793803l);
	adhar.put("Karthik",6438792743l);
	
	System.out.println(adhar.size());
	
Set<String>	name=adhar.keySet();
name.forEach(c->System.out.println(c)); 


System.out.println("=======================");
Collection<Long> adharNum=adhar.values();
adharNum.forEach(k->System.out.println(k));



//	System.out.println(adhar.isEmpty());
//	System.out.println(adhar.values());
//	System.out.println(adhar.keySet());
	
	
	
}
}
