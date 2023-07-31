package com.xworkz.india.boot;

import com.xworkz.india.app.Company;
import com.xworkz.india.app.Ingredent;
import com.xworkz.india.app.Toothpaste;

public class ToothpasteKiller {
 public static void main(String[] args) {
	 String name="Patanjali";
	 String brand="Ayurveda";
	 String company="indian multinational";
	 Ingredent[] ingredent= { new Ingredent("lavanga",25,7.1), new Ingredent("yelaki",15,23.2), new Ingredent("ginger",9,37), new Ingredent("Pudina",78,0.1), new Ingredent("kesari",74,0.87)};
Toothpaste toothpaste=new Toothpaste(name,brand,company,ingredent);
toothpaste.printinfo();

String name1 ="patanjali";
String ceo="Bala Krishna";
String originCountry="INDIA";
Company toothpasteCompany=new Company(name1,ceo,originCountry);
toothpasteCompany.printInfo();

 }
}

