package com.xworkz.DTO;

public class PinDTO {
	private int pinCode;
	private String area;
	private String city;
	private String state;

	public PinDTO() {
		super();
	}

	public PinDTO(int pinCode, String area, String city, String state) {
		super();
		this.pinCode = pinCode;
		this.area = area;
		this.city = city;
		this.state = state;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "PinDTO [pinCode=" + pinCode + ", area=" + area + ", city=" + city + ", state=" + state + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoking equals for PinDTO....");
		if (obj != null) {
			if (obj instanceof PinDTO) {
				PinDTO dto = (PinDTO) obj;
				if (dto.getPinCode() == this.pinCode && dto.getArea().equals(this.area)
						&& dto.getCity().equals(this.city) && dto.getState().equals(this.state)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		System.out.println("Invoking hashCode for PinDTO....");
		return 9;
	}
}
