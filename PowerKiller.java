    class PowerKiller{    
		public static void main(String[] args) {
        Power.printStatic(); 

        Power power1 = new Power("Nuclear", "Renewable");
        power1.printInstance(); 

        Power power2 = new Power(89, "Green");
        power2.printInstance(); 
    }
	}
	
