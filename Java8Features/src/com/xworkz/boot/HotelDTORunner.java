package com.xworkz.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.DTO.HotelDTO;

public class HotelDTORunner {

	public static void main(String[] args) {
		System.out.println("Hotel in main mehtod");
		HotelDTO hotel1 = new HotelDTO(1, "Hotel Sunrise", "Rajesh Patel", 18, "India");
		HotelDTO hotel2 = new HotelDTO(2, "Beachfront Paradise Resort", "Anjali Gupta", 12, "India");
		HotelDTO hotel3 = new HotelDTO(3, "Mountain View Inn", "Sanjay Singh", 9, "India");
		HotelDTO hotel4 = new HotelDTO(4, "Ocean Breeze", "Nimal Perera", 18, "Sri Lanka");
		HotelDTO hotel5 = new HotelDTO(5, "Palm Grove Resort", "Kavita Fernand", 13, "Sri Lanka");
		HotelDTO hotel6 = new HotelDTO(6, "Tea Plantation Lodge", "Ravi Silva", 20, "Sri Lanka");
		HotelDTO hotel7 = new HotelDTO(7, "Cityscape Hotel", "John Smith", 11, "New York, USA");
		HotelDTO hotel8 = new HotelDTO(8, "Sunshine Inn& Suites", "Maria Rodriguez", 11, ",USA");
		HotelDTO hotel9 = new HotelDTO(9, "The Royal Crown Hotel", "David Wilson", 16, "UK");
		HotelDTO hotel10 = new HotelDTO(10, "Lakeside Retreat", "Sarah Johnson", 10, "UK");

		Collection<HotelDTO> hotelCollection = new ArrayList<HotelDTO>();
		hotelCollection.add(hotel1);
		hotelCollection.add(hotel2);
		hotelCollection.add(hotel3);
		hotelCollection.add(hotel4);
		hotelCollection.add(hotel5);
		hotelCollection.add(hotel6);
		hotelCollection.add(hotel7);
		hotelCollection.add(hotel8);
		hotelCollection.add(hotel9);
		hotelCollection.add(hotel10);

		System.out.println("Total hotel:" + hotelCollection.size());

		hotelCollection.stream().filter(hotel -> hotel.getLocation().equals("India")).map(hot -> hot.getName())
				.forEach(hotel -> System.out.println("Find all hotels in India :" + hotel));
		System.out.println();
		hotelCollection.stream().filter(hotel -> hotel.getLocation().equals("Sri Lanka")).map(hot -> hot.getName())
				.forEach(hotel -> System.out.println("Find all hotels in Sri Lanka:" + hotel));
		System.out.println();
		hotelCollection.stream().forEach(hotel -> System.out.println("Owner Name :" + hotel.getOwnerName()));
		System.out.println();
		hotelCollection.stream().forEach(hotel -> System.out.println("  GST NO :" + hotel.getGst()));
		System.out.println();
		hotelCollection.stream().filter(hotel -> hotel.getLocation().equals("UK")).map(hot -> hot.getId())
				.forEach(hotel -> System.out.println("Location is Uk :" + hotel));
		System.out.println();
		hotelCollection.stream().filter(hotel -> hotel.getLocation().equals("USA")).map(hot -> hot.getOwnerName())
				.forEach(hotel -> System.out.println("Location is USA :" + hotel));

	}

}
