package com.fita.springdemo;

import java.util.LinkedHashMap;

public class User {

	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryOptions;
	private String favLang;
	private String os[];

	public String getFavLang() {
		return favLang;
	}

	public void setFavLang(String favLang) {
		this.favLang = favLang;
	}

	public String[] getOs() {
		return os;
	}

	public void setOs(String[] os) {
		this.os = os;
	}

	public User() {
		countryOptions = new LinkedHashMap<String, String>();
		countryOptions.put("IN", "India");
		countryOptions.put("FR", "FRANCE");
		countryOptions.put("DE", "Germany");
		countryOptions.put("UK", "England");
		countryOptions.put("USA", "United States");
		countryOptions.put("UAE", "Dubai");

	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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
}
