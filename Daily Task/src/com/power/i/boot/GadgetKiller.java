package com.power.i.boot;

import com.power.i.app.Gadget;

public class GadgetKiller {
		public static void main(String[] args) {
			 System.out.println("invioking main method");	
			  Gadget gadget=new Gadget();
			  gadget.activate();
			  gadget.activate(200,"Smart");
			  
		}
}
