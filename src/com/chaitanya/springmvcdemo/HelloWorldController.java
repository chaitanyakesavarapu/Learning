package com.chaitanya.springmvcdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	//need a controller method tp show the initial Html form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
		
	}	
	//need a controller method to process the form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
		
	}
	//new a controller method to read form data and 
	// add data to the model
	@RequestMapping("/processFormVersion2")
	public String loadData(HttpServletRequest request, Model model) {
		
		//read the request parameter from the  html form
		
		String theName = request.getParameter("studentName");
		
		//convert the data into Captial letters
		theName = theName.toUpperCase();
		
		//create a message
		String result = "Welcome "+ theName;
		
		// add the data to the model
		model.addAttribute("message", result);
		
		return "helloworld";
		
	}
	
	// using at requestparam to read the data for you and associate with variable.
	@RequestMapping("/processFormVersion3")
	public String loadDataAutomatically(@RequestParam("studentName") String theName, Model model) {
		
		//read the request parameter from the  html form
		
		//String theName = request.getParameter("studentName");
		
		//convert the data into Captial letters
		theName = theName.toUpperCase();
		
		//create a message
		String result = "Welcome to the Spring Project "+ theName;
		
		// add the data to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	
}
}
