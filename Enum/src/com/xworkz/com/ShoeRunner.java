package com.xworkz.com;

import com.xworkz.DTO.ShoeDTO;
import com.xworkz.constant.ShoeSize;
import com.xworkz.constant.ShoeType;

public class ShoeRunner {

	public static void main(String[] args) {
		ShoeDTO dto=new ShoeDTO();
		dto.setBrand("FORMAL");
		dto.setCost(21632);
		dto.setSize(ShoeSize.MEDIUM);
		dto.setType(ShoeType.NIKE);
		System.out.println(dto);
		
		
	

	}

}
