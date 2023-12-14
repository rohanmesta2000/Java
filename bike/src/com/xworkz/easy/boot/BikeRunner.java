package com.xworkz.easy.boot;

import java.sql.BatchUpdateException;

import com.xworkz.easy.event.BikeType;
import com.xworkz.easy.exception.BikeException;

public class BikeRunner {

	public static void main(String[] args) {
		System.out.println("running in main method ");
		BikeType bikeType=new BikeType();
		
		try {
			bikeType.model();
			Class.forName("com.just.not.work");
		} catch (BatchUpdateException e) {
			System.err.println("BatchUpdateException " +e.getMessage());
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Created Succesfully" +e.getMessage());
			e.printStackTrace();
		} catch (BikeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
