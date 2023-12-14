package com.xworkz.friday.app.repository;

public class ArtistImps implements Artist{
private String[] artists=new String[FAMOUS_PERSON];
private int position;
	@Override
	public void save(String person) {
	System.out.println("arist is like magic");
	
	if(this.position<FAMOUS_PERSON) {
		this.artists[position]=person;
		System.out.println("Art of painting"+person+"in positon"+this.position);
		this.position++;
	}
	else {
		System.err.println("data store is fully error in artist list");
	}
	}

}
