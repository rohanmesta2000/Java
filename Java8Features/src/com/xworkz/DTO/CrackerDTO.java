package com.xworkz.DTO;

public class CrackerDTO {

	private String name;
	private double price;
	private boolean explosive;
	private int quantity;

	public CrackerDTO() {
		super();
	}

	public CrackerDTO(String name, double price, boolean explosive, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.explosive = explosive;
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

	public boolean isExplosive() {
		return explosive;
	}

	public void setExplosive(boolean explosive) {
		this.explosive = explosive;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "CrackerDTO [name=" + name + ", price=" + price + ", explosive=" + explosive + ", quantity=" + quantity
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoking equals for CrackerDTO....");
		if (obj != null) {
			if (obj instanceof CrackerDTO) {
				CrackerDTO dto = (CrackerDTO) obj;
				if (dto.getName().equals(this.name) && Double.compare(dto.price, this.price) == 0
						&& dto.explosive == this.explosive && dto.quantity == this.quantity) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		System.out.println("Invoking hashCode for CrackerDTO....");
		return 99;
	}

}
