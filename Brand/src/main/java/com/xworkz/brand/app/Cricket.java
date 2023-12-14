package com.xworkz.brand.app;

import java.lang.invoke.WrongMethodTypeException;

import org.w3c.dom.DOMException;

public class Cricket {
	public void name() {
		System.out.println("player name");
		team();
	}

	public void team() {
		System.out.println("team name");
		try {
			score();
		} catch (Exception e) {

			//e.printStackTrace();
			System.err.println("Exception event is handled");
		}
		System.out.println("after handling");
	}

	public void score() {
		System.out.println("scored by the player");
		country();
	}

	public void country() {
		System.out.println("country name");
		iplTeam();
	}

	public void iplTeam() {
		System.out.println("which team plays in ipl");
		throw new WrongMethodTypeException();

	}

	public static void main(String[] args) {
		Cricket cricket = new Cricket();
		cricket.name();
	}
}
