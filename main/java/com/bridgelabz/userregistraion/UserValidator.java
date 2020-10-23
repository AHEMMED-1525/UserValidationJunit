package com.bridgelabz.userregistraion;

import java.util.regex.Pattern;

public class UserValidator {
	public static final String NAME_PATTERN =  "^[A-Z]+[a-zA-Z]{2,}$";

//First name Validation
    public String validateFirstName(String fname)
    {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        if (pattern.matcher(fname).matches())
        	return "happy";
        return "sad";
    }

}
