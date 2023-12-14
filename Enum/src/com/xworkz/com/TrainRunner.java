package com.xworkz.com;

import com.xworkz.DTO.TrainDTO;
import com.xworkz.constant.TrainPrice;

public class TrainRunner {
public static void main(String[] args) {

	
	TrainDTO dto =new TrainDTO();
	dto.setName("RAJADANI EXPRESS");
	dto.setPrice(TrainPrice.SLEEPER_CLASS);
	dto.setSeatNo(9)   ;
	System.out.println(TrainPrice.SLEEPER_CLASS.getPrice());
	
	
	
}
	
}


