package com.xworkz.runner;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.xworkz.DTO.CompanyDTO;
import com.xworkz.DTO.ProductDTO;

public class ProductRunner {

	public static void main(String[] args) {
		ProductDTO dto1 = new ProductDTO("Chocalate", 50, 2, 1, LocalDate.of(2023, 10, 20));
		ProductDTO dto2 = new ProductDTO("Rice", 100, 10, 2, LocalDate.of(2023, 6, 12));
		ProductDTO dto3 = new ProductDTO("Laptop", 300, 8, 4, LocalDate.of(2023, 11, 22));

		CompanyDTO dtoo1 = new CompanyDTO("Xworkz", "Rajaji Nagar", 4378290);
		CompanyDTO dtoo2 = new CompanyDTO("TCS", "Chennai", 374);
		CompanyDTO dtoo3 = new CompanyDTO("Accenture", "Hyderbad", 98);

		Map<ProductDTO, CompanyDTO> map1 = new HashMap<ProductDTO, CompanyDTO>();
		map1.put(dto3, dtoo3);
		map1.put(dto2, dtoo2);
		map1.put(dto1, dtoo1);

		System.out.println("==========");
		Set<ProductDTO> set1 = map1.keySet();
		set1.forEach(c -> System.out.println(c));

		System.out.println("===========");
		Collection<CompanyDTO> companies = map1.values();
		companies.forEach(s -> System.out.println(s));
	}

}
