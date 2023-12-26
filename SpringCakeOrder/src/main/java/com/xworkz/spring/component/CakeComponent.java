package com.xworkz.spring.component;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.spring.dto.CakeDTO;

@Component
@RequestMapping("/")
public class CakeComponent {

	public CakeComponent() {
		System.out.println("CakeComponent created successfully");
	}

	@PostMapping("/info")
	public String tickets(@Valid CakeDTO dto, BindingResult errors, Model model) {
		System.out.println("CakeDTO" + dto);
		System.out.println("Is Cake dto is invalid : " + errors.hasErrors());
		model.addAttribute("msg", "saved succesfully....");
		
		List<ObjectError> objectErrors = errors.getAllErrors();
		objectErrors.forEach(objectError -> System.err
				.println(objectError.getObjectName() + ":message" + objectError.getDefaultMessage()));
		model.addAttribute("dto",dto);
		model.addAttribute("errors", objectErrors);
		return "customer";

	}
}
