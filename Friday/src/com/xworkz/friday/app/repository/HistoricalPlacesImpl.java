package com.xworkz.friday.app.repository;

public class HistoricalPlacesImpl implements HistoricalPlaces{

	private String[] places = new String[NUM_PLACES];
    private int position;

    @Override
    public void savePlace(String placeName) {
        System.out.println("Saving historical place: " + placeName);

        if (this.position < NUM_PLACES) {
            this.places[position] = placeName;
            System.out.println("Historical place " + placeName + " saved at position " + this.position);
            this.position++;
        } else {
            System.err.println("Data store is full. Cannot save more historical places.");
        }
    }
}
