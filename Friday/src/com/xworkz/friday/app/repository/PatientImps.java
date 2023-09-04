package com.xworkz.friday.app.repository;

public class PatientImps implements Patient {
	
	    private String[] patients = new String[MAX_PATIENTS];
	    private int patientCount;

	    @Override
	    public void admit(String patientName) {
	        System.out.println("Patient admission process");
	        
	        if (patientCount < MAX_PATIENTS) {
	            patients[patientCount] = patientName;
	            System.out.println("Admitted patient: " + patientName + " at position " + patientCount);
	            patientCount++;
	        } else {
	            System.err.println("Patient database is full. Cannot admit more patients.");
	        }
	    }
	}

