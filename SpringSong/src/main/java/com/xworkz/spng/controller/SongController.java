package com.xworkz.spng.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.spng.dto.SongDTO;
import com.xworkz.spng.service.SongService;

@Controller
@RequestMapping("/")

public class SongController {
	@Autowired
	private SongService songService;

	public SongController() {
		// TODO Auto-generated constructor stub
		System.out.println("created  SongController successfully ");
	}

	@PostMapping("/info")
	public String save(@Valid SongDTO dto, BindingResult errors, Model model) {

		System.out.println("SongDTO" + dto);
		System.out.println("Is SongDTO is invalid : " + errors.hasErrors());
		model.addAttribute("msg", "saved succesfully....");

		if (errors.hasErrors()) {
			List<ObjectError> objectErrors = errors.getAllErrors();
			objectErrors.forEach(objectError -> System.err
					.println(objectError.getObjectName() + ":message" + objectError.getDefaultMessage()));
			model.addAttribute("dto", dto);
			model.addAttribute("errors", objectErrors);
			return "song";

		} else {
			boolean saved = this.songService.validateAndSave(dto);
			if (saved) {
				System.out.println(dto);
				model.addAttribute("msg", "data saved successfully");

			} else {
				model.addAttribute("msg", "data not saved successfully");
			}

		}

		return "success";

	}

}