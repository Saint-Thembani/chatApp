/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TestClasses;

import com.mycompany.chatapp.Registration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author rethe
 */
public class TestingChatApp {
    
    @Test
      public void TestUsername() {
    Registration reg = new Registration();
   String expected = "Kyl_1";
    String Actual = reg.getUser();
    assertEquals(expected,Actual,"Expect the name to match of Kyl_1");
}      
    
}
