package com.xworkz.spring.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.spring.dto.EngineDTO;
import com.xworkz.spring.service.EngineService;

@Controller
@RequestMapping("/")
public class EngineController {

	@Autowired
	private EngineService engineServive;

	public EngineController() {
		// TODO Auto-generated constructor stub
		System.out.println("created  EngineController successfully ");
	}

	@PostMapping("/info")
	public String save(@Valid EngineDTO dto, BindingResult errors, Model model) {

		System.out.println("EngineDTO" + dto);
		System.out.println("Is EngineDTO is invalid : " + errors.hasErrors());
		model.addAttribute("msg", "saved succesfully....");

		if (errors.hasErrors()) {
			List<ObjectError> objectErrors = errors.getAllErrors();
			objectErrors.forEach(objectError -> System.err.println(objectError.getObjectName() + ":message" + objectError.getDefaultMessage()));
			model.addAttribute("dto", dto);
			model.addAttribute("errors", objectErrors);
			return "engine";

		} else {
			boolean saved = this.engineServive.validateAndSave(dto);
			if (saved) {
				System.out.println(dto);
				model.addAttribute("msg", "engine data saved successfully");

			} else {
				model.addAttribute("msg", "engine data not saved successfully");
			}

		return "success";
		}
	}

}
