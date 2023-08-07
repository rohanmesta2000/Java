package com.tool.t.app;

	public class Mouse {
	    public void click() {
	        System.out.println("Clicking the mouse");
	        click(1);
	        click("two");
	    }
	    
	    public void click(int numberOfClicks) {
	        System.out.println("Clicking the mouse " + numberOfClicks );
	    }
	    
	    public void click(String button) {
	        System.out.println("Clicking the " + button );
	    }
	    
	    public void click(int numberOfClicks,String button) {
	        System.out.println("invoking mouse in main method");
	        click(numberOfClicks);
	        click(button);
	    }
	}

