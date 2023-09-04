package com.xworkz.friday.app.repository;

public class GroceeyRepositoryImps implements GroceryRepository {
private String[] groceries =new String[TOTAL_ITEMS];
private int position;
	@Override
	public void save(String grocery) {
		System.out.println("invoking in grocery shop");
		if(this.position<TOTAL_ITEMS)
		{
			this.groceries[position]=grocery;
			System.out.println("Item added"+grocery+"at position"+this.position);
			this.position++;
			
		}
		else {
			System.err.println("DATA srore is full cannot add a new item");
		}
		
	}

}
