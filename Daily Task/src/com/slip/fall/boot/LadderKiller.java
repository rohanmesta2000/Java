package com.slip.fall.boot;

import com.slip.fall.app.Ladder;

public class LadderKiller {
	public static void main(String[] args) {
		 System.out.println("invioking main method");	
		  Ladder ladder=new Ladder();
		  ladder.climb();
		  ladder.climb(30,"Wooden");
	}
}

