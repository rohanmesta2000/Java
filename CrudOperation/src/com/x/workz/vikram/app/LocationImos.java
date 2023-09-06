package com.x.workz.vikram.app;

public class LocationImos implements Location {
  public String[] places = new String [TOTAL_PLACES];
  private int position;
  
	@Override
	public void save(String location) {
	System.out.println("location is valid");
	if(this.position<TOTAL_PLACES) {
		this.places[position]=location;
		System.out.println("Locationadded"+location+"at position"+this.position);
		this.position++;
	}
	else {
		System.err.println("location is not god poor coonectivity");
	}
	
		
	}
	@Override
		public boolean isExist(String location) {
		for(int start=0;start<=this.position;start++) {
			String temp =this.places[start];
			if(temp!=null && temp.equals(location)) {
				System.err.println("loaction already exist");
				return true;
			}
		}
			return false;
		}

}
