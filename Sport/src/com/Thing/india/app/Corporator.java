package com.Thing.india.app;


public class Corporator {

	public String corpName;
	
	Building building=new Building("SJR","Kuvempu Nagara",3);
	Building building1=new Building("SJR pg for boys","rajajiNagar",39);
	public Building[] buildings={building,building1};

	public Corporator(String corpName) {
		this.corpName = corpName;
	}

	public void printInfo() {
		System.out.println("invoking in corporator");
		System.out.println("Corporator name is "+this.corpName);
		for(int i=0;i<buildings.length;i++)
		{
			Building building=buildings[i];
			building.printInfo();
		}

	}

}