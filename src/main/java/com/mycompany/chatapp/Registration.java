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
public class Registration {
    Scanner input = new Scanner(System.in);
     String username;
     String password;
     String phoneNumber;
     String storedUser;
     String storedPassword;
     String storedNumber;

    // Checking if Username is valid.
     boolean checkUsername(){
        if(username.contains("_") && username.length() <= 5){
            return true;
        } else{
            return false;
        }
    }

    public void  getUsernamemessage(String username){
        if (checkUsername()){
            System.out.println("Username successfully captured.");
        } else {
            System.out.println("Username is not correctly formatted; please ensure "
                    + "your username contains an underscore and is no more "
                    + "than 5 characters in length.");
        }
        
    }

    public void setUser(String username){
        this.username = username;
    }

    public String getUser(){
        return this.username;
    }

    // Checking password complexity.
    boolean checkPasswordcomplexity(){
        if (password.length() < 8){
            return false;
        }
        
        boolean checkUppercase = false;
        boolean checkFornumber = false;
        boolean checkForspecialCharacter = false;

        for (int c = 0; c < password.length(); c++){
            char ch = password.charAt(c);

            if (Character.isUpperCase(ch)){
                checkUppercase = true;
            } 
            else if (Character.isDigit(ch)){
                checkFornumber = true;
            } 
            else if (!Character.isLetterOrDigit(ch)){
                checkForspecialCharacter = true;
            }
        }

        return checkUppercase && checkFornumber && checkForspecialCharacter;
    }

    public void getPasswordvalidationMessage(){
        if (checkPasswordcomplexity()){
            System.out.println("Password successfully captured");
        } else {
            System.out.println("Password is incorrectly formatted, please ensure"
                    + " that the password contains at least 8 characters, a capital"
                    + " letter, a number and a special character.");
            
        }
        }
      public void setPassword(String password){
        this.password = password;
    }

    public String getpassword(){
        return this.password;
    }
    
    // 
   public boolean checkPhonenumber(){
        if (phoneNumber.startsWith("+27")){
            return false;
        }

        if (phoneNumber.length() != 12){
        return false;
        }

        for (int i = 3; i < phoneNumber.length(); i++){
        if (!Character.isDigit(phoneNumber.charAt(i))){
            return false;
        }
        }

    return true;
}
        public void setNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            }

        public String getNumber(){
        return this.phoneNumber;
        }
void registerUser() {
    System.out.println("\n======REGISTER======");

    // Username
    System.out.println("Enter username:");
    username = input.nextLine();

    while (!checkUsername()){
        getUsernamemessage(username);
        System.out.println("Enter username again:");
        username = input.nextLine();
    }

    // Password
    System.out.println("Enter password:");
    password = input.nextLine();

    while (!checkPasswordcomplexity()){
        getPasswordvalidationMessage();
        System.out.println("Enter password again:");
        password = input.nextLine();
    }

    // Phone number
    System.out.println("Enter phone number:");
    phoneNumber = input.nextLine();

    while (!checkPhonenumber()){
        System.out.println("Invalid phone number. Use +27 followed by 9 digits.");
        System.out.println("Enter phone number again:");
        phoneNumber = input.nextLine();
    }

    // Final result
    if (checkUsername() && checkPasswordcomplexity() && checkPhonenumber()){
        
        storedUser= username;
        storedPassword= password;
        storedNumber= phoneNumber;
        System.out.println("Registration was successful.");
    } else {
        System.out.println("Registration was unsuccessful please try again.");
    }
}
        
    }
  



