package com.bridgelabz.userregistraion;

import org.junit.Assert;
import org.junit.Test;
public class UserRegistration {
	
	  //validate First name
    @Test
    public void givenfirstName_WhenProper_ReturnHappy() throws Exception {
        UserValidator userValidator = new UserValidator();
        String result;
        result = userValidator.validateFirstName("Ahemmed");
        Assert.assertEquals("happy", result);
    }
    @Test
    public void givenfirstName_WhenImpProper_ReturnSad() throws Exception {
       try {
    	   UserValidator userValidator = new UserValidator();
    	   userValidator.validateFirstName("lU");
       }catch(userRegistartionException e) {
        Assert.assertEquals("Please enter correct first name", e.getMessage() );
       }
    }
    //  validate  Last name
    @Test
    public void givenLastName_WhenProper_ReturnHappy() throws Exception
    {
        UserValidator userValidator = new UserValidator();
       String result = userValidator.validLastName("Lucky");
       Assert.assertEquals("happy", result);
    }
    @Test
    public void givenLastName_WhenImProper_ReturnSad() throws Exception
    {
    	 try {
      	   UserValidator userValidator = new UserValidator();
      	   userValidator.validLastName("ah");
         }catch(userRegistartionException e) {
          Assert.assertEquals("Please enter correct second name", e.getMessage() );
         }
    }
    //validate Email id
    @Test
    public void givenEmail_WhenValid_ReturnHappy() throws Exception
    {
        UserValidator userValidator = new UserValidator();
        String result;
        result = userValidator.validateEmailId("ahemmedhussain1525@gmail.co.in");
        Assert.assertEquals("happy", result);
    }
    @Test
    public void givenEmail_WhenInValid_ReturnSad() throws Exception
    {
    	 try {
      	   UserValidator userValidator = new UserValidator();
      	   userValidator.validateEmailId("ahemmed");
         }catch(userRegistartionException e) {
          Assert.assertEquals("Please enter correct email", e.getMessage() );
         }
    }
    //validate mobile number
    @Test
    public void givenMobileNumber_WhenValid_ReturnHappy() throws Exception 
    {
        UserValidator userValidator = new UserValidator();
        String result;
        result = userValidator.validateMobileNumber("91 7730851594");
        Assert.assertEquals("happy", result);
    }
    @Test
    public void givenMobileNumber_WhenInValid_ReturnSad() throws Exception
    {
    	 try {
      	   UserValidator userValidator = new UserValidator();
      	   userValidator.validateMobileNumber("829703");
         }catch(userRegistartionException e) {
          Assert.assertEquals("Please enter correct mobile number", e.getMessage() );
         }
    }
    //validate password
    @Test
    public void givenPassword_WhenValid_ReturnHappy() throws Exception
    {
        UserValidator userValidator = new UserValidator();
        String result;
        result = userValidator.validatePassword("Ahemmed#1525");
        Assert.assertEquals("happy", result);
    }
    @Test
    public void givenPassword_WhenInValid_ReturnSad() throws Exception
    {
    	 try {
      	   UserValidator userValidator = new UserValidator();
      	   userValidator.validatePassword("ahemed");
         }catch(userRegistartionException e) {
          Assert.assertEquals("Please enter correct password", e.getMessage() );
         }
    }
    
}

