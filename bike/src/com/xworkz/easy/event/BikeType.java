package com.xworkz.easy.event;

import java.nio.channels.AcceptPendingException;
import java.sql.BatchUpdateException;

import com.xworkz.easy.exception.BikeException;
import com.xworkz.easy.exception.BikeRunTimeException;

public class BikeType {

	public void name() {
		System.out.println("Invoking in name() in Bike Type");
		throw new BikeRunTimeException();
	}

	public void model() throws BatchUpdateException, BikeException {
		System.out.println("Invoking in model() in Bike Type");

		throw new BikeException();

	}
}
 