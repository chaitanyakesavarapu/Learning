package com.chaitanya.springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model themodel) {
		
		// create a new student object
		Student theStudent = new Student();
		
		// add that student object to the model 
		themodel.addAttribute("student", theStudent);
		
		return "student-form";
		
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		
		//log the input data
		System.out.println("thestudent: "+ theStudent.getFirstName() + " "+ theStudent.getLastName());
		
		return "student-confirmation";
		
	}

}
