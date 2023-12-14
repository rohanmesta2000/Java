package com.xworkz.news.util;

import java.util.Optional;

public class GarageUtil {
	public static Optional<String> getName(String fname,String lname){
if (fname!=null && lname!=null) {
	System.out.println("fname and lname are not empyty");
	return Optional.of(fname+""+lname);
}
else {
	System.out.println("fname and lname are null");
	return Optional.empty();
}
		
	}

}
