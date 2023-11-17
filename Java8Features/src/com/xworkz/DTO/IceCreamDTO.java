package com.xworkz.DTO;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.stream.Stream;

public class IceCreamDTO implements Serializable, Comparable<IceCreamDTO> {

	private String name;
	private String flavour;
	private Double price;
	private LocalDate manDate;
	private String type;

	public IceCreamDTO() {

	}

	public IceCreamDTO(String name, String flavour, Double price, LocalDate manDate, String type) {
		super();
		this.name = name;
		this.flavour = flavour;
		this.price = price;
		this.manDate = manDate;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public LocalDate getManDate() {
		return manDate;
	}

	public void setManDate(LocalDate manDate) {
		this.manDate = manDate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

	@Override
	public String toString() {
		return "IceCreamDTO [name=" + name + ", flavour=" + flavour + ", price=" + price + ", manDate=" + manDate
				+ ", type=" + type + "]";
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((flavour == null) ? 0 : flavour.hashCode());
		result = prime * result + ((manDate == null) ? 0 : manDate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IceCreamDTO other = (IceCreamDTO) obj;
		if (flavour == null) {
			if (other.flavour != null)
				return false;
		} else if (!flavour.equals(other.flavour))
			return false;
		if (manDate == null) {
			if (other.manDate != null)
				return false;
		} else if (!manDate.equals(other.manDate))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public int compareTo(IceCreamDTO arguments) {

		return this.price.compareTo(arguments.price);
		
	}

}
