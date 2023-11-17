package com.xworkz.app.dto;

import java.util.ArrayList;
import java.util.Collection;

public class ActorsName {
	public static void main(String[] args) {
		Collection<String> actorNames = new ArrayList<>();
		actorNames.add("Yash");
		actorNames.add("Punnet");
		actorNames.add("Hrithik");
		actorNames.add("Salman");
		actorNames.add("Vijay");
		actorNames.add("Ravichandran");
		actorNames.add("Darshan");
		actorNames.add("Ganesh");
		actorNames.add("AjayKumar");
		actorNames.add("DQ");

		System.out.println("Total no of Actors" + actorNames.size());

		int count = 0;
		for (String ref : actorNames) {
			System.out.println("Name" + ref);
			count++;
		}

		System.out.println("Total" + count);

		System.out.println();
		Collection<String> actorNames1 = new ArrayList<>();
		actorNames1.add("UnniKrishnan");
		actorNames1.add("Shershah");
		boolean sandalwood = actorNames.contains("Shershah");
		System.out.println("Contains sandalwood actor  'Shershah'" + sandalwood);

		System.out.println();
		Collection<String> actorNames2 = new ArrayList<>();
		actorNames2.add("JuniorAntier");
		actorNames2.add("Modi");
		boolean kollywood = actorNames2.containsAll(actorNames);
		System.out.println("Contains kollywood contains modi'" + kollywood);

		System.out.println();
		Collection<String> actorNames3 = new ArrayList<>();
		actorNames3.add("Abishek");
		actorNames3.add("Vasu");
		boolean bollywood = actorNames3.remove("Shershah");
		System.out.println("Contains bollywood actor'" + bollywood);

		System.out.println();
		Collection<String> actorNames4 = new ArrayList<>();
		actorNames4.add("Chiranjeevi");
		actorNames4.add("Ravi Teja");
		boolean tollywood = actorNames4.removeAll(actorNames1);
		System.out.println("Contains tollywood actor'" + tollywood);

	}

}
