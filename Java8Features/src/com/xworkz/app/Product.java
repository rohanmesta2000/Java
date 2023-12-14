package com.xworkz.app;

import java.time.LocalDate;

public class Product {
	private int id, price, discount, quantity, rating, peopleRated, peopleRatedFive, peopleRatedFour, peopleRatedThree,
			peopleRatedTwo, peopleRatedOne, itemWeight, modelNo, serialNo;
	private String name, company, description, packer, included, genericName, ASIN, countryOfOrigion, warranty;
	private LocalDate manDate, expiryDate, dateFirstAvailable, deliveryExceptedDate, returnBy;
	private Boolean damaged, returnable, primeDelivery;

	public Product() {

	}

	public Product(int id, int price, int discount, int quantity, int rating, int peopleRated, int peopleRatedFive,
			int peopleRatedFour, int peopleRatedThree, int peopleRatedTwo, int peopleRatedOne, int itemWeight,
			int modelNo, int serialNo, String name, String company, String description, String packer, String included,
			String genericName, String aSIN, String countryOfOrigion, String warranty, LocalDate manDate,
			LocalDate expiryDate, LocalDate dateFirstAvailable, LocalDate deliveryExceptedDate, LocalDate returnBy,
			Boolean damaged, Boolean returnable, Boolean primeDelivery) {
		super();
		this.id = id;
		this.price = price;
		this.discount = discount;
		this.quantity = quantity;
		this.rating = rating;
		this.peopleRated = peopleRated;
		this.peopleRatedFive = peopleRatedFive;
		this.peopleRatedFour = peopleRatedFour;
		this.peopleRatedThree = peopleRatedThree;
		this.peopleRatedTwo = peopleRatedTwo;
		this.peopleRatedOne = peopleRatedOne;
		this.itemWeight = itemWeight;
		this.modelNo = modelNo;
		this.serialNo = serialNo;
		this.name = name;
		this.company = company;
		this.description = description;
		this.packer = packer;
		this.included = included;
		this.genericName = genericName;
		ASIN = aSIN;
		this.countryOfOrigion = countryOfOrigion;
		this.warranty = warranty;
		this.manDate = manDate;
		this.expiryDate = expiryDate;
		this.dateFirstAvailable = dateFirstAvailable;
		this.deliveryExceptedDate = deliveryExceptedDate;
		this.returnBy = returnBy;
		this.damaged = damaged;
		this.returnable = returnable;
		this.primeDelivery = primeDelivery;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getPeopleRated() {
		return peopleRated;
	}

	public void setPeopleRated(int peopleRated) {
		this.peopleRated = peopleRated;
	}

	public int getPeopleRatedFive() {
		return peopleRatedFive;
	}

	public void setPeopleRatedFive(int peopleRatedFive) {
		this.peopleRatedFive = peopleRatedFive;
	}

	public int getPeopleRatedFour() {
		return peopleRatedFour;
	}

	public void setPeopleRatedFour(int peopleRatedFour) {
		this.peopleRatedFour = peopleRatedFour;
	}

	public int getPeopleRatedThree() {
		return peopleRatedThree;
	}

	public void setPeopleRatedThree(int peopleRatedThree) {
		this.peopleRatedThree = peopleRatedThree;
	}

	public int getPeopleRatedTwo() {
		return peopleRatedTwo;
	}

	public void setPeopleRatedTwo(int peopleRatedTwo) {
		this.peopleRatedTwo = peopleRatedTwo;
	}

	public int getPeopleRatedOne() {
		return peopleRatedOne;
	}

	public void setPeopleRatedOne(int peopleRatedOne) {
		this.peopleRatedOne = peopleRatedOne;
	}

	public int getItemWeight() {
		return itemWeight;
	}

	public void setItemWeight(int itemWeight) {
		this.itemWeight = itemWeight;
	}

	public int getModelNo() {
		return modelNo;
	}

	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}

	public int getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPacker() {
		return packer;
	}

	public void setPacker(String packer) {
		this.packer = packer;
	}

	public String getIncluded() {
		return included;
	}

	public void setIncluded(String included) {
		this.included = included;
	}

	public String getGenericName() {
		return genericName;
	}

	public void setGenericName(String genericName) {
		this.genericName = genericName;
	}

	public String getASIN() {
		return ASIN;
	}

	public void setASIN(String aSIN) {
		ASIN = aSIN;
	}

	public String getCountryOfOrigion() {
		return countryOfOrigion;
	}

	public void setCountryOfOrigion(String countryOfOrigion) {
		this.countryOfOrigion = countryOfOrigion;
	}

	public String getWarranty() {
		return warranty;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	public LocalDate getManDate() {
		return manDate;
	}

	public void setManDate(LocalDate manDate) {
		this.manDate = manDate;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public LocalDate getDateFirstAvailable() {
		return dateFirstAvailable;
	}

	public void setDateFirstAvailable(LocalDate dateFirstAvailable) {
		this.dateFirstAvailable = dateFirstAvailable;
	}

	public LocalDate getDeliveryExceptedDate() {
		return deliveryExceptedDate;
	}

	public void setDeliveryExceptedDate(LocalDate deliveryExceptedDate) {
		this.deliveryExceptedDate = deliveryExceptedDate;
	}

	public LocalDate getReturnBy() {
		return returnBy;
	}

	public void setReturnBy(LocalDate returnBy) {
		this.returnBy = returnBy;
	}

	public Boolean getDamaged() {
		return damaged;
	}

	public void setDamaged(Boolean damaged) {
		this.damaged = damaged;
	}

	public Boolean isReturnable() {
		return returnable;
	}

	public void setReturnable(Boolean returnable) {
		this.returnable = returnable;
	}

	public Boolean isPrimeDelivery() {
		return primeDelivery;
	}

	public void setPrimeDelivery(Boolean primeDelivery) {
		this.primeDelivery = primeDelivery;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", price=" + price + ", discount=" + discount + ", quantity=" + quantity
				+ ", rating=" + rating + ", peopleRated=" + peopleRated + ", peopleRatedFive=" + peopleRatedFive
				+ ", peopleRatedFour=" + peopleRatedFour + ", peopleRatedThree=" + peopleRatedThree
				+ ", peopleRatedTwo=" + peopleRatedTwo + ", peopleRatedOne=" + peopleRatedOne + ", itemWeight="
				+ itemWeight + ", modelNo=" + modelNo + ", serialNo=" + serialNo + ", name=" + name + ", company="
				+ company + ", description=" + description + ", packer=" + packer + ", included=" + included
				+ ", genericName=" + genericName + ", ASIN=" + ASIN + ", countryOfOrigion=" + countryOfOrigion
				+ ", warranty=" + warranty + ", manDate=" + manDate + ", expiryDate=" + expiryDate
				+ ", dateFirstAvailable=" + dateFirstAvailable + ", deliveryExceptedDate=" + deliveryExceptedDate
				+ ", returnBy=" + returnBy + ", damaged=" + damaged + ", returnable=" + returnable + ", primeDelivery="
				+ primeDelivery + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ASIN == null) ? 0 : ASIN.hashCode());
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((countryOfOrigion == null) ? 0 : countryOfOrigion.hashCode());
		result = prime * result + (damaged ? 1231 : 1237);
		result = prime * result + ((dateFirstAvailable == null) ? 0 : dateFirstAvailable.hashCode());
		result = prime * result + ((deliveryExceptedDate == null) ? 0 : deliveryExceptedDate.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + discount;
		result = prime * result + ((expiryDate == null) ? 0 : expiryDate.hashCode());
		result = prime * result + ((genericName == null) ? 0 : genericName.hashCode());
		result = prime * result + id;
		result = prime * result + ((included == null) ? 0 : included.hashCode());
		result = prime * result + itemWeight;
		result = prime * result + ((manDate == null) ? 0 : manDate.hashCode());
		result = prime * result + modelNo;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((packer == null) ? 0 : packer.hashCode());
		result = prime * result + peopleRated;
		result = prime * result + peopleRatedFive;
		result = prime * result + peopleRatedFour;
		result = prime * result + peopleRatedOne;
		result = prime * result + peopleRatedThree;
		result = prime * result + peopleRatedTwo;
		result = prime * result + price;
		result = prime * result + (primeDelivery ? 1231 : 1237);
		result = prime * result + quantity;
		result = prime * result + rating;
		result = prime * result + ((returnBy == null) ? 0 : returnBy.hashCode());
		result = prime * result + (returnable ? 1231 : 1237);
		result = prime * result + serialNo;
		result = prime * result + ((warranty == null) ? 0 : warranty.hashCode());
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
		Product other = (Product) obj;
		if (ASIN == null) {
			if (other.ASIN != null)
				return false;
		} else if (!ASIN.equals(other.ASIN))
			return false;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (countryOfOrigion == null) {
			if (other.countryOfOrigion != null)
				return false;
		} else if (!countryOfOrigion.equals(other.countryOfOrigion))
			return false;
		if (damaged != other.damaged)
			return false;
		if (dateFirstAvailable == null) {
			if (other.dateFirstAvailable != null)
				return false;
		} else if (!dateFirstAvailable.equals(other.dateFirstAvailable))
			return false;
		if (deliveryExceptedDate == null) {
			if (other.deliveryExceptedDate != null)
				return false;
		} else if (!deliveryExceptedDate.equals(other.deliveryExceptedDate))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (discount != other.discount)
			return false;
		if (expiryDate == null) {
			if (other.expiryDate != null)
				return false;
		} else if (!expiryDate.equals(other.expiryDate))
			return false;
		if (genericName == null) {
			if (other.genericName != null)
				return false;
		} else if (!genericName.equals(other.genericName))
			return false;
		if (id != other.id)
			return false;
		if (included == null) {
			if (other.included != null)
				return false;
		} else if (!included.equals(other.included))
			return false;
		if (itemWeight != other.itemWeight)
			return false;
		if (manDate == null) {
			if (other.manDate != null)
				return false;
		} else if (!manDate.equals(other.manDate))
			return false;
		if (modelNo != other.modelNo)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (packer == null) {
			if (other.packer != null)
				return false;
		} else if (!packer.equals(other.packer))
			return false;
		if (peopleRated != other.peopleRated)
			return false;
		if (peopleRatedFive != other.peopleRatedFive)
			return false;
		if (peopleRatedFour != other.peopleRatedFour)
			return false;
		if (peopleRatedOne != other.peopleRatedOne)
			return false;
		if (peopleRatedThree != other.peopleRatedThree)
			return false;
		if (peopleRatedTwo != other.peopleRatedTwo)
			return false;
		if (price != other.price)
			return false;
		if (primeDelivery != other.primeDelivery)
			return false;
		if (quantity != other.quantity)
			return false;
		if (rating != other.rating)
			return false;
		if (returnBy == null) {
			if (other.returnBy != null)
				return false;
		} else if (!returnBy.equals(other.returnBy))
			return false;
		if (returnable != other.returnable)
			return false;
		if (serialNo != other.serialNo)
			return false;
		if (warranty == null) {
			if (other.warranty != null)
				return false;
		} else if (!warranty.equals(other.warranty))
			return false;
		return true;
	}

}
