package com.rvce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rvce.model.ProductModel;

import jakarta.validation.Valid;

@Controller
public class MainController {

	@RequestMapping("/")
	public String index() {

		return "index";
	}

	@RequestMapping("/proceedForm")
	public String proceedForm(@ModelAttribute("productModel") ProductModel productModel, Model model) {
		if (productModel.getPid().equals("") || productModel.getPname().equals("")
				|| productModel.getPprice().equals("") || productModel.getPdesc().equals("")) {
			model.addAttribute("message", "please fill all the fields");
			return "index";
		} else if (productModel.getPid().length() < 3) {
			model.addAttribute("message", "product id length can't be less than 3");
			return "index";
		} else if (productModel.getPprice().equals("0")) {
			model.addAttribute("message", "product price can't be zero");
			return "index";
		} else if (Integer.parseInt(productModel.getPprice()) < 0) {
			model.addAttribute("message", "product price can't be less zero");
			return "index";
		} else if (productModel.getPdesc().length() < 15) {
			model.addAttribute("message", "description of the product must be greater than 15 characters");
			return "index";
		}
		model.addAttribute("pid", productModel.getPid());
		model.addAttribute("pname", productModel.getPname());
		model.addAttribute("pprice", productModel.getPprice());
		model.addAttribute("pdesc", productModel.getPdesc());
		return "display";

	}
}
