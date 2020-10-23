package com.bridgelabz.userregistraion;

import org.junit.Assert;
import org.junit.Test;
public class UserRegistration {
	
	  //Checking the validity of first name
    @Test
    public void givenfirstName_WhenProper_ReturnHappy() {
    	UserValidator userValidator =new UserValidator();
        String result;
        result = userValidator.validateFirstName("Ahemmed");
        Assert.assertEquals("happy", result);
    }
    @Test
    public void givenfirstName_WhenImpProper_ReturnSad() {
        UserValidator userValidator = new UserValidator();
        String result;
        result = userValidator.validateFirstName("Lu");
        Assert.assertEquals("sad", result);
    }
 
    //Checking the validity of second name
    @Test
    public void givenLastName_WhenProper_ReturnHappy()
    {
        UserValidator userValidator = new UserValidator();
       String result = userValidator.validLastName("Lucky");
       Assert.assertEquals("happy", result);
    }
    @Test
    public void givenLastName_WhenImProper_ReturnSad()
    {
        UserValidator userValidator = new UserValidator();
       String result = userValidator.validLastName("An");
       Assert.assertEquals("sad", result);
    }
}

