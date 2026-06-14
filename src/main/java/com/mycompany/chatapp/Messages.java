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

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.lang.reflect.Type;

import java.util.ArrayList;
import java.util.List;

public class Messages {

    private static final String FILE_NAME = "messages.json";

    Scanner input = new Scanner(System.in);
    Random rand = new Random();

    int choice;
    String message;
    String firstWord = "";
    String secondWord = "";
    int messageAmount = 0;
    String messageDetails;
    String continueChoice;

    long messageID;

    String recipientCell;

    List<MessageData> sentMessages = new ArrayList<>();
    List<MessageData> storedMessages = new ArrayList<>();
    List<MessageData> disregardedMessages = new ArrayList<>();

    List<String> messageIDs = new ArrayList<>();
    List<String> messageHashes = new ArrayList<>();

    Registration reg;
    Login login;

    public Messages(Registration reg, Login login) {

        this.reg = reg;
        this.login = login;

        loadMessagesFromJSON();
    }

    void saveMessagesToJSON() {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            gson.toJson(storedMessages, writer);
        } catch (IOException e) {
            System.out.println("Error saving messages.");
        }
    }

    void loadMessagesFromJSON() {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(FILE_NAME)) {
            Type listType =
                    new TypeToken<ArrayList<MessageData>>() {
                    }.getType();
           storedMessages = gson.fromJson(reader, listType);
            if (storedMessages == null) {
                storedMessages = new ArrayList<>();
            }
        } catch (IOException e) {
            storedMessages = new ArrayList<>();
        }
    }

    public void userMenu() {
        do {
            System.out.println("\n====== WELCOME TO QUICKCHAT ======");
            System.out.println("1. Send messages");
            System.out.println("2. Show recently sent messages");
            System.out.println("3. Stored messages.");
            System.out.println("4. Quit");

            System.out.print("Enter your menu option: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1 ->
                    sendMessage();
                    
                case 2 ->
                    printMessages();
                   
                   case 3 ->
                        storedMessages();
                    
                case 4 ->
                    System.out.println("Goodbye.");

                default ->
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);
    }

    boolean checkMessageID() {

        if (messageID < 10000000000L) {
            System.out.println("Message ID generated: "
                    + messageID);
            return true;
        } else {
            return false;
        }
    }

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
            if (!Character.isDigit(
                    recipientCell.charAt(i))) {

                return false;
            }
        }

        return true;
    }
    
    void sendMessage() {

        do {
            messageID = rand.nextLong(9999999999L);
            getRecipientCell();
            while (!checkRecipientCell()) {

                System.out.println(
                        "Invalid recipient number.");
                getRecipientCell();
            }
            System.out.println(
                    "Please enter your message:");

            message = input.nextLine();

            while (message.length() > 250) {

                int extra = message.length() - 250;

                System.out.println(
                        "Message exceeds 250 characters by "
                        + extra + " characters.");

                System.out.println(
                        "Please re-enter message:");

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
                    messageAmount++;
                    MessageData msg = new MessageData(
                            String.valueOf(messageID),
                            recipientCell,
                            message,
                            createHashmap()
                    );

                    sentMessages.add(msg);

                    messageIDs.add(msg.messageID);
                    messageHashes.add(msg.messageHash);

                    System.out.println(
                            "Message sent successfully.");

                    System.out.println(
                            "Message Hash: "
                            + createHashmap());

                    System.out.println(displayMessage());
                }

                    case 2 -> {

    MessageData msg = new MessageData(
            String.valueOf(messageID),
            recipientCell,
            message,
            createHashmap()
    );

    disregardedMessages.add(msg);

    System.out.println("Message deleted.");
}
                
                case 3 -> {
                      messageAmount++;

                      MessageData msg = new MessageData(
                              String.valueOf(messageID),
                              recipientCell,
                              message,
                              createHashmap()
                      );

                      storedMessages.add(msg);

                        messageIDs.add(msg.messageID);
                        messageHashes.add(msg.messageHash);
                      

                      saveMessagesToJSON();

                      System.out.println(
                              "Message stored successfully.");
                  }
                default -> {

                    System.out.println("Invalid option.");
                }
            }

            do {

                System.out.println(
                        "Do you want to enter another message? (yes/no)");

                continueChoice = input.nextLine();

            } while (!continueChoice.equalsIgnoreCase("yes")
                    && !continueChoice.equalsIgnoreCase("no"));

        } while (continueChoice.equalsIgnoreCase("yes"));

        System.out.println(
                "Total messages sent: "
                + sentMessages.size());
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
        } else if (words.length == 1) {

            firstWord = words[0];
            secondWord = "";
        }

        return result + ":"
                + messageAmount + ":"
                + firstWord.toUpperCase()
                + secondWord.toUpperCase();
    }

    void printMessages() {
        if (sentMessages.isEmpty()) {
            System.out.println(
                    "No messages sent yet.");
            return;
        }
        System.out.println(
                "\n===== SENT MESSAGES =====");
        for (int i = 0; i < sentMessages.size(); i++) {

            MessageData msg = sentMessages.get(i);

            System.out.println(
                    (i + 1) + ". "
                    + msg.message);
        }
    }

    String displayMessage() {
        return "Message ID: " + messageID
                + "\nMessage Hash: " + createHashmap()
                + "\nRecipient: " + recipientCell
                + "\nMessage: " + message;
    }
    void storedMessages(){
         do {
            System.out.println("\n====== STORED MESSAGES ======");
            System.out.println("1. Display sender and recipent of all stored messages.");
            System.out.println("2. Displau the longest stored message.");
            System.out.println("3. Search for message.");
            System.out.println("4. Search for all messages from a particular recipent.");
             System.out.println("5.Delete message by hashmap.");
             System.out.println("6. Display report of all stored messages.");
             System.out.println("7. Exit menu.");

            System.out.print("Enter your menu option: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                    case 1 ->
                    displayStoredMessages();
                    
                    case 2 ->
                        System.out.println(longestMessage());
                    
                    case 3 -> {

                            System.out.println("Enter Message ID:");

                            String id = input.nextLine();

                            System.out.println(searchByMessageID(id));
                        }

                    case 4 -> {

                            System.out.println("Enter recipient:");

                            String recipient = input.nextLine();

                            System.out.println(
                                    searchByRecipient(recipient));
                        }

                    case 5 -> {

                            System.out.println("Enter hash:");

                            String hash = input.nextLine();

                            if (deleteByHash(hash)) {

                            System.out.println("Message deleted.");
                            } else {

                            System.out.println("Hash not found.");
            }
        }
                    
                    case 6->
                            System.out.println(displayReport());
                    
                    case 7 ->
                            System.out.println("Returning to main menu.");
                    
                    default ->
                    System.out.println("Invalid choice.");
            }
        } while (choice != 7);
        
    }
    void displayStoredMessages() {

    if (storedMessages.isEmpty()) {

        System.out.println("No stored messages.");
        return;
    }

    for (int i = 0; i < storedMessages.size(); i++) {

        MessageData msg = storedMessages.get(i);

        System.out.println(
                "Sender: " + login.username
                + "\nRecipient: "
                + msg.recipient
                + "\n");
    }
}
    String longestMessage() {

        String longest = "";

for (int i = 0; i < storedMessages.size(); i++) {

    MessageData msg = storedMessages.get(i);

    if (msg.message.length() > longest.length()) {

        longest = msg.message;
    }
}

        return longest;
    }
    String searchByMessageID(String id) {

        for (int i = 0; i < storedMessages.size(); i++) {

    MessageData msg = storedMessages.get(i);

    if (msg.messageID.equals(id)) {

        return msg.message;
    }
}
        return "Message not found";
    }

    String searchByRecipient(String recipient) {

        String results = "";

        for (int i = 0; i < storedMessages.size(); i++) {

    MessageData msg = storedMessages.get(i);

    if (msg.recipient.equals(recipient)) {

        results += msg.message + "\n";
    }
}

        return results;
    }
    boolean deleteByHash(String hash) {

        for (int i = 0; i < storedMessages.size(); i++) {

            if (storedMessages.get(i)
                    .messageHash.equals(hash)) {

                storedMessages.remove(i);

                saveMessagesToJSON();

                return true;
            }
        }

        return false;
    }

    String displayReport() {

        String report = "";

        for (int i = 0; i < storedMessages.size(); i++) {

    MessageData msg = storedMessages.get(i);

     report += "Message Hash: "
                    + msg.messageHash
                    + "\nRecipient: "
                    + msg.recipient
                    + "\nMessage: "
                    + msg.message
                    + "\n\n";
} 
        return report;
    }
}