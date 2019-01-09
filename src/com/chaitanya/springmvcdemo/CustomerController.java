package com.chaitanya.springmvcdemo;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	//add the initbinder ....to convert trim input strings
	// remove leading and trailling white spaces
	//reslove issue for our validation
	@InitBinder()
	public void initBinder(WebDataBinder databinder) {
		
		StringTrimmerEditor stringtrimmereditor = new StringTrimmerEditor(true);
		databinder.registerCustomEditor(String.class , stringtrimmereditor);
		
	}
	
	
	@RequestMapping("/showForm")
	public String showForm(Model themodel) {
		
		themodel.addAttribute("customer", new Customer());
		
		return "customer-form";
		
	}
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer thecustomer, BindingResult theResult ) {
		
		System.out.println("Last Name: "+ thecustomer.getLastName() +" ");
		
		//System.out.println("Binding Result: "+ theResult);
		
		//System.out.println("\n\n\n\n");
		
		if(theResult.hasErrors()) {
			
			return "customer-form";
		}
		else {
		
		return "customer-confirmation";
		}
		
	}
	


}
