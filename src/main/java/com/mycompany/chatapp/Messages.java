package com.mycompany.chatapp;

import java.util.Scanner;
import java.util.Random;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileWriter;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class Messages {

    Scanner input = new Scanner(System.in);
    Random rand = new Random();

    int choice;
    String message;
    String firstWord = "";
    String secondWord = "";
     int messageAmount;
     String messageDetails;
         String continueChoice;


    String[] sentMessages = new String[100];
    int messageCount = 0;

    Registration reg;
    Login login;

    public Messages(Registration reg, Login login) {
        this.reg = reg;
        this.login = login;
    }

    public void userMenu() {
        do {
            System.out.println("\n====== WELCOME TO QUICKCHAT ======");
            System.out.println("1. Send messages");
            System.out.println("2. Show recently sent messages");
            System.out.println("3. Quit");

            System.out.print("Enter your menu option: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1 -> sendMessage();
                case 2 -> printMessages();
                case 3 -> System.out.println("Goodbye.");
                default -> System.out.println("Invalid choice.");
            }

        } while (choice != 3);
    }

    long messageID = rand.nextLong(9999999999L);

    boolean checkMessageID() {
        if (messageID < 10000000000L) {
            System.out.println("Message ID generated: " + messageID);
            return true;
        } else {
            return false;
        }
    }

    String recipientCell;

    void getRecipientCell() {
        System.out.println("Enter recipient number:");
        recipientCell = input.nextLine();
    }

    boolean checkRecipientCell() {

        if (!recipientCell.startsWith("+27")) {
            return false;
        }

        if (recipientCell.length() != 12) {
            return false;
        }

        for (int i = 3; i < recipientCell.length(); i++) {
            if (!Character.isDigit(recipientCell.charAt(i))) {
                return false;
            }
        }

        return true;
    }

void sendMessage() {
    long messageID = rand.nextLong(9999999999L);
    do {

        getRecipientCell();

        while (!checkRecipientCell()) {
            System.out.println("Invalid recipient number.");
            getRecipientCell();
        }

        System.out.println("Please enter your message:");
        message = input.nextLine();

        while (message.length() > 250) {

            int extra = message.length() - 250;

            System.out.println("Message exceeds 250 characters by "
                    + extra + " characters.");

            System.out.println("Please re-enter message:");
            message = input.nextLine();
        }

        System.out.println("Message ready to send.");

        System.out.println("1. Send message");
        System.out.println("2. Disregard message");
        System.out.println("3. Store message");

        int option = input.nextInt();
        input.nextLine();

        switch (option) {

            case 1 -> {
                sentMessages[messageCount] = message;
                messageCount++;

                System.out.println("Message sent successfully.");
                System.out.println("Message Hash: " + createHashmap());
                System.out.println(displayMessage());
            }

            case 2 -> {
                System.out.println("Message deleted.");
            }

            case 3 -> {
                sentMessages[messageCount] = message;
                messageCount++;

                System.out.println("Message stored successfully.");
               
            }

            default -> {
                System.out.println("Invalid option.");
            }
        }

        do {
           input.nextLine();
                System.out.println("Do you want to enter another message? (yes/no)");
                    continueChoice = input.nextLine();

        }while (!continueChoice.equalsIgnoreCase("yes")
                    && !continueChoice.equalsIgnoreCase("no"));



        } while (continueChoice.equalsIgnoreCase("yes"));

        System.out.println("Total messages sent: " + messageCount);
}

            String createHashmap() {

        long result = messageID;
        while (result >= 100) {
            result /= 10;
        }
        String[] words = message.split("\\s+");
        if (words.length >= 2) {
            firstWord = words[0];
            secondWord = words[1];
        }
        return result + ":" + messageAmount+ firstWord + secondWord;
    }

    void printMessages() {
        if (messageCount == 0) {
            System.out.println("No messages sent yet.");
            return;
        }
        System.out.println("\n===== SENT MESSAGES =====");

        for (int i = 0; i < messageCount; i++) {
            System.out.println((i + 1) + ". " + sentMessages[i]);
        }
 
    }
        String displayMessage() {

            return "Message ID: " + messageID+ "\nMessage Hash: " + createHashmap()+
                    "\nRecipient: " + recipientCell+ "\nMessage: " + message;
}
        
    }
