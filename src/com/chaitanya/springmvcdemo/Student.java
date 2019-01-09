package com.chaitanya.springmvcdemo;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	
	private  LinkedHashMap<String, String> countryoptions;
	
	private String favoriteLanguage;
	private HashMap<String, String> languageoptions;
	private String[] operatingSystems;
	
	public Student() {
		//populate the countryoptions using country ISO codes
		
		countryoptions = new LinkedHashMap<String, String>();
		countryoptions.put("USA", "America");
		countryoptions.put("BR", "Brazil");
		countryoptions.put("IND", "India");
		countryoptions.put("DEN", "Denmark");
		countryoptions.put("EPT", "Egypt");
		countryoptions.put("FIN", "Finland");
		languageoptions = new HashMap<String, String>();
		languageoptions.put("Java", "JAVA");
		languageoptions.put("C#", "C#");
		languageoptions.put("ruby", "ruby");
	}
	
	

	



	public String[] getOperatingSystems() {
		return operatingSystems;
	}







	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}







	public HashMap<String, String> getLanguageoptions() {
		return languageoptions;
	}


	


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryoptions() {
		return countryoptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	
	
}
