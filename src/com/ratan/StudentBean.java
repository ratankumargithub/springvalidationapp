package com.ratan;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class StudentBean implements Serializable{

	
	private int roll;
	
	@Size(min=4,message="the size must be 4 charecter")
	private String name;
	private int marks;
	
	@NotEmpty(message="Check box is mandaotry...")
	private String[] courses;
	
	@AssertTrue(message="must accept the terms and condition")
	private boolean terms;
	
	@NotBlank(message= "must select gender..")
	private String gender;
	
	/**
	 * 
	 */
	@NotBlank(message = "must select the city")
	private String city;
	
	@NotNull
	private Date dob;
	
	
	public String getCity() {
		return city;
	}


	
	public Date getDob() {
		return dob;
	}



	public void setDob(Date dob) {
		this.dob = dob;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String[] getCourses() {
		return courses;
	}



	public void setCourses(String[] courses) {
		this.courses = courses;
	}



	public StudentBean() {
		System.out.println("insdie");
	}
	
	
	
	public boolean isTerms() {
		return terms;
	}



	public void setTerms(boolean terms) {
		this.terms = terms;
	}



	public StudentBean(int roll, String name, int marks,String[] courses,boolean terms,String gender,String city,Date dob) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.courses=courses;
		this.terms=terms;
		this.gender=gender;
		this.city=city;
		this.dob=dob;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	
	
}
