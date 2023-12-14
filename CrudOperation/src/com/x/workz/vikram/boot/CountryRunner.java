package com.x.workz.vikram.boot;

import com.x.workz.vikram.app.CountryRepository;
import com.x.workz.vikram.app.CountryRepositoryImpl;
import com.x.workz.vikram.app.service.CountryService;
import com.x.workz.vikram.app.service.CountryServiceImpl;

public class CountryRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in CountryRunner");
        CountryRepository countryRepository = new CountryRepositoryImpl();

        CountryService countryService = new CountryServiceImpl(countryRepository);
        boolean ref = countryService.validateAndSave("India");
        System.out.println(ref);

        boolean ref1 = countryService.validateAndSave("India");
        System.out.println(ref1);

	}

}
