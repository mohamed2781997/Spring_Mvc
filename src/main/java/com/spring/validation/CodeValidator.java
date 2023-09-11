package com.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CodeValidator implements ConstraintValidator<VertyCode, String> {
	
	
	private String mycode;
	
	
	//initailize code take code from verty code
	@Override
	  public void initialize(VertyCode code) {
		mycode=code.value(); 			 // take vlaue from vertycode and put him in mycode
		
		
	}
	
	//check code
	@Override
	public boolean isValid(String code, ConstraintValidatorContext arg1) {
		boolean res;
		
		if(code!=(null)) // IF code enter not equal null  check start with code tha i put or no (+02) 								
		{
			res=code.startsWith(mycode);
		}
		else {
			
		res=true;	
		}
		
		return res;
	}
	
	
	

	
	

}
