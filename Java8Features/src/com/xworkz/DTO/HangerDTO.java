package com.xworkz.DTO;

public class HangerDTO {
	private String type;
	private String color;
	private int size;
	private boolean isWooden;

	public HangerDTO() {
		super();
	}

	public HangerDTO(String type, String color, int size, boolean isWooden) {
		super();
		this.type = type;
		this.color = color;
		this.size = size;
		this.isWooden = isWooden;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean isWooden() {
		return isWooden;
	}

	public void setWooden(boolean wooden) {
		isWooden = wooden;
	}

	@Override
	public String toString() {
		return "HangerDTO [type=" + type + ", color=" + color + ", size=" + size + ", isWooden=" + isWooden + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoking equals for HangerDTO....");
		if (obj != null) {
			if (obj instanceof HangerDTO) {
				HangerDTO dto = (HangerDTO) obj;
				if (dto.getType().equals(this.type) && dto.getColor().equals(this.color) && dto.getSize() == this.size
						&& dto.isWooden() == this.isWooden) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		System.out.println("Invoking hashCode for HangerDTO....");
		return 99;
	}

}
