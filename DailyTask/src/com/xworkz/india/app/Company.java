package com.xworkz.india.app;

public class Company {
	public String name1;
	public String ceo;
	public String originCountry;
	
public  Company(String name1, String ceo,String originCountry) {
	 this.name1=name1;
	 this.ceo=ceo;
	 this.originCountry=originCountry;
	 
}
public void printInfo() {
	System.out.println("Name1:"+this.name1);
	System.out.println("Ceo:"+this.ceo);
	System.out.println("OriginCountry:"+this.originCountry);
}
 

}
