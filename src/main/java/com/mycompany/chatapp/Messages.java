/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatapp;

/**
 *
 * @author rethe
 */
import java.util.Scanner;
import java.util.Random;
public class Messages {

    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    int choice;
    String message;
    String firstWord;
    String secondWord;
    

   Registration reg;
    Login login;

        public Messages(Registration reg, Login login) {
            this.reg = reg;
            this.login = login;
}
    public void userMenu() {
        do {
            System.out.println("\n====== WELCOME TO QUICKCHAT======");
            System.out.println("1.Send messages.");
            System.out.println("2. Show recently showed messages");
            System.out.println("3. Quit");

            System.out.print("Enter your menu option: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1 ->sendMesasage() ;
                case 2 -> input.close();
                case 3 -> System.out.println("Goodbye.");
                default -> System.out.println("Invalid choice.");
            }

        } while (choice != 3);

        input.close();
    }
   long messageID = rand.nextLong(9999999999L);
   
    boolean checkMessageID(){
        if (messageID<10000000000L){
            System.out.println("Message ID generated: "+ messageID);
            return true;
  } else{
            return false;
        }
        
    }
    String receipentCell;

        void getRecipientcell(){
        System.out.println("Enter recipient number:");
        receipentCell = input.nextLine();
}
    boolean checkRecepientcell(){
                if (!receipentCell.startsWith("+27")){
            return false;
        }

        if (receipentCell.length() != 12){
        return false;
        }

        for (int i = 3; i < receipentCell.length(); i++){
        if (!Character.isDigit(receipentCell.charAt(i))){
            return false;
        }
        
    }
        return true;
}
    void sendMesasage(){
        System.out.println("Please enter the amount of messages you want to send: ");
        int messageAmount = input.nextInt();
        int i=0;
        input.nextLine();
        
        do {
        System.out.println("Please enter your message: ");
    message= input.nextLine();
    i=i+1;
        } while (i<= messageAmount);
        
    int extra;
    extra = message.length()-250;
    
    if (message.length()>250){
        System.out.println("Message exceeds 250 characters by "+extra+" characters: please reduce the size." );
    } else{
        System.out.println("Your message is ready to send.");
    }
    }
   
    
    
    String messageHash;
     String createHashmap(){
          long result = messageID ;
        while (result >= 100) {
            result /= 10;
    }
        String[] words = message.split("\\s+");
                if (words.length >= 2) {
            firstWord = words[0];
            secondWord = words[1];
                }
        
        return result +":"+firstWord+secondWord;
}
}

