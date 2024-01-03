package com.xworkz.spng.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class SuccessController {
public SuccessController() {
	// TODO Auto-generated constructor stub
	System.out.println("created successcontroller Successfully");
}
@PostMapping("/inf")
public String succed() {
	System.out.println("created succed");
	return "success";
}
}
