package com.ratan;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class RollNumberValidator implements ConstraintValidator<RollValid, Integer>{

	@Override
	public boolean isValid(Integer i, ConstraintValidatorContext ctx) {
		
		if(i<100)
			return false;
		
			else
		return true;
	}

	
	
}
