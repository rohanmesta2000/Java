package com.xworkz.DTO;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Collection;

public class CameraDTO implements Serializable {

	private int id;
	private String brand;
	private String model;
	private int cost;
	private LocalDate manufacDate;

	public CameraDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public LocalDate getManufacDate() {
		return manufacDate;
	}

	public void setManufacDate(LocalDate manufacDate) {
		this.manufacDate = manufacDate;
	}

	public CameraDTO(int id, String brand, String model, int cost, LocalDate manufacDate) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.cost = cost;
		this.manufacDate = manufacDate;
	}

	@Override
	public String toString() {
		return "CameraDTO [id=" + id + ", brand=" + brand + ", model=" + model + ", cost=" + cost + ", manufacDate="
				+ manufacDate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + cost;
		result = prime * result + id;
		result = prime * result + ((manufacDate == null) ? 0 : manufacDate.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
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
		CameraDTO other = (CameraDTO) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (cost != other.cost)
			return false;
		if (id != other.id)
			return false;
		if (manufacDate == null) {
			if (other.manufacDate != null)
				return false;
		} else if (!manufacDate.equals(other.manufacDate))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}

}
