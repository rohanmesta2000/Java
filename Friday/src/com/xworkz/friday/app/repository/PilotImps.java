package com.xworkz.friday.app.repository;

public class PilotImps implements Pilot {

	private String[] pilots = new String[MAX_PILOTS];
    private int position;

    @Override
    public void savePilot(String name) {
        System.out.println("Pilot is ready to fly");

        if (this.position < MAX_PILOTS) {
            this.pilots[position] = name;
            System.out.println("Pilot " + name + " is assigned to position " + this.position);
            this.position++;
        } else {
            System.err.println("Data store is fully occupied in the pilot list");
        }
    }

}
