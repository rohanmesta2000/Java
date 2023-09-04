package com.xworkz.friday.boot;

import com.xworkz.friday.app.repository.HistoricalPlaces;
import com.xworkz.friday.app.repository.HistoricalPlacesImpl;

public class HistoricalPlaceRunner {
	 public static void main(String[] args) {
	        System.out.println("Invoking main method for Historical Places");
	        HistoricalPlaces historicalPlacesRepository = new HistoricalPlacesImpl();

	        historicalPlacesRepository.savePlace("Taj Mahal");
	        historicalPlacesRepository.savePlace("Great Wall of China");
	        historicalPlacesRepository.savePlace("Machu Picchu");
	        historicalPlacesRepository.savePlace("Colosseum");
	        historicalPlacesRepository.savePlace("Pyramids of Giza");
	        historicalPlacesRepository.savePlace("Acropolis of Athens");
	        historicalPlacesRepository.savePlace("Stonehenge");
	        historicalPlacesRepository.savePlace("Petra");
	        historicalPlacesRepository.savePlace("Chichen Itza");

	        historicalPlacesRepository.savePlace("Forbidden City");
	    }
}
