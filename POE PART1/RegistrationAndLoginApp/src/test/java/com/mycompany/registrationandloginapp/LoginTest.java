/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.registrationandloginapp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Oratile Seabelo
 */
public class LoginTest {
    
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String inputUsername = "";
        String inputPassword = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.loginUser(inputUsername, inputPassword);
        assertEquals(expResult, result);
        
    }
      @Test
    public void testIncorrectLoginUser() {
        System.out.println("loginUser");
        String inputUsername = "";
        String inputPassword = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.loginUser(inputUsername, inputPassword);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        String username = "";
        String password = "";
        Login instance = new Login();
        String expResult = "";
        String result = instance.returnLoginStatus(username, password);
        assertEquals(expResult, result);
       
    }
     @Test
    public void testIncorrectReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        String username = "";
        String password = "";
        Login instance = new Login();
        String expResult = "";
        String result = instance.returnLoginStatus(username, password);
        assertEquals(expResult, result);
        
    }


    
}
    

