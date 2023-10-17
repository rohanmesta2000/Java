package com.xworkz.boot;

import com.xworkz.app.DiapsidaDinosaur;
import com.xworkz.app.Dinosaur;

public class DinosaurKiller {

	public static void main(String[] args) {
			System.out.println("invoking main in AmoebaKiller");

			Dinosaur dinosaur = new DiapsidaDinosaur();
			dinosaur.fire();

	}

}
