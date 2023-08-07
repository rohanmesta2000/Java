package com.heat.iron.boot;

import com.heat.iron.app.IronBox;

public class IronBoxKiller {
public static void main(String[] args) {
	  System.out.println("invioking main method");	
	  IronBox iron=new IronBox();
	  iron.heat();
	  iron.heat(30,"Stell");
	  
}
}
