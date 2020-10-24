package com.bridgelabz.userregistraion;

import org.junit.Assert;
import org.junit.Test;
public class UserRegistration {
	
	  //Checking the validity of first name
    @Test
    public void givenfirstName_WhenProper_ReturnHappy() throws Exception {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateFirstName("Ahemmed");
        Assert.assertEquals("happy", result);
    }
    @Test
    public void givenfirstName_WhenImpProper_ReturnSad() throws Exception {
       try {
    	   UserValidator userValidator = new UserValidator();
    	   userValidator.validateFirstName("Aa");
       }catch(userRegistartionException e) {
        Assert.assertEquals("Please enter correct first name", e.getMessage() );
       }
    }
    //Checking the validity of last name
    @Test
    public void givenLastName_WhenProper_ReturnHappy() throws Exception
    {
        UserValidator userValidator = new UserValidator();
       boolean result = userValidator.validLastName("Lucky");
       Assert.assertEquals("happy", result);
    }
    @Test
    public void givenLastName_WhenImProper_ReturnSad() throws Exception
    {
    	 try {
      	   UserValidator userValidator = new UserValidator();
      	   userValidator.validLastName("lo");
         }catch(userRegistartionException e) {
          Assert.assertEquals("Please enter correct second name", e.getMessage() );
         }
    }
    //Checking the validity of email id
    @Test
    public void givenEmail_WhenValid_ReturnHappy() throws Exception
    {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateEmailId("ahemmedhussain1525@gmail.com");
        Assert.assertEquals("happy", result);
    }
    @Test
    public void givenEmail_WhenInValid_ReturnSad() throws Exception
    {
    	 try {
      	   UserValidator userValidator = new UserValidator();
      	   userValidator.validateEmailId("kiloe");
         }catch(userRegistartionException e) {
          Assert.assertEquals("Please enter correct email", e.getMessage() );
         }
    }
    //Checking the validity of mobile number
    @Test
    public void givenMobileNumber_WhenValid_ReturnHappy() throws Exception 
    {
        UserValidator userValidator = new UserValidator();
        boolean result= userValidator.validateMobileNumber("91 9745945143");
        Assert.assertEquals("happy", result);
    }
    @Test
    public void givenMobileNumber_WhenInValid_ReturnSad() throws Exception
    {
    	 try {
      	   UserValidator userValidator = new UserValidator();
      	   userValidator.validateMobileNumber("9869532");
         }catch(userRegistartionException e) {
          Assert.assertEquals("Please enter correct mobile number", e.getMessage() );
         }
    }
    //Check the validity of password
    @Test
    public void givenPassword_WhenValid_ReturnHappy() throws Exception
    {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("Ahemed@1525");
        Assert.assertEquals("happy", result);
    }
    @Test
    public void givenPassword_WhenInValid_ReturnSad() throws Exception
    {
    	 try {
      	   UserValidator userValidator = new UserValidator();
      	   userValidator.validatePassword("Ansn");
         }catch(userRegistartionException e) {
          Assert.assertEquals("Please enter correct password", e.getMessage() );
         }
    }
}

