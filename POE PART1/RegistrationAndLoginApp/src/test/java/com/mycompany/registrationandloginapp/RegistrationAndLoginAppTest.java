/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.registrationandloginapp;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


/**
 *
 * @author seabe
 */
public class RegistrationAndLoginAppTest {
    
    public RegistrationAndLoginAppTest() {
    }

    
    @Test
    public void testCheckUsername() {
        RegistrationAndLoginApp testMethod = new RegistrationAndLoginApp();
        boolean expResult = true;
        boolean actual = testMethod.checkUsername("kyl_l");
        assertEquals(expResult, actual , "The username  contain an underscore and is no more than five characterslong.");
    }
    @Test
    public void testCheckIncorrectUsername(){
        RegistrationAndLoginApp testMethod = new RegistrationAndLoginApp();
        boolean expResult = false;
        boolean result = testMethod.checkUsername("kyle!!!!!!!");
        Object actual = null;
        assertEquals(expResult ,actual,"The username does not contain an underscore and is nomore than five characaters long.");
    }  
    
    @Test
    public void testCheckPasswordComplexity() {
        RegistrationAndLoginApp testMethod = new RegistrationAndLoginApp();
        boolean expResult = true;
        boolean result = testMethod.checkPasswordComplexity("Ch&&sec@ke99!");
        Object actual = null;
        assertEquals(expResult, actual,"The password meets the complexity requirements");
       
    }
    @Test
    public void testCheckIncorrectPasswordComplexity() {
        RegistrationAndLoginApp testMethod = new RegistrationAndLoginApp();
        boolean expResult = false;
        boolean result = testMethod.checkPasswordComplexity("password");
        Object actual = null;
        assertEquals(expResult, actual,"The password is not correctly formatted ,please ensure that the password contains at least eight characters , a capital letter,a number , and a special character.");
       
    }


    @Test
    public void testCheckCellPhone(){
        RegistrationAndLoginApp testMethod = new RegistrationAndLoginApp();
        boolean expResult = true;
        boolean result = testMethod.checkCellPhone("+27838968976");
        Object actual = null;
        assertEquals(expResult, actual,"Cell number successfully captured.");
        
    }
    @Test
     public void testCheckIncorrectCellPhone() {
        RegistrationAndLoginApp testMethod = new RegistrationAndLoginApp();
        boolean expResult = false;
        boolean result = testMethod.checkCellPhone("08966553");
        Object actual = null;
        assertEquals(expResult, actual,"Cell number is incorrectly formatted or does not contain an international code , please correct the number and try again.");
        
    }
    
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String username = "";
        String password = "";
        String phone = "";
        RegistrationAndLoginApp instance = new RegistrationAndLoginApp();
        String expResult = "";
        String result = instance.registerUser(username, password, phone);
        assertEquals(expResult, result);
        
    }
     @Test
    public void testIncorrectRegisterUser() {
        System.out.println("registerUser");
        String username = "";
        String password = "";
        String phone = "";
        RegistrationAndLoginApp instance = new RegistrationAndLoginApp();
        String expResult = "";
        String result = instance.registerUser(username, password, phone);
        assertEquals(expResult, result);
        
    }

 
  

   
        }
    

