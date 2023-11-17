package com.xworkz.DTO;

public class WireDTO {

	    private String type;
	    private double length;
	    private boolean insulated;
	    private int quantity;

	    public WireDTO() {
	        super();
	    }

	    public WireDTO(String type, double length, boolean insulated, int quantity) {
	        super();
	        this.type = type;
	        this.length = length;
	        this.insulated = insulated;
	        this.quantity = quantity;
	    }

	    public String getType() {
	        return type;
	    }

	    public void getType(String type) {
	        this.type = type;
	    }

	    public double getLength() {
	        return length;
	    }

	    public void setLength(double length) {
	        this.length = length;
	    }

	    public boolean isInsulated() {
	        return insulated;
	    }

	    public void setInsulated(boolean insulated) {
	        this.insulated = insulated;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    public void setQuantity(int quantity) {
	        this.quantity = quantity;
	    }

	    @Override
	    public String toString() {
	        return "Wire [type=" + type + ", length=" + length + ", insulated=" + insulated + ", quantity=" + quantity + "]";
	    }

	    @Override
	    public boolean equals(Object obj) {
	        System.out.println("Invoking equals for Wire....");
	        if (obj != null) {
	            if (obj instanceof WireDTO) {
	                WireDTO wire = (WireDTO) obj;
	                if (wire.getType().equals(this.type) && Double.compare(wire.length, this.length) == 0
	                        && wire.insulated == this.insulated && wire.quantity == this.quantity) {
	                    return true;
	                }
	            }
	        }
	        return false;
	    }

	    @Override
	    public int hashCode() {
	        System.out.println("Invoking hashCode for Wire....");
	        return 99;
	    }
}
