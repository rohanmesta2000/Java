package com.xworkz.SpringWebApplication.Component;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@RequestMapping("/")
public class OnClick {
public OnClick() {
	System.out.println("created succesfully");
}
@RequestMapping(value="/click",method = RequestMethod.GET)
public String onClick(Model model) {
	System.out.println("onclick");
	model.addAttribute("email", "rohanmesta157@gmail.com");
	return "index.jsp";
}
}
