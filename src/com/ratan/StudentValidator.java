package com.ratan;

import java.text.SimpleDateFormat;
import java.util.Date;

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
		
		
		if(s.getRoll()<100){
		
			err.rejectValue("roll","roll.invalid");
			
		}
		if(s.getDob() == null){
			
			err.rejectValue("dob","","Date is mandatory");
		}
		
		
		
		
	}

}
