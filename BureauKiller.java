 class BureauKiller{    
		public static void main(String[] args) {
        Bureau.printStatic(); 

        Bureau bureau1 = new Bureau("Bureau One", "Downtown");
        bureau1.printInstance(); 

        Bureau bureau2 = new Bureau(50, "Human Resources");
        bureau2.printInstance(); 
    }
	}
	