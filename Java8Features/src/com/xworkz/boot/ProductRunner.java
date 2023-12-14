package com.xworkz.boot;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Stream;

import com.xworkz.app.Product;

public class ProductRunner {

	public static void main(String[] args) {
		Product product1 = new Product(1, 100, 10, 50, 4, 1000, 300, 400, 200, 50, 50, 5, 12345, 6789, "Product A",
				"Company A", "Description of Product A", "Packer A", "Included A", "Generic A", "B12345", "Country A",
				"1 Year Warranty", LocalDate.of(2023, 1, 15), LocalDate.of(2024, 1, 15), LocalDate.of(2023, 11, 1),
				LocalDate.of(2023, 11, 5), LocalDate.of(2024, 1, 31), false, true, true);

		Product product2 = new Product(2, 75, 5, 30, 3, 800, 200, 300, 100, 50, 50, 4, 54321, 9876, "Product B",
				"Company B", "Description of Product B", "Packer B", "Included B", "Generic B", "C54321", "Country B",
				"2 Year Warranty", LocalDate.of(2023, 2, 20), LocalDate.of(2024, 2, 20), LocalDate.of(2023, 11, 2),
				LocalDate.of(2023, 11, 6), LocalDate.of(2024, 2, 28), false, true, false);

		Product product3 = new Product(3, 50, 8, 20, 5, 1200, 400, 400, 200, 100, 100, 3, 98765, 4321, "Product C",
				"Company C", "Description of Product C", "Packer C", "Included C", "Generic C", "D98765", "Country C",
				"6 Month Warranty", LocalDate.of(2023, 3, 10), LocalDate.of(2023, 9, 10), LocalDate.of(2023, 11, 3),
				LocalDate.of(2023, 11, 7), LocalDate.of(2023, 11, 30), true, true, true);

		Product product4 = new Product(4, 200, 15, 70, 4, 1500, 400, 500, 300, 200, 100, 6, 13579, 8642, "Product D",
				"Company D", "Description of Product D", "Packer D", "Included D", "Generic D", "E13579", "Country D",
				"3 Year Warranty", LocalDate.of(2023, 4, 5), LocalDate.of(2026, 4, 5), LocalDate.of(2023, 11, 5),
				LocalDate.of(2023, 11, 9), LocalDate.of(2026, 4, 30), false, true, true);

		Product product5 = new Product(5, 150, 12, 60, 5, 1800, 500, 500, 300, 300, 200, 4, 24680, 9753, "Product E",
				"Company E", "Description of Product E", "Packer E", "Included E", "Generic E", "F24680", "Country E",
				"1 Year Warranty", LocalDate.of(2023, 5, 12), LocalDate.of(2024, 5, 12), LocalDate.of(2023, 11, 12),
				LocalDate.of(2023, 11, 16), LocalDate.of(2024, 5, 31), true, true, true);

		Product product6 = new Product(6, 80, 7, 40, 4, 1100, 300, 300, 200, 200, 100, 5, 86420, 1234, "Product F",
				"Company F", "Description of Product F", "Packer F", "Included F", "Generic F", "G86420", "Country F",
				"2 Year Warranty", LocalDate.of(2023, 6, 8), LocalDate.of(2025, 6, 8), LocalDate.of(2023, 11, 8),
				LocalDate.of(2023, 11, 12), LocalDate.of(2025, 6, 30), false, true, true);

		Product product7 = new Product(7, 120, 10, 55, 3, 900, 200, 400, 100, 100, 100, 7, 97531, 5678, "Product G",
				"Company G", "Description of Product G", "Packer G", "Included G", "Generic G", "H97531", "Country G",
				"1 Year Warranty", LocalDate.of(2023, 7, 25), LocalDate.of(2024, 7, 25), LocalDate.of(2023, 11, 25),
				LocalDate.of(2023, 11, 29), LocalDate.of(2024, 7, 31), true, true, false);

		Product product8 = new Product(8, 180, 14, 65, 4, 1300, 300, 500, 300, 200, 200, 8, 75319, 2468, "Product H",
				"Company H", "Description of Product H", "Packer H", "Included H", "Generic H", "I75319", "Country H",
				"2 Year Warranty", LocalDate.of(2023, 8, 18), LocalDate.of(2025, 8, 18), LocalDate.of(2023, 11, 18),
				LocalDate.of(2023, 11, 22), LocalDate.of(2025, 8, 31), true, true, true);

		Product product9 = new Product(9, 90, 9, 45, 5, 1600, 400, 400, 300, 200, 100, 5, 123456, 9876, "Product I",
				"Company I", "Description of Product I", "Packer I", "Included I", "Generic I", "J123456", "Country I",
				"3 Year Warranty", LocalDate.of(2023, 9, 14), LocalDate.of(2026, 9, 14), LocalDate.of(2023, 11, 14),
				LocalDate.of(2023, 11, 18), LocalDate.of(2026, 9, 30), false, true, false);

		Product product10 = new Product(10, 210, 20, 75, 4, 1400, 400, 500, 300, 200, 200, 6, 86421, 4321, "Product J",
				"Company J", "Description of Product J", "Packer J", "Included J", "Generic J", "K86421", "Country J",
				"1 Year Warranty", LocalDate.of(2023, 10, 30), LocalDate.of(2024, 10, 30), LocalDate.of(2023, 11, 30),
				LocalDate.of(2023, 12, 4), LocalDate.of(2024, 11, 30), false, true, true);

		Collection<Product> product = new ArrayList<Product>();
		product.add(product1);
		product.add(product2);
		product.add(product3);
		product.add(product4);
		product.add(product5);
		product.add(product6);
		product.add(product7);
		product.add(product8);
		product.add(product9);
		product.add(product10);

		System.out.println("name in ascending order");
		Comparator<Product> nameas = (t1, t2) -> t1.getName().compareTo(t2.getName());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(nameas).forEach(ref -> System.out.println(ref));

		System.out.println("name in descending order");
		Comparator<Product> namedes = (t1, t2) -> t2.getName().compareTo(t1.getName());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(namedes).forEach(ref -> System.out.println(ref));

		System.out.println("id in ascending order");
		Comparator<Product> idas = (t1, t2) -> Integer.compare(t1.getId(), t2.getId());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(idas).forEach(ref -> System.out.println(ref));

		System.out.println("id in descending order");
		Comparator<Product> iddes = (t1, t2) -> Integer.compare(t2.getId(), t1.getId());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(iddes).forEach(ref -> System.out.println(ref));

		System.out.println("price in ascending order");
		Comparator<Product> priceas = (t1, t2) -> Integer.compare(t1.getPrice(), t2.getPrice());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(priceas).forEach(ref -> System.out.println(ref));

		System.out.println("price in descending order");
		Comparator<Product> pricedes = (t1, t2) -> Integer.compare(t2.getPrice(), t1.getPrice());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(pricedes).forEach(ref -> System.out.println(ref));

		System.out.println("company in ascending order");
		Comparator<Product> companyas = (t1, t2) -> t1.getCompany().compareTo(t2.getCompany());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(companyas).forEach(ref -> System.out.println(ref));

		System.out.println("name in descending order");
		Comparator<Product> companydes = (t1, t2) -> t2.getName().compareTo(t1.getName());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(companydes).forEach(ref -> System.out.println(ref));

		System.out.println("manu in asscending order");
		Comparator<Product> manuas = (t1, t2) -> t1.getManDate().compareTo(t2.getManDate());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(manuas).forEach(ref -> System.out.println(ref));

		System.out.println("manu in descending order");
		Comparator<Product> manudes = (t1, t2) -> t2.getManDate().compareTo(t1.getManDate());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(manudes).forEach(ref -> System.out.println(ref));

		System.out.println("exp in asscending order");
		Comparator<Product> expas = (t1, t2) -> t1.getExpiryDate().compareTo(t2.getExpiryDate());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(expas).forEach(ref -> System.out.println(ref));

		System.out.println("exp in descending order");
		Comparator<Product> expdes = (t1, t2) -> t2.getExpiryDate().compareTo(t1.getExpiryDate());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(expdes).forEach(ref -> System.out.println(ref));

		System.out.println("discount in asscending order");
		Comparator<Product> disas = (t1, t2) -> Integer.compare(t1.getDiscount(), t2.getDiscount());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(disas).forEach(ref -> System.out.println(ref));

		System.out.println("discount in descending order");
		Comparator<Product> disdec = (t1, t2) -> Integer.compare(t2.getDiscount(), t1.getDiscount());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(disdec).forEach(ref -> System.out.println(ref));

		System.out.println("des in asscending order");
		Comparator<Product> desas = (t1, t2) -> t1.getDescription().compareTo(t2.getDescription());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(desas).forEach(ref -> System.out.println(ref));

		System.out.println("des in descending order");
		Comparator<Product> desdes = (t1, t2) -> t2.getDescription().compareTo(t1.getDescription());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(desdes).forEach(ref -> System.out.println(ref));

		System.out.println("quantity in asscending order");
		Comparator<Product> quanas = (t1, t2) -> Integer.compare(t1.getQuantity(), t2.getQuantity());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(quanas).forEach(ref -> System.out.println(ref));

		System.out.println("quantity in descending order");
		Comparator<Product> quandes = (t1, t2) -> Integer.compare(t2.getQuantity(), t1.getQuantity());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(quandes).forEach(ref -> System.out.println(ref));

		System.out.println("rating in asscending order");
		Comparator<Product> ratingas = (t1, t2) -> Integer.compare(t1.getRating(), t2.getRating());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(ratingas).forEach(ref8 -> System.out.println(ref8));

		System.out.println("rating in descending order");
		Comparator<Product> ratindes = (t1, t2) -> Integer.compare(t2.getRating(), t1.getRating());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(ratindes).forEach(ref9 -> System.out.println(ref9));

		System.out.println("people rated in asscending order");
		Comparator<Product> peopleas = (t1, t2) -> Integer.compare(t1.getPeopleRated(), t2.getPeopleRated());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(peopleas).forEach(ref8 -> System.out.println(ref8));

		System.out.println("people rated in descending order");
		Comparator<Product> peopledes = (t1, t2) -> Integer.compare(t2.getPeopleRated(), t1.getPeopleRated());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(peopledes).forEach(ref9 -> System.out.println(ref9));

		System.out.println("people rated five in asscending order");
		Comparator<Product> people5as = (t1, t2) -> Integer.compare(t1.getPeopleRatedFive(), t2.getPeopleRatedFive());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(people5as).forEach(ref8 -> System.out.println(ref8));

		System.out.println("people rated in descending order");
		Comparator<Product> people5des = (t1, t2) -> Integer.compare(t2.getPeopleRatedFive(), t1.getPeopleRatedFive());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(people5des).forEach(ref9 -> System.out.println(ref9));

		System.out.println("people rated in asscending order");
		Comparator<Product> people4as = (t1, t2) -> Integer.compare(t1.getPeopleRatedFour(), t2.getPeopleRatedFour());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(people4as).forEach(ref8 -> System.out.println(ref8));

		System.out.println("people rated in descending order");
		Comparator<Product> people4des = (t1, t2) -> Integer.compare(t2.getPeopleRatedFour(), t1.getPeopleRatedFour());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(people4des).forEach(ref9 -> System.out.println(ref9));

		System.out.println("people rated in asscending order");
		Comparator<Product> people3as = (t1, t2) -> Integer.compare(t1.getPeopleRatedThree(), t2.getPeopleRatedThree());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(people3as).forEach(ref8 -> System.out.println(ref8));

		System.out.println("people rated in descending order");
		Comparator<Product> people3des = (t1, t2) -> Integer.compare(t2.getPeopleRatedThree(),
				t1.getPeopleRatedThree());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(people3des).forEach(ref9 -> System.out.println(ref9));

		System.out.println("people rated in asscending order");
		Comparator<Product> people2as = (t1, t2) -> Integer.compare(t1.getPeopleRatedTwo(), t2.getPeopleRatedTwo());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(people2as).forEach(ref8 -> System.out.println(ref8));

		System.out.println("people rated in descending order");
		Comparator<Product> people2des = (t1, t2) -> Integer.compare(t2.getPeopleRatedTwo(), t1.getPeopleRatedTwo());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(people2des).forEach(ref9 -> System.out.println(ref9));

		System.out.println("people rated in asscending order");
		Comparator<Product> people1as = (t1, t2) -> Integer.compare(t1.getPeopleRatedOne(), t2.getPeopleRatedOne());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(people1as).forEach(ref8 -> System.out.println(ref8));

		System.out.println("people rated in descending order");
		Comparator<Product> people1des = (t1, t2) -> Integer.compare(t2.getPeopleRatedOne(), t1.getPeopleRatedOne());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(people1des).forEach(ref9 -> System.out.println(ref9));

		System.out.println("packer in ascnding order");
		Comparator<Product> packerasc = (t1, t2) -> t1.getPacker().compareTo(t2.getPacker());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(packerasc).forEach(ref9 -> System.out.println(ref9));

		System.out.println("packer in descnding order");
		Comparator<Product> packerdec = (t1, t2) -> t2.getPacker().compareTo(t1.getPacker());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(packerdec).forEach(ref9 -> System.out.println(ref9));

		System.out.println("item weight in asscending order");
		Comparator<Product> itemas = (t1, t2) -> Integer.compare(t1.getItemWeight(), t2.getItemWeight());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(itemas).forEach(ref8 -> System.out.println(ref8));

		System.out.println("item weight in descending order");
		Comparator<Product> itemdes = (t1, t2) -> Integer.compare(t2.getItemWeight(), t1.getItemWeight());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(itemdes).forEach(ref9 -> System.out.println(ref9));

		System.out.println("included in ascnding order");
		Comparator<Product> inclasc = (t1, t2) -> t1.getIncluded().compareTo(t2.getIncluded());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(inclasc).forEach(ref9 -> System.out.println(ref9));

		System.out.println("included in descnding order");
		Comparator<Product> incldec = (t1, t2) -> t2.getIncluded().compareTo(t1.getIncluded());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(incldec).forEach(ref9 -> System.out.println(ref9));

		System.out.println("generic name in ascnding order");
		Comparator<Product> genasc = (t1, t2) -> t1.getGenericName().compareTo(t2.getGenericName());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(genasc).forEach(ref9 -> System.out.println(ref9));

		System.out.println("generic name in descnding order");
		Comparator<Product> gendec = (t1, t2) -> t2.getGenericName().compareTo(t1.getGenericName());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(gendec).forEach(ref9 -> System.out.println(ref9));

		System.out.println("dateFirstAvailable in ascnding order");
		Comparator<Product> datasc = (t1, t2) -> t1.getDateFirstAvailable().compareTo(t2.getDateFirstAvailable());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(datasc).forEach(ref9 -> System.out.println(ref9));

		System.out.println("dateFirstAvailable in descnding order");
		Comparator<Product> datdec = (t1, t2) -> t2.getDateFirstAvailable().compareTo(t1.getDateFirstAvailable());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(datdec).forEach(ref9 -> System.out.println(ref9));

		System.out.println("asin in ascnding order");
		Comparator<Product> asinasc = (t1, t2) -> t1.getASIN().compareTo(t2.getASIN());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(asinasc).forEach(ref9 -> System.out.println(ref9));

		System.out.println("asin in descnding order");
		Comparator<Product> asindec = (t1, t2) -> t2.getASIN().compareTo(t1.getASIN());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(asindec).forEach(ref9 -> System.out.println(ref9));

		System.out.println("country  in ascnding order");
		Comparator<Product> couasc = (t1, t2) -> t1.getCountryOfOrigion().compareTo(t2.getCountryOfOrigion());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(asinasc).forEach(ref9 -> System.out.println(ref9));

		System.out.println("country in descnding  order");
		Comparator<Product> coudec = (t1, t2) -> t2.getCountryOfOrigion().compareTo(t1.getCountryOfOrigion());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(asindec).forEach(ref9 -> System.out.println(ref9));

		System.out.println("modelNo in asscending order");
		Comparator<Product> modas = (t1, t2) -> Integer.compare(t1.getModelNo(), t2.getModelNo());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(itemas).forEach(ref8 -> System.out.println(ref8));

		System.out.println("modelNo in descending order");
		Comparator<Product> moddes = (t1, t2) -> Integer.compare(t2.getModelNo(), t1.getModelNo());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(itemdes).forEach(ref9 -> System.out.println(ref9));

		System.out.println("damaged in asscending order");
		Comparator<Product> ref5 = (t1, t2) -> t1.getDamaged().compareTo(t2.getDamaged());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(itemdes).forEach(ref9 -> System.out.println(ref9));

		System.out.println("damage in des");
		Comparator<Product> ref5a = (t1, t2) -> t2.getDamaged().compareTo(t1.getDamaged());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(ref5a).forEach(ref9 -> System.out.println(ref9));

		System.out.println("serialNo in asscending order");
		Comparator<Product> seras = (t1, t2) -> Integer.compare(t1.getSerialNo(), t2.getSerialNo());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(seras).forEach(ref8 -> System.out.println(ref8));

		System.out.println("serialNo in descending order");
		Comparator<Product> serdes = (t1, t2) -> Integer.compare(t2.getModelNo(), t1.getModelNo());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(serdes).forEach(ref9 -> System.out.println(ref9));

		// comparision of two
		System.out.println("=============");
		Comparator<Product> twoproperty = (t1, t2) -> t1.getASIN().compareTo(t2.getCompany());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(twoproperty).forEach(D -> System.out.println(D));

		// comparision of three 
		System.out.println("=============");
		Comparator<Product> threeproperty = (t1, t2) -> t1.getASIN().compareTo(t2.getCompany());
		Stream.of(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10)
				.sorted(twoproperty.thenComparing(ref5)).forEach(D -> System.out.println(D));

	}

}
