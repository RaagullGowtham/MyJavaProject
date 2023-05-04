package com.fita.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class Mycontroller {
	@Value("${db.name}")
	String dbname; 
@GetMapping("/hello")
public String myApp() {
	return "Welcome to to JAVA"+ dbname;
}
}
