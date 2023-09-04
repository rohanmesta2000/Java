package com.xworkz.friday.boot;

import com.xworkz.friday.app.repository.Patient;
import com.xworkz.friday.app.repository.PatientImps;

public class PatientRunner {
	public static void main(String[] args) {
        System.out.println("Invoking the main method for Patient");

        Patient patientRepository = new PatientImps();

        patientRepository.admit("prakash");
        patientRepository.admit("Pradeep");
        patientRepository.admit("Dheeraj");
        patientRepository.admit("Maheesh");
        patientRepository.admit("Nityand");
        patientRepository.admit("Dharma");
        patientRepository.admit("Girish");
        patientRepository.admit("ashok");
        patientRepository.admit("Forman");
        patientRepository.admit("Suraj");

        
        patientRepository.admit("Rohan");
    }
}
