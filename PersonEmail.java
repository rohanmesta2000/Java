class PersonEmail{
	static String getEmailByName(String personName){
		System.out.println("invoking getEmailByName in PersonEmail");
		if(personName!=null){
			System.out.println("getAgeByName is valid");
			if("Prajwal"==personName){
			return "prajwal@gmail.com";
		    }
		    if("Santhosh"==personName){
			return "santhosha@gmail.com";
		    }
		    if("Jakash"==personName){
			return "jakash@gmail.com";
		    }
		    if("Sindhu"==personName){
			return "sindhu787@gmail.com";
		    }
		    if("Jayanath"==personName){
			return "jayanth@gmail.com";
		    }
		    if("Varsha"==personName){
			return "varsha@gmail.com";
		    }
			if("Rohan"==personName){
			return "rohan@gmail.com";
		    }
			if("Chandhan"==personName){
			return "chandhan@gmail.com";
		    }
			if("Prashant"==personName){
			return "prashant@gmail.com";
		    }
			if("Prakash"==personName){
			return "prakashk@gmail.com";
		    }
			
		else{
			System.err.println("getEmailByName is in valid");
		    }
			
		}
		return "none@gmail.com";
		
	}
	
}