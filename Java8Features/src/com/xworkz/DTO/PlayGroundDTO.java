package com.xworkz.DTO;

public class PlayGroundDTO {
	private String type;
	private int size;
	private boolean outdoor;
	private String color;

	public PlayGroundDTO() {
		super();
	}

	public PlayGroundDTO(String type, int size, boolean outdoor, String color) {
		super();
		this.type = type;
		this.size = size;
		this.outdoor = outdoor;
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean isOutdoor() {
		return outdoor;
	}

	public void setOutdoor(boolean outdoor) {
		this.outdoor = outdoor;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "PlayGroundDTO [type=" + type + ", size=" + size + ", outdoor=" + outdoor + ", color=" + color + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoking equals for PlayGroundDTO....");
		if (obj != null) {
			if (obj instanceof PlayGroundDTO) {
				PlayGroundDTO dto = (PlayGroundDTO) obj;
				if (dto.getType().equals(this.type) && dto.getSize() == this.size && dto.isOutdoor() == this.outdoor
						&& dto.getColor().equals(this.color)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		System.out.println("Invoking hashCode for PlayGroundDTO....");
		return 199;
	}

}
