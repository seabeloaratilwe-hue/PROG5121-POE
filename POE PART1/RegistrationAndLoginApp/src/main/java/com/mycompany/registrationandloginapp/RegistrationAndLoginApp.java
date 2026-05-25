/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registrationandloginapp;

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
        
        
        
        Login myObject = new Login();
        String message = myObject.returnLoginStatus(loginUser,loginPass);
        System.out.println(myObject.returnLoginStatus(user, loginPass));
               System.out.println(message);
          int option;
          int numOfMessages;
          String messageLength;
          if(myObject.loginUser(loginUser, loginPass))
          {
         System.out.println("Welcome to QuickChat.");
         
          }
          else
          {
              System.out.println("Login failed.");
          }
          
           Scanner Myinput = new Scanner(System.in);
           System.out.println("Welcome to QuickChat");
        
        System.out.println("Choose one of the following features.");
        System.out.println("1. Send Message");
        System.out.println("2. Coming soon.");
        System.out.println("3. Quit");

        System.out.print("Choose option: ");
        option = Integer.parseInt(Myinput.nextLine());
            
        switch(option){
            case 1:
                System.out.print("How many messages would you like to send? ");
                numOfMessages = Integer.parseInt(Myinput.nextLine());
               int messageCount = 0;

               while(messageCount < numOfMessages) {

               System.out.print("Enter recipientCell number: ");
                       String recipientCell = Myinput.nextLine();

               System.out.print("Enter message: ");
                       String Message = Myinput.nextLine(); 


                if(messageCount >= 250){
                   int charactersLeft = message.length() - 250;

                   System.out.println(" Please enter a message of less than 250 characters.");
               }
               else
               {
                   System.out.println("Message sent successfully.");   
                   messageCount++;

               }
               }
             break;
                
            case 2:
                System.out.println("Coming soon") ;
                break;
                
                case 3:
                System.out.println(" Quit") ;
                break;
                default:
                System.out.println("Invalid option.");
                break;
        }
        
                
       
        
        
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

        
}
                        