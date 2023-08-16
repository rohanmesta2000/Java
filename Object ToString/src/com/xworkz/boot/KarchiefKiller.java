package com.xworkz.boot;

import com.xworkz.java.Karchief;

public class KarchiefKiller {
	

		public static void main(String[] args) {
			System.out.println("Invoking main in Karchief Maker");

	        Karchief karchief = new Karchief("Floral Delight", "Floral Pattern", 50, "Cotton", true, "FashionCo", 2);
	        System.out.println(karchief);

	        Karchief karchief1 = new Karchief("Striped Elegance", "Striped Pattern", 60,"Silk", false, "LuxuryFabrics", 1);
	        System.out.println(karchief1);

	        Karchief karchief2 = new Karchief("Abstract Fusion", "Abstract Pattern", 45,"Polyester", true, "TrendyStyles", 1);
	        System.out.println(karchief2);
	    }
		}



