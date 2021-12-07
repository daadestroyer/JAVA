package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/action")
	public String action(@RequestParam String sname, @RequestParam String sage, @RequestParam String scourse, Model model) {

		
		model.addAttribute("sname", sname);
		model.addAttribute("sage", sage);
		model.addAttribute("scourse", scourse);
		 
		
		return "action";
	}
}
