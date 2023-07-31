package com.Thing.india.app;



	public class Player {
		Building building=new Building("Varsha Nilaya","RajajiNagar",54);
		public String name;
		public String exp;
		
		Area area1=new Area("Rajaji Nagar");
		Area area2=new Area("Prakash Nagar");
		Area area3=new Area("Majestic");
		Area area4=new Area("Vijaya Nagar");
		Area area5 =new Area("Jay Nagar");
		
		Area[] area={area1,area2,area3,area4,area5};
		HomeTown town=new HomeTown("Banglore",560010,area);
		
		public Player(String name,String exp)
		{
			System.out.println("invoking const in Player");
			this.name=name;
			this.exp=exp;
		}
		
		public void printInfo()
		{
			System.out.println("invoking players");
			System.out.println("Name of the player is "+this.name);
			System.out.println("Exp of the Player is "+this.exp);
			for(int i=0;i<area.length;i++)
			{
				
			Area areaNew=area[i];
			areaNew.printInfo();
			}
		}
		
		

	}


