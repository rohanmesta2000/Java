package com.xworkz.app;

public interface Fun {
  boolean see (int price,boolean test,String pry);
  Fun fun=(p,t,r)->{
	  if(p>200 && t==true) {
		  return true;
	  }
	return false;
  };
}
