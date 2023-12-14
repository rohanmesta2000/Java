package com.xworkz.boot;

import com.xworkz.app.Clone;

public class CloneRunner  {
 public static void main(String[] args) {
	Clone clone=new Clone(3,"Holiday", 1000);
	System.out.println("clone:" +clone);
	
	Clone  Cloone=clone;
	
	

	
}
}
