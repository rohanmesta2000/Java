package com.xworkz.DTO;

public class TheaterDTO implements Comparable<TheaterDTO> {
	private int cost;
	private String name;
	private String place;
	private int capacity;

	public TheaterDTO() {
		super();
	}

	public TheaterDTO(int cost, String name, String place, int capacity) {
		super();
		this.cost = cost;
		this.name = name;
		this.place = place;
		this.capacity = capacity;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "TheaterDTO [cost=" + cost + ", name=" + name + ", place=" + place + ", capacity=" + capacity + "]";
	}

	@Override
	public int compareTo(TheaterDTO dtos) {
		TheaterDTO current = this;
		if (current.capacity == dtos.capacity) {
			return 0;
		}
		if (current.capacity < dtos.capacity) {
			return 66;
		}
		if (current.capacity > dtos.capacity) {
			return -6;
		}
		throw new IllegalArgumentException("Cannot compare theatre");
	}
// return this.name.compareTo(dtos.name);

}
