/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

//package com.mycompany.registrationandloginapp;

import java.util.Scanner;

/**
 *
 * @author seabe
 */
public class RegistrationAndLoginApp {

    private String username;
    private String password;
    private String firstName;
    private String lastName;
    

    public static void main(String[] args) 
    {
        RegistrationAndLoginApp app = new RegistrationAndLoginApp();
        Scanner myInput = new Scanner(System.in);
        boolean correctUsername=false;
        boolean correctPassword=false;
        boolean correctCellphoneNumber=false;


        System.out.println("--- Registration ---");
        
        System.out.print("Enter firstName :");
        app.firstName = myInput.nextLine();  
        
        
        System.out.print("Enter lastName :");
        app.lastName = myInput.nextLine();
      
        
        String user;
        do 
        {
            System.out.print("Enter Username: ");
            user = myInput.nextLine();
        } 
        while (!app.checkUsername(user));        
        
        
        String pass;
        do 
        {
            System.out.print("Enter Password: ");
            pass = myInput.nextLine();
        } 
        while (!app.checkPasswordComplexity(pass));        
          
        
        String phone;
        do 
        {
            System.out.print("Enter Phone: ");
            phone = myInput.nextLine();
        } 
        while (!app.checkCellPhone(phone));        

        
        String result = app.registerUser(user, pass, phone);
        System.out.println(result);  
        
        
        System.out.println("--- Login ---");
        
            System.out.print("Enter Username :");
            String loginUser = myInput.nextLine();  
            
        
            System.out.print("Enter Password :");
            String loginPass = myInput.nextLine();
        
        System.out.println(app.returnLoginStatus(user, loginPass));
    }

    public boolean checkUsername(String username) {
        if (username.contains("_") && username.length() <= 5) 
        {
            System.out.println("Username successfully captured.");
            return true;
        }
        else
        {
            System.out.println("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters long in length.");
            return false;
        }        
    }

    public boolean checkPasswordComplexity(String password) {
        boolean isNumber = false;
        boolean isCapital = false;
        boolean isSpecial = false;

        if (password.length() < 8) return false;

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) isNumber = true;
            else if (Character.isUpperCase(c)) isCapital = true;
            else if (!Character.isLetterOrDigit(c)) isSpecial = true; 
        } 
        if (password.length()>= 8&& isNumber && isCapital && isSpecial)
        {
            System.out.println("Password successfully captured.");
        }
         else
        {
            System.out.println("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a letter , and a special character.");
        }
        return isNumber && isCapital && isSpecial;
    }
    
    public boolean checkCellPhone(String cellPhone) {
        String regex = "\\+27[0-9]{9}";
    
        if (cellPhone.matches(regex)) 
        {
            System.out.println("Cellphone successfully captured.");
            return true;
        } 
        else 
        {
            System.out.println("Cellphone is incorrectly formatted or does not contain an international code; please correct the number and try again.");
        return false;
        }
    }

   
    
    public String registerUser(String username, String password, String phone) {
        if (!checkUsername(username)) {
            return "Username is not correctly formatted.";
        }
        if (!checkPasswordComplexity(password)) {
            return "Password does not meet complexity requirements.";
        }
        if (!checkCellPhone(phone)) {
            return "Cell Phone Number is incorrectly formatted.";
        }

        this.username = username;
        this.password = password;
        return "User registered successfully.";
    }

    public boolean loginUser(String inputUsername, String inputPassword) {
        return inputUsername.equals(this.username) && inputPassword.equals(this.password);
    }

    public String returnLoginStatus(String username, String password) {
        if (loginUser(username, password)) {
  
            this.firstName = firstName;
            this.lastName = lastName;
            return "Welcome " + firstName + " " + lastName;
            
        } else {
            return "Username or password incorrect.";
        }
    }
    
}
                        