package com.heat.iron.app;

public class IronBox {
public void heat() {
	System.out.println("invoking heat in ironBox ");
	heat(30);
	heat("Stell");
}
public  void heat(int temp) {
	System.out.println("invoking heat in ironBox");
	System.out.println("Temp" +temp);
}
public void heat(String type) {
	System.out.println("invoking heat in ironBox");
	System.out.println("Type" +type);
}
public  void heat(int temp,String type) {
	System.out.println("invoking heat in ironBox");
	heat(temp);
	heat(type);
}
}
