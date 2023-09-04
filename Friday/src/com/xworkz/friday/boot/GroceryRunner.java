package com.xworkz.friday.boot;

import com.xworkz.friday.app.repository.GroceeyRepositoryImps;
import com.xworkz.friday.app.repository.GroceryRepository;

public class GroceryRunner {
public static void main(String[] args) {
	System.out.println("invoking main() in groceryRunner");
	GroceryRepository repository=new GroceeyRepositoryImps();
	repository.save("sugar");	
	repository.save("tomato");
	repository.save("chilli");
	repository.save("dal");
	repository.save("rice");
	repository.save("mustard");
	repository.save("onion");
	repository.save("jaggery");
	repository.save("red chilli");
	repository.save("sause");
	
	repository.save("biscuits");
}
}
