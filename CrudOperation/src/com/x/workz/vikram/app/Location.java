package com.x.workz.vikram.app;

public interface Location {
int TOTAL_PLACES = 10;
	
	void save(String location);
	
	default boolean isExist(String location) {
		return false;
	}
}
