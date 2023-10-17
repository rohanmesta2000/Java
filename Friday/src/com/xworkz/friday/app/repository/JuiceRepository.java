package com.xworkz.friday.app.repository;

public interface JuiceRepository {
int TOTAL_JUICES = 10;
	
	void save(String juice);
	
	default boolean isExist(String juice) {
		return false;
	}
}
