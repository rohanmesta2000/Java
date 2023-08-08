package com.xworkz.boot;

import com.xworkz.app.DramaTheater;
import com.xworkz.app.Theater;

public class TheaterKiller {

	public static void main(String[] args) {
		System.out.println("invoking in main method");
		Theater theater=new DramaTheater();
		theater.action();
			}

	}


