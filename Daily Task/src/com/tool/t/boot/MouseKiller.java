package com.tool.t.boot;

import com.tool.t.app.Mouse;

public class MouseKiller {

	public static void main(String[] args) {
		System.out.println("invioking main method");	
		  Mouse mouse=new Mouse();
		  mouse.click();
		  mouse.click(1,"two");


	}

}
