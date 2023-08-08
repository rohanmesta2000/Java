package com.xworkz.boot;

import com.xworkz.app.Amoeba;
import com.xworkz.app.SmallAmoeba;

public class AmoebaKiller {

	public static void main(String[] args) {
		System.out.println("invoking main in AmoebaKiller");

		Amoeba amoeba = new SmallAmoeba();
		amoeba.cell();

	}

}
