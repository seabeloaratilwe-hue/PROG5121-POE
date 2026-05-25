/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registrationandloginapp; 
import java.util.Scanner;
import java.util.Random;
import java.util.HashMap;
import java.io.FileWriter;
import java.io.IOException;

/*
 *
 * @author Oratile Seabelo
 */
public class sendingMessages {
    public String messageID;
    public static int numOfMessages;
    public String recipientCell;
    public int    messageLength;
    public String messageHash;
    public String message;
    public static int    totalMessages = 0;
    public int    option;
    
    public sendingMessages(String recipientCell , int messageLength , String message)
    {   this.recipientCell = recipientCell;
        this.messageLength = messageLength;  
        this.messageHash=createMessageHash();
        this.messageID=generateMessageID();
        this.message = message;
    }
    public sendingMessages(){}
    
    
    public String generateMessageID()
    {
        Random newNum = new Random();
        StringBuilder messageID = new StringBuilder();
        for(int i = 0 ; i<10 ; i++)
        {
            messageID.append(newNum.nextInt(10));
        }
            String ID = messageID.toString();
            return ID;
    }
    
    

    public boolean checkMessageID() {
        if(messageID.length()<= 10){
           
           System.out.println("Message ready to send.");
           return true;
        }
        else
        {
            System.out.println("Message exceeds 250 characters by x[Enter number here]; please reduce the size.");
            return false;
        }
    }
    
    public String checkRecipientCell() {

        if (recipientCell.matches("//+27[0-9]{9}")&& recipientCell.length() <= 10) {
      
            return( "Cell phone number successfully captured"); 
               
        } 
        else
        { 
            return("Cell phone number is incorrectly formatted or does not contain an international code.Please correct the number and try again.");
        }
    }        
    
    public String createMessageHash() {
    String[] words = messageID.split(" ");

    String firstWord = words[0].toUpperCase();

    String lastWord = words[words.length - 1].toUpperCase();

    String firstTwoDigits = messageID.substring(0, 2);

    String messageHash = (firstTwoDigits + ":" + totalMessages + ":" + firstWord + lastWord);
    
           return messageHash;
    }

  
    public String SentMesages()
    {
        Scanner input = new Scanner(System.in);
        String userMessage;
        System.out.println("Choose one of the following message option:");
        System.out.println("1. Send Message");
        System.out.println("2. Disregard Message");
        System.out.println("3. Store Message to send later");
        
  
        System.out.print("Enter option:");
        int option = input.nextInt();
        input.nextLine();
        
        if(option == 1)
        {
            System.out.println("Message successfully sent.");
        }
        else if (option == 2)
        {
            System.out.println("Press 0 to delete the message.");
          
        }
        else if (option == 3)
        {
            System.out.println("Message successfully stored.");
            
        }
       
        HashMap <String , String> messages = new HashMap<>();
        Random newNum = new Random();
        StringBuilder messageID = new StringBuilder();
        
        System.out.println("Send a message...");
        userMessage = input.nextLine();
        
        //Generate and randomize the message ID
        for(int i = 0; i<10; i++)
        {
            messageID.append(newNum.nextInt(10));
        }
        String ID = messageID.toString();
        //Associate meesage id with sent message
        messages.put(ID , userMessage);
        System.out.println("Messages successfully associated with their IDs");
        System.out.println("The following is the retrieved messages");
        System.out.println("Message ID: " +ID + "is a message:" + messages.get(ID));
        
        messages.remove(ID);
        System.out.println("Messages successfully associated with their IDs");
        System.out.println("The following is the retrieved messages");
        System.out.println("Message ID: " +ID + "is a message:" + messages.get(ID));
        
        return "Invalid option.";
    }


    public String printMessages() {
   
   
     return message;
    
}
    public static int returnTotalMessages() {
    
      return totalMessages;
    }

    public String storeMessageInJSON(){
    String jsonData = "{\n" +
            "  \"messageID\": \"" + messageID + "\",\n" +
            "  \"recipientCell\": \"" + recipientCell + "\",\n" +
            "  \"messageLength\": " + messageLength + ",\n" +
            "  \"messageHash\": \"" + messageHash + "\",\n" +
            "  \"message\": \"" + message + "\"\n" +
            "}";

    try {

        FileWriter writer = new FileWriter("messages.json");

        writer.write(jsonData);

        writer.close();

        return "Message stored successfully in JSON file.";

    } catch (IOException e) {

        return "Error storing message in JSON file.";
    }
    }
        
    
}
      
  
        
                
            
            
           
                
            
       
    
    

    