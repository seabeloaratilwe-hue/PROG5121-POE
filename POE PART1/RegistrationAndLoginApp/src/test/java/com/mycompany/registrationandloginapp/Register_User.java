/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registrationandloginapp;

/**
 *
 * @author seabe
 */
public class Register_User {

    
    public static void main(String[] args) {
     
        LoginUser login = new LoginUser();
        

        System.out.println("=== REGISTRATION ===");
        login.registerNames();
        login.registerUsername();
        login.registerPassword();
        login.registerPhoneNumber();

        System.out.println(login.registerUser());

        System.out.println("\n=== LOGIN ===");
        boolean loginSuccess = login.loginUser();
        System.out.println(login.returnLoginStatus(loginSuccess));
    }
}


