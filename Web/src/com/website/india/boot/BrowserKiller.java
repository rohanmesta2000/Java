package com.website.india.boot;

import com.website.india.app.Browser;

public class BrowserKiller {
	public static void main(String[] args) {
		System.out.println("Invoking main in BrowserKiller");
		Browser browser=new Browser();
		browser.retrieve();
		browser.display();
	}

}
