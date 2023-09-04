package com.xworkz.friday.app.repository;

public class PoliticanImps implements Politcian {

	    private String[] politicians = new String[MAX_POLITICIANS];
	    private int position;

	    @Override
	    public void addPolitician(String name) {
	        System.out.println("Politician is a public servant");

	        if (this.position < MAX_POLITICIANS) {
	            this.politicians[position] = name;
	            System.out.println("Politician " + name + " added at position " + this.position);
	            this.position++;
	        } else {
	            System.err.println("Data store is fully occupied in the politician list");
	        }
	    }
	}


