package com.xworkz.app;

public class Kalla {
	
	    private String name;
	    private String alias;
	    private int age;
	    private String gang;
	    private double bounty;
	    private boolean isMale;

	    public Kalla() {

	    }

	    public Kalla(String name, String alias, int age, String gang, double bounty, boolean isMale) {
	        this.name = name;
	        this.alias = alias;
	        this.age = age;
	        this.gang = gang;
	        this.bounty = bounty;
	        this.isMale = isMale;
	    }

	    @Override
	    public String toString() {
	        return "Name: " + this.name + " Alias: " + this.alias + " Age: " + this.age + " Gang: " + this.gang
	                + " Bounty: " + this.bounty + " IsMale: " + this.isMale;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        System.out.println("Invoking equals() in Kalla");
	        if (obj != null) {
	            System.out.println("Object is not null, can compare");
	            if (obj instanceof Kalla) {
	                System.out.println("Object is Kalla");
	            }
	            Kalla casted = (Kalla) obj;
	            Kalla currentInstance = this;
	            if (currentInstance.name.equals(casted.name) &&  currentInstance.alias.equals(casted.alias) &&  currentInstance.age == casted.age &&  currentInstance.gang.equals(casted.gang) &&  currentInstance.bounty == casted.bounty &&  currentInstance.isMale == casted.isMale){
	                System.out.println("Kalla and object is same");
	                return true;
	            } else {
	                System.err.println("Kalla and object is not same");
	            }
	        } else {
	            System.err.println("Object is null, cannot compare");
	        }
	        return false;
	    }
}

