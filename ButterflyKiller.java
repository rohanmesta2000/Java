    class ButterflyKiller{    
		public static void main(String[] args) {
        Butterfly.printStatic(); 

        Butterfly butterfly1 = new Butterfly("Monarch", "Danaus plexippus");
        butterfly1.printInstance(); 

        Butterfly butterfly2 = new Butterfly(5, "Orange");
        butterfly2.printInstance(); 
    }
	}