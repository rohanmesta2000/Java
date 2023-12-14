package com.xworkz.DTO;

public class TyreDTO {
	private String brand;
	private double size;
	private int loadIndex;
	private boolean isWinterTyre;

	public TyreDTO() {
		super();
	}

	public TyreDTO(String brand, double size, int loadIndex, boolean isWinterTyre) {
		super();
		this.brand = brand;
		this.size = size;
		this.loadIndex = loadIndex;
		this.isWinterTyre = isWinterTyre;
	}

	public String getBrand() {
		return brand;
	}

	public void getBrand(String brand) {
		this.brand = brand;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public int getLoadIndex() {
		return loadIndex;
	}

	public void setLoadIndex(int loadIndex) {
		this.loadIndex = loadIndex;
	}

	public boolean isWinterTyre() {
		return isWinterTyre;
	}

	public void setWinterTyre(boolean winterTyre) {
		isWinterTyre = winterTyre;
	}

	@Override
	public String toString() {
		return "TyreDTO [brand=" + brand + ", size=" + size + ", loadIndex=" + loadIndex + ", isWinterTyre="
				+ isWinterTyre + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoking equals for TyreDTO....");
		if (obj != null) {
			if (obj instanceof TyreDTO) {
				TyreDTO tyre = (TyreDTO) obj;
				if (tyre.getBrand().equals(this.brand) && Double.compare(tyre.size, this.size) == 0
						&& tyre.loadIndex == this.loadIndex && tyre.isWinterTyre == this.isWinterTyre) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		System.out.println("Invoking hashCode for TyreDTO....");
		return 99;
	}
}
