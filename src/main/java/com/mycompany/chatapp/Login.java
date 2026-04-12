/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatapp;

import java.util.Scanner;

/**
 *
 * @author rethe
 */
    import java.util.Scanner;
    public class Login {
       Scanner input = new Scanner(System.in);
       Registration reg;

        public Login(Registration reg){
        this.reg = reg;
}
    void userLogin(){
        
        if (reg.getNumber() == null){
            System.out.println("Not registered Yet.");
            return;
        }
        int attempts=3;
        boolean success =false;
      System.out.println("\n======LOGIN======");
      while (attempts>0 && !success){
        System.out.println("Enter your phoneNumber: ");
        String phoneNumber = input.nextLine();
        
        System.out.println(" Enter your username");
       String username = input.nextLine();
       
        System.out.println("Enter your password");
        String password = input.nextLine();
        if(phoneNumber.equals(reg.phoneNumber) && username.equals(reg.storedUser)
                && password.equals(reg.storedPassword)){
            System.out.println("Login succesfull, Welcome back!"+ username);
            success=true;
        } else {
            attempts--;
        
        if (attempts>0){
            System.out.println("You have entered the incorrect details plasae retry: Attempts left"+ attempts);
        }
       }
      }
      if(!success){
          System.out.println("Failed to login. Account is locked.");
      }
    }
    }