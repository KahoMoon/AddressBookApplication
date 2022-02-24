package tests;

import address.Menu;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * tests Menu
 */
class MenuTest {

    /**
     * checks if menu options display
     */
    @Test
    public void testDisplayMenu(){

        Menu myMenu = new Menu();

        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        myMenu.displayMenu();

        Assertions.assertFalse(out.toString().isEmpty());

    }

}