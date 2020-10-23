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
    //Checking the validity of email id
    @Test
    public void givenEmail_WhenValid_ReturnHappy()
    {
        UserValidator userValidator = new UserValidator();
        String result;
        result = userValidator.validateEmailId("ahemmedhussain1525@gmail.co.in");
        Assert.assertEquals("happy", result);
    }
    @Test
    public void givenEmail_WhenInValid_ReturnSad()
    {
        UserValidator userValidator = new UserValidator();
        String result;
        result = userValidator.validateEmailId("ahemmedhussain1525@gmail.coin");
        Assert.assertEquals("sad", result);
    }
    //Checking the validity of mobile number
    @Test
    public void givenMobileNumber_WhenValid_ReturnHappy()
    {
        UserValidator userValidator = new UserValidator();
        String result;
        result = userValidator.validateMobileNumber("91 7730851594");
        Assert.assertEquals("happy", result);
    }
    @Test
    public void givenMobileNumber_WhenInValid_ReturnSad()
    {
        UserValidator userValidator = new UserValidator();
        String result;
        result = userValidator.validateMobileNumber("917730851594");
        Assert.assertEquals("sad", result);
    }
    //Check the validity of password
    @Test
    public void givenPassword_WhenValid_ReturnHappy()
    {
        UserValidator userValidator = new UserValidator();
        String result;
        result = userValidator.validatePassword("Ahemmed1525@");
        Assert.assertEquals("happy", result);
    }
    @Test
    public void givenPassword_WhenInValid_ReturnSad()
    {
        UserValidator userValidator = new UserValidator();
        String result;
        result = userValidator.validatePassword("Lucky");
        Assert.assertEquals("sad", result);
    }
}

