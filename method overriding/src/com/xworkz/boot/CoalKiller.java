package com.xworkz.boot;

import com.xworkz.app.Coal;
import com.xworkz.app.LigniteCoal;

public class CoalKiller {

	public static void main(String[] args) {
	System.out.println("invoking in main method");
	Coal coal=new LigniteCoal();
	coal.burn();
	}

}
