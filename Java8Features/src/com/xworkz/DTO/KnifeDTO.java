package com.xworkz.DTO;

public class KnifeDTO {
	private String name;
	private double price;
	private boolean stainlessSteel;
	private int quantity;

	public KnifeDTO() {
		super();
	}

	public KnifeDTO(String name, double price, boolean stainlessSteel, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.stainlessSteel = stainlessSteel;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isStainlessSteel() {
		return stainlessSteel;
	}

	public void setStainlessSteel(boolean stainlessSteel) {
		this.stainlessSteel = stainlessSteel;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "KnifeDTO [name=" + name + ", price=" + price + ", stainlessSteel=" + stainlessSteel + ", quantity="
				+ quantity + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoking equals for KnifeDTO....");
		if (obj != null) {
			if (obj instanceof KnifeDTO) {
				KnifeDTO dto = (KnifeDTO) obj;
				if (dto.getName().equals(this.name) && Double.compare(dto.price, this.price) == 0
						&& dto.stainlessSteel == this.stainlessSteel && dto.quantity == this.quantity) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		System.out.println("Invoking hashCode for KnifeDTO....");
		return 99;
	}
}
