/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.registrationandloginapp;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Oratile Seabelo
 */
public class sendingMessagesTest {
    
    sendingMessages message = new sendingMessages();
   
    
    @Test
    public void testCheckMesageID() {
        System.out.println("Mesages");
        sendingMessages testMethod = new sendingMessages();
        boolean expResult =true;
        boolean result = testMethod.checkMessageID();
        assertEquals(expResult, result ,"Message ready to send");
       
    }
    
    @Test
     public void IncorrecttestCheckMesageID() {
        System.out.println("Message");
        MessageID testMethod = new MessageID();
        String expResult = "false";
        String result = testMethod.checkMesages("Auto generated");
        assertEquals(expResult, result , "Message exceeds 250 characters by X[enter number here]; please reduce the size.");
     }

    
    @Test
    public void testCheckRecipientCell() {
        System.out.println("RecipientCell");
        recipientCell testMethod= new recipientCell();
        String expResult = "true";
        String result = testMethod.checkRecipientCell(" +27718693002");
        assertEquals(expResult, result , "Cell phone number successfully captured.");
        
    }@Test
       public void IncorrectCheckRecipientCell() {
        System.out.println(" RecipientCell");
        recipientCell testMethod = new recipientCell();
        String expResult = "false";
        String result = testMethod.checkRecipientCell("0718693002");
        assertEquals(expResult, result ," Cell phone number is incorrectly formatted or does not contain an international code.Please correct the number and try again.");
       }
    

    @Test
    public void testCheckMessageHash() {
        System.out.println("MessageHash");
        messageHash testMethod = new messageHash();
        String expResult ="";
        String result = testMethod.checkMessageHash("Auto generated");
        assertEquals(expResult, result ,"");
      
    }
    
    @Test
     public void IncorrecttestCheckMessageHash() {
        System.out.println("MessageHash");
        messageHash testMethod = new messageHash();
        String expResult ="";
        String result = testMethod.checkMessageHash("Auto generated");
        assertEquals(expResult, result);
     }
    

    @Test
    public void testCheckMessage() {
        System.out.println("MessageID");
        Message testMethod = new Message();
        String expResult = "true";
        String result = testMethod.checkMessage("Hi Mike, can you join us for dinner tonight?");
        assertEquals(expResult, result , "");
    }
    
    @Test
    public void IncorrectChecktestCheckMessage() {
        System.out.println("storeMessage");
        Message testMethod = new Message();
        String expResult = "false";
        String result = testMethod.checkMessageID();
        assertEquals(expResult, result ,"");
    }
    
    @Test
     public void testMessageSent() {
        System.out.println("storeMessage");
        MessageSent testMethod = new MessageSent();
        String expResult = "";
        String result = testMethod.MessageSent("Auto generated");
        assertEquals(expResult, result ,"");
    }
     
     @Test
      public void IncorrecttestMessageSent() {
        System.out.println("storeMessage");
        sendingMessages instance = new sendingMessages();
        String expResult = "";
        String result = instance.storeMessage("Auto generated");
        assertEquals(expResult, result);
      }
     
     
    
    
    
}
