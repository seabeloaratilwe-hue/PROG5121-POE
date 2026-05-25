/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registrationandloginapp;

/**
 *
 * @author Oratile Seabelo
 */
public class Login 
{
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    
    public boolean loginUser(String inputUsername, String inputPassword) 
    {
        return inputUsername.equals(this.username) && inputPassword.equals(this.password);
    }

    public String returnLoginStatus(String username, String password) 
    {
        if (loginUser(username, password)) {
  
            this.firstName = firstName;
            this.lastName = lastName;
            return "Welcome " + firstName + " " + lastName;
        
        } else {
            return "Username or password incorrect.";
        }    
    }
}
