    class CandleKiller{    
		public static void main(String[] args) {
        Candle.printStatic(); 

        Candle candle1 = new Candle("Mold", "white");
        candle1.printInstance(); 

        Candle candle2 = new Candle(69, "Large");
        candle2.printInstance(); 
    }
	}
	
