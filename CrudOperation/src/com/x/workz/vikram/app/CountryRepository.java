package com.x.workz.vikram.app;

public interface CountryRepository {
	int TOTAL_COUNTRIES = 10;

    void save(String countryName);

    default boolean isExist(String countryName) {
        return false;
    }
}
