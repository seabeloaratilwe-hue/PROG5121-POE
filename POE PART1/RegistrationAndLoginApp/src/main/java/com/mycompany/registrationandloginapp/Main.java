/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registrationandloginapp;
import java.util.Scanner;

/**
 *
 * @author Oratile Seabelo
 */
public class Main {
    public static void main(String[]args){
       int numOfMessages = 0;
       String mesageSent;
       Scanner myInput = new Scanner(System.in);
       System.out.println("Welcome to QuickChat.");
         
       // Ask the user how many messanges they wish to enter
       System.out.println("How many messages the user wishes to enter");
       numOfMessages = myInput.nextInt();
       
      while(true){
       System.out.println("Choose one of the following features");
       String Option1 = "Send Message";
       String Option2 = "Coming Soon";
       String Option3 = "Quit";
       System.out.println("1)"+Option1);
       System.out.println("2)"+Option2);
       System.out.println("3)"+Option3);
       //option =Integer.parseInt(myInput.nextLine());
      }
      
    }
    
}
