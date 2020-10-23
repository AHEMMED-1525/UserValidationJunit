package com.bridgelabz.userregistraion;

import java.util.regex.Pattern;

public class UserValidator {
	public static final String NAME_PATTERN =  "^[A-Z]+[a-zA-Z]{2,}$";
    public static final String EMAIL_ADDRESS_PATTERN = "^[A-Za-z0-9]+([-\\\\.\\\\+\\\\_][0-9A-Za-z]+)*[@][A-Za-z0-9]+.[a-zA-Z]{2,4}([\\\\.\\\\,][a-z]{2,3})?$";
    

//First name Validation
    public String validateFirstName(String fname)
    {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        if (pattern.matcher(fname).matches())
        	return "happy";
        return "sad";
    }
  //Last name Validation
    public String validLastName(String lname)
    {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        if (pattern.matcher(lname).matches())
        	return "happy";
        return "sad";
    }
 // Email validation
    public String validateEmailId(String email)
    {
        Pattern pattern = Pattern.compile(EMAIL_ADDRESS_PATTERN);
        if (pattern.matcher(email).matches())
        	return "happy";
        return "sad";
    }

}
