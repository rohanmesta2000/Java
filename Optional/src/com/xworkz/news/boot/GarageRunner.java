package com.xworkz.news.boot;

import java.util.Optional;

import com.xworkz.news.util.GarageUtil;

public class GarageRunner {


		public static void main(String[] args) {
			Optional<String> optional=GarageUtil.getName("Rohit", "Sharma");
			if(optional.isPresent()) {
				String ref= optional.get();
				System.out.println(ref);
				
				
			}
			else {
				System.out.println("optional is empty");
			}
		}

	}


