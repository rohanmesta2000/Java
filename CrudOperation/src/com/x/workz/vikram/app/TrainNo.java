package com.x.workz.vikram.app;

public interface TrainNo {
	int Total_Code=10;
	void save(int traincode);
	
	default boolean isExist(int traincode) {
		return false;
	}
	}
