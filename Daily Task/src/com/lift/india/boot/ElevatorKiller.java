package com.lift.india.boot;

import com.lift.india.app.Elevator;

public class ElevatorKiller {
	public static void main(String[] args) {
		System.out.println("invioking main method");	
		  Elevator elevator=new Elevator();
		  elevator.move();
		  elevator.move(1,"Up ");

	}
}


