package com.fita.springdemo;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@RequestMapping("/getForm")
	public String formPage(Model theModel) {
		Customer customer = new Customer();
		theModel.addAttribute("customer", customer);
		return "customerform";
	}

	@RequestMapping("/process")
	public String formProcess2(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult) {
		if (bindingResult.hasErrors())
			return "customerform";
		else
			return "customer-confirmation";
	}

}
