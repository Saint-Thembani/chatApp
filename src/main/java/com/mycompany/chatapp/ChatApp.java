/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chatapp;

/**
 *
 * @author rethe
 */
        import java.util.Scanner;
      public class ChatApp {

    public static void main(String[] args) {

        Scanner enterMenu = new Scanner(System.in);
        int choice;

        Registration reg = new Registration();
        Login login = new Login(reg);

        do {
            System.out.println("\n======MENU======");
            System.out.println("1.Register");
            System.out.println("2.Login");
            System.out.println("3.Exit");

            System.out.println("Enter your menu option: ");
            choice = enterMenu.nextInt();
            enterMenu.nextLine();

            switch(choice) {
                case 1:
                    reg.registerUser();
                    break;
                case 2:
                    login.userLogin();
                    break;
                case 3:
                    System.out.println("Goodbye.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 3);

        enterMenu.close();
    }
}