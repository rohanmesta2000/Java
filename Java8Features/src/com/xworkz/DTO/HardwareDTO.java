package com.xworkz.DTO;

public class HardwareDTO {
	private String hardwareName;
	private String type;
	private double price;
	private int quantity;

	public HardwareDTO() {
		super();
	}

	public HardwareDTO(String hardwareName, String type, double price, int quantity) {
		super();
		this.hardwareName = hardwareName;
		this.type = type;
		this.price = price;
		this.quantity = quantity;
	}

	public String getHardwareName() {
		return hardwareName;
	}

	public void setHardwareName(String hardwareName) {
		this.hardwareName = hardwareName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "HardwareDTO [hardwareName=" + hardwareName + ", type=" + type + ", price=" + price + ", quantity="
				+ quantity + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoking equals for HardwareDTO....");
		if (obj != null && obj instanceof HardwareDTO) {
			HardwareDTO dto = (HardwareDTO) obj;
			return dto.getHardwareName().equals(this.hardwareName) && dto.getType().equals(this.type)
					&& Double.compare(dto.getPrice(), this.price) == 0 && dto.getQuantity() == this.quantity;
		}
		return false;
	}

	@Override
	public int hashCode() {
		System.out.println("Invoking hashCode for HardwareDTO....");
		return 99;
	}
}
