/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatapp;

/**
 *
 * @author rethe
 */
public class Registration {
    private String username;
    private String password;
    private String phoneNumber;

    // Username
    public boolean checkUsername(String username){
        int usernameLen = username.length();
        return (username.contains("_") && usernameLen <= 5);
    }

    public void getUsernamemessage(String username){
        if (checkUsername(username)){
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

    // Password
    public boolean checkPasswordcomplexity(String password){
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

    public void getPasswordvalidationMessage(String password){
        if (checkPasswordcomplexity(password)){
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
    
    //Phone number
    public boolean checkPhonenumber(String phoneNumber){
        if (phoneNumber.startsWith("+27"));
    }
}


