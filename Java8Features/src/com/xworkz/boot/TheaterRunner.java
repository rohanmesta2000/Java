package com.xworkz.boot;

import java.util.Collection;
import java.util.LinkedList;

import com.xworkz.DTO.TheaterDTO;

public class TheaterRunner {
	public static void main(String[] args) {
		System.out.println("Running in main method");

		TheaterDTO dto = new TheaterDTO(70, "Bharat Cinemas", "manglore", 300);
		TheaterDTO dto1 = new TheaterDTO(190, "Sathyam Cinemas", "nungamkkam", 1300);
		TheaterDTO dto2 = new TheaterDTO(700, "Luxe cinemas", "Honnavar", 500);
		TheaterDTO dto3 = new TheaterDTO(1070, "Bharat Cinemas", "manglore", 600);
		TheaterDTO dto4 = new TheaterDTO(1870, "Palazzo Cinemas", "hassan", 250);

		Collection<TheaterDTO> ref = new LinkedList<TheaterDTO>();
		ref.add(dto);
		ref.add(dto1);
		ref.add(dto2);
		ref.add(dto3);
		ref.add(dto4);

		ref.stream().sorted().forEach(t -> System.out.println(t));

	}
}
