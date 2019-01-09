package com.chaitanya.springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Step1: Create Controller Class

@Controller
public class HomeController {
	//Step3: Add request mapping to controller method
	
	@RequestMapping("/")
	//Step2: Define  COntroller Method
	
	public String showPage() {
		//Return view name
		
		return "main-menu";
		
	}

}
