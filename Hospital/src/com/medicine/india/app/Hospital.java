package com.medicine.india.app;

public class Hospital {
	public Doctor doctor=new Doctor();
	public Nurse nurse=new Nurse();
	public Patient patient=new Patient();
	public void treatment()
	{
		System.out.println("Invoking treatment() in Hospital");
		this.nurse.bpCheck();
		this.doctor.operation();
		this.patient.payBill();
	}
	public void pharmacy()
	{
		System.out.println("Invoking pharmacy() in Hospital");
		this.patient.selfCare();
		this.doctor.checkup();
		this.nurse.patientCare();
	}

}

