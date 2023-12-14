package com.x.workz.vikram.app;

public interface PinCode {
	int Total_Code=10;
	void save(int pincode);
	
	default boolean isExist(int pincode) {
		return false;
		
	}
	

}
