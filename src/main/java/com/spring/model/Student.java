package com.spring.model;
import java.util.HashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.spring.validation.VertyCode;
public class Student {
	@NotNull(message = "required")
	@Size(min = 1,message = "required")
	private String fName;
	
	@NotNull(message = "required")
	@Size(min = 1,message = "required")
	private String lname;
	
	@NotNull(message = "required")
	@Min(value = 20,message = "must be greater than or equal 20 ")
	@Max(value = 50,message = "must be less than or equal 50")
	private String age;
	
	private String countries;
	
	
	@NotNull(message = "required")
	private Integer code;
	
	
	@NotNull(message = "required")
	@Pattern(regexp ="^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$",message = "Invalid Email")
	private String email;
	
	private String language;
	
	private String[] players;
	
	@NotNull(message = "required")	
	@VertyCode
	private String indexcountry;
	
	
	
	private HashMap<String,String> countryoption;
	
	
	public Student() {
		countryoption=new HashMap<>();
		countryoption.put("Egypt", "Eg");
		countryoption.put("Brazil", "Bra");
		countryoption.put("Emirate", "Emar");
		countryoption.put("Saudi Arabia", "Ksa");
		
	
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getCountries() {
		return countries;
	}
	public void setCountries(String countries) {
		this.countries = countries;
	}
	public HashMap<String, String> getCountryoption() {
		return countryoption;
	}
	public void setCountryoption(HashMap<String, String> countryoption) {
		this.countryoption = countryoption;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String[] getPlayers() {
		return players;
	}
	public void setPlayers(String[] players) {
		this.players = players;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getIndexcountry() {
		return indexcountry;
	}
	public void setIndexcountry(String indexcountry) {
		this.indexcountry = indexcountry;
	}
	
	
	
	
	
	
	
	
	
}
