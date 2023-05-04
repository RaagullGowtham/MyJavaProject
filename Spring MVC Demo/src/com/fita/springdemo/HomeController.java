package com.fita.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/myhome") // localhost:8080/myhome/home
public class HomeController {

	@RequestMapping("/home")
	public String homePage() {
		return "home-page";
	}

//	@RequestMapping("/getForm")
//	public String formPage() {
//		return "myform";
//	}

//	@RequestMapping("/processForm")
//	public String formProcess(@RequestParam("username") String uname, Model model) {
//
//		uname = uname.toUpperCase();
//		model.addAttribute("myuser", uname);
//		return "myformdata";
//	}

//	@RequestMapping("/processForm2")
//	public String formProcess2(User user, Model model) {
//
//		String result = user.getFirstName() + " " + user.getLastName();
//		model.addAttribute("myuser", result.toUpperCase());
//		return "myformdata";
//	}

	@RequestMapping("/getForm")
	public String formPage(Model theModel) {
		User user = new User();
		theModel.addAttribute("user", user);
		return "myform";
	}

//
	@RequestMapping("/processForm2")
	public String formProcess2(@ModelAttribute("user") User user, Model model) {

		return "myformdata";
	}

}
