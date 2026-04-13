/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.chatapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author rethe
 */
public class RegistrationTest {
    
    public RegistrationTest() {
    }

    /**
     * Test of setUser method, of class Registration.
     */
    @Test
    public void testRightSetUser() {
        String username = "Kyl_1";
         System.out.println("Welcome, "+username+ " It is great to see you.");
        Registration instance = new Registration();
        instance.setUser(username);
        // TODO review the generated test code and remove the default call to fail.
    }
       @Test
    public void testWrongSetUser() {
        String username = "Kyle!!!!!!!!";
        Registration instance = new Registration();
        instance.setUser(username);
        // TODO review the generated test code and remove the default call to fail.
        fail("Password is incorrectly formatted, please ensure"
                    + " that the password contains at least 8 characters, a capital"
                    + " letter, a number and a special character.");
    }

    /**
     * Test of getUser method, of class Registration.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        Registration instance = new Registration();
        String expResult = "";
        String result = instance.getUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkPasswordcomplexity method, of class Registration.
     */
    @Test
    public void testCheckPasswordcomplexity() {
        System.out.println("checkPasswordcomplexity");
        Registration instance = new Registration();
        boolean expResult = false;
        boolean result = instance.checkPasswordcomplexity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPasswordvalidationMessage method, of class Registration.
     */
    @Test
    public void testGetPasswordvalidationMessage() {
        System.out.println("getPasswordvalidationMessage");
        Registration instance = new Registration();
        instance.getPasswordvalidationMessage();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class Registration.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Registration instance = new Registration();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getpassword method, of class Registration.
     */
    @Test
    public void testGetpassword() {
        System.out.println("getpassword");
        Registration instance = new Registration();
        String expResult = "";
        String result = instance.getpassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkPhonenumber method, of class Registration.
     */
    @Test
    public void testCheckPhonenumber() {
        System.out.println("checkPhonenumber");
        Registration instance = new Registration();
        boolean expResult = false;
        boolean result = instance.checkPhonenumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumber method, of class Registration.
     */
    @Test
    public void testSetNumber() {
        System.out.println("setNumber");
        String phoneNumber = "";
        Registration instance = new Registration();
        instance.setNumber(phoneNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumber method, of class Registration.
     */
    @Test
    public void testGetNumber() {
        System.out.println("getNumber");
        Registration instance = new Registration();
        String expResult = "";
        String result = instance.getNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class Registration.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        Registration instance = new Registration();
        instance.registerUser();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
