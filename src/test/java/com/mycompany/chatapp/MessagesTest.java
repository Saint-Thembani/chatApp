/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.chatapp;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rethe
 */
public class MessagesTest {
    
    public MessagesTest() {
    }

    /**
     * Test of saveMessagesToJSON method, of class Messages.
     */
    @Test
    public void testSaveMessagesToJSON() {
        System.out.println("saveMessagesToJSON");
        Messages instance = null;
        instance.saveMessagesToJSON();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadMessagesFromJSON method, of class Messages.
     */
    @Test
    public void testLoadMessagesFromJSON() {
        System.out.println("loadMessagesFromJSON");
        Messages instance = null;
        instance.loadMessagesFromJSON();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of userMenu method, of class Messages.
     */
    @Test
    public void testUserMenu() {
        System.out.println("userMenu");
        Messages instance = null;
        instance.userMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkMessageID method, of class Messages.
     */
    @Test
    public void testCheckMessageID() {
        System.out.println("checkMessageID");
        Messages instance = null;
        boolean expResult = false;
        boolean result = instance.checkMessageID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRecipientCell method, of class Messages.
     */
    @Test
    public void testGetRecipientCell() {
        System.out.println("getRecipientCell");
        Messages instance = null;
        instance.getRecipientCell();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkRecipientCell method, of class Messages.
     */
    @Test
    public void testCheckRecipientCell() {
        System.out.println("checkRecipientCell");
        Messages instance = null;
        boolean expResult = false;
        boolean result = instance.checkRecipientCell();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sendMessage method, of class Messages.
     */
    @Test
    public void testSendMessage() {
        System.out.println("sendMessage");
        Messages instance = null;
        instance.sendMessage();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createHashmap method, of class Messages.
     */
    @Test
    public void testCreateHashmap() {
        System.out.println("createHashmap");
        Messages instance = null;
        String expResult = "";
        String result = instance.createHashmap();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printMessages method, of class Messages.
     */
    @Test
    public void testPrintMessages() {
        System.out.println("printMessages");
        Messages instance = null;
        instance.printMessages();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayMessage method, of class Messages.
     */
    @Test
    public void testDisplayMessage() {
        System.out.println("displayMessage");
        Messages instance = null;
        String expResult = "";
        String result = instance.displayMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of storedMessages method, of class Messages.
     */
    @Test
    public void testStoredMessages() {
        System.out.println("storedMessages");
        Messages instance = null;
        instance.storedMessages();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayStoredMessages method, of class Messages.
     */
    @Test
    public void testDisplayStoredMessages() {
        System.out.println("displayStoredMessages");
        Messages instance = null;
        instance.displayStoredMessages();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of longestMessage method, of class Messages.
     */
    @Test
    public void testLongestMessage() {
        System.out.println("longestMessage");
        Messages instance = null;
        String expResult = "";
        String result = instance.longestMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchByMessageID method, of class Messages.
     */
    @Test
    public void testSearchByMessageID() {
        System.out.println("searchByMessageID");
        String id = "";
        Messages instance = null;
        String expResult = "";
        String result = instance.searchByMessageID(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchByRecipient method, of class Messages.
     */
    @Test
    public void testSearchByRecipient() {
        System.out.println("searchByRecipient");
        String recipient = "";
        Messages instance = null;
        String expResult = "";
        String result = instance.searchByRecipient(recipient);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteByHash method, of class Messages.
     */
    @Test
    public void testDeleteByHash() {
        System.out.println("deleteByHash");
        String hash = "";
        Messages instance = null;
        boolean expResult = false;
        boolean result = instance.deleteByHash(hash);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayReport method, of class Messages.
     */
    @Test
    public void testDisplayReport() {
        System.out.println("displayReport");
        Messages instance = null;
        String expResult = "";
        String result = instance.displayReport();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
