package tests;

import address.data.AddressBook;
import org.junit.jupiter.api.BeforeEach;
import address.data.AddressEntry;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import address.Menu;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {

    @Test
    public void testDisplayMenu(){

        Menu myMenu = new Menu();

        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        myMenu.displayMenu();

        Assertions.assertFalse(out.toString().isEmpty());

    }

}