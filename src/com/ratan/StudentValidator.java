package com.ratan;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
@Component
public class StudentValidator implements Validator {

	@Override
	public boolean supports(Class c) {
		// TODO Auto-generated method stub
		return StudentBean.class.isAssignableFrom(c);
	}

	@Override
	public void validate(Object obj, Errors err) {
		
		StudentBean s=(StudentBean)obj;
		
		System.out.println("inside validate method...");
		if(s.getRoll()<100){
			System.out.println("inside if cond..");	
			err.reject("roll","roll number should be greater than 100");
			
		}
		
		
	}

}
