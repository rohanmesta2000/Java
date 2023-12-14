package com.xworkz.app.dto;

public class SaloonItemDTO {
	private int id;
	private String name;
	private int price;
	private String usage;
	private boolean man;
	
	
	public SaloonItemDTO() {
		super();
	}


	public SaloonItemDTO(int id, String name, int price, String usage, boolean man) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.usage = usage;
		this.man = man;
	}


	@Override
	public String toString() {
		return "SallonItemDTO [id=" + id + ", name=" + name + ", price=" + price + ", usage=" + usage + ", man=" + man
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + (man ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		result = prime * result + ((usage == null) ? 0 : usage.hashCode());
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
		SaloonItemDTO other = (SaloonItemDTO) obj;
		if (id != other.id)
			return false;
		if (man != other.man)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		if (usage == null) {
			if (other.usage != null)
				return false;
		} else if (!usage.equals(other.usage))
			return false;
		return true;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getUsage() {
		return usage;
	}


	public void setUsage(String usage) {
		this.usage = usage;
	}


	public boolean isMan() {
		return man;
	}


	public void setMan(boolean man) {
		this.man = man;
	}
	
	
	
	
	
	
	
	

}
