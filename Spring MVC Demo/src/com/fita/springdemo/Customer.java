package com.fita.springdemo;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {
	@NotNull()
	@Size(min = 1, message = "firstname must")
	private String firstName;
	@NotNull()
	@Size(min = 1, message = "lastname must")
	private String lastName;
	@NotNull()
	@Size(min = 1, message = "email must")
	@Email(message = "incorrect email")
	private String email;
//	@Min(value = 18)
//	private int age;
	private String country;
	@Pattern(regexp = "[A-Za-z0-9]{6,10}")
	private String password;
	@Pattern(regexp = "[6-9][0-9]{9}")
	private String phoneNumber;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
