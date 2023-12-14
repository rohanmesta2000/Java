package com.xworkz.friday.boot;

import com.xworkz.friday.app.repository.Jacket;
import com.xworkz.friday.app.repository.JacketImps;

public class JacketRuuner {
	public static void main(String[] args) {
        System.out.println("Invoking the main method");
        Jacket jacketRepository = new JacketImps();

        jacketRepository.addJacket("Nike");
        jacketRepository.addJacket("Adidas");
        jacketRepository.addJacket("Puma");
        jacketRepository.addJacket("Reebok");
        jacketRepository.addJacket("Columbia");
        jacketRepository.addJacket("North Face");
        jacketRepository.addJacket("Patagonia");
        jacketRepository.addJacket("Under Armour");
        jacketRepository.addJacket("Fila");
        jacketRepository.addJacket("New Balance");

        
        jacketRepository.addJacket("Overflow");
    }
}
