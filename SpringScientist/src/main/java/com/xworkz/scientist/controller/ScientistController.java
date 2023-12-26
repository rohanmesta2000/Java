package com.xworkz.scientist.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.scientist.DTO.ScientistDTO;

@Component
@RequestMapping("/")

public class ScientistController {

	public ScientistController() {
		// TODO Auto-generated constructor stub
		System.out.println("created  ScientistController successfully ");
	}

	@PostMapping("/info")
	public String scientist(@Valid ScientistDTO dto, BindingResult errors, Model model) {
		System.out.println("ScientistDTO" + dto);
		System.out.println("Is ScientistDTO is invalid : " + errors.hasErrors());
		model.addAttribute("msg", "saved succesfully....");

		List<ObjectError> objectErrors = errors.getAllErrors();
		objectErrors.forEach(objectError -> System. err.println(objectError.getObjectName() + ":message" + objectError.getDefaultMessage()));
		model.addAttribute("dto", dto);
		model.addAttribute("errors", objectErrors);
		return "scientist";

	}

}
