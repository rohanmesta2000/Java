package com.xworkz.DTO;

public class FireDTO {
	private String name;
	private double price;
	private boolean fiery;
	private int quantity;

	public FireDTO() {
		super();
	}

	public FireDTO(String name, double price, boolean fiery, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.fiery = fiery;
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

	public boolean isFiery() {
		return fiery;
	}

	public void setFiery(boolean fiery) {
		this.fiery = fiery;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "FireDTO [name=" + name + ", price=" + price + ", fiery=" + fiery + ", quantity=" + quantity + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoking equals for FireDTO....");
		if (obj != null) {
			if (obj instanceof FireDTO) {
				FireDTO dto = (FireDTO) obj;
				if (dto.getName().equals(this.name) && Double.compare(dto.price, this.price) == 0
						&& dto.fiery == this.fiery && dto.quantity == this.quantity) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		System.out.println("Invoking hashCode for FireDTO....");
		return 99;
	}

}
