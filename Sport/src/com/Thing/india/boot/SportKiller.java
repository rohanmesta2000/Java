package com.Thing.india.boot;


import com.Thing.india.app.Player;
import com.Thing.india.app.Sport;

public class SportKiller {

	public static void main(String[] args) {
		System.out.println("Invoking main in SportKiller");
		
		Player players1 = new Player("Rohit", "FortyFive");
		Player players2 = new Player("Virat", "Eighteen");
		Player players3 = new Player("Sachin", "ten");
		Player players4 = new Player("Dhobi", "Five");
		Player players5 = new Player("Raina", "nine");

		Player[] players = { players1, players2, players3, players4, players5 };
		
		Sport sport=new Sport("Cricket", players);
		sport.printInfo();
		
	}

}
