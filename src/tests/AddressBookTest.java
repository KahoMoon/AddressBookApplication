package tests;

import address.AddressBookApplication;
import address.data.AddressBook;
import address.data.AddressEntry;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java. util. ArrayList;

class AddressBookTest {

    @Test
    public void testSizer(){

        AddressBook ab = new AddressBook();
        AddressEntry first = new AddressEntry();
        AddressEntry second = new AddressEntry();
        ab.add(first);
        ab.add(second);

        Assertions.assertEquals(ab.size(), 2);

        AddressBook ab2 = new AddressBook();
        AddressBookApplication.init("C:\\Users\\User\\IdeaProjects\\AddressBookApplication\\src\\address\\data\\AddressInputDataFile.txt", ab2);
        Assertions.assertEquals(ab2.size(), 2);

    }


    @Test
    public void testlist(){

        AddressBook ab = new AddressBook();
        AddressEntry first = new AddressEntry();
        ab.add(first);

        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        ab.list();

        /*String outString = """
                first
                last
                street
                city
                state
                99999
                phone
                email
                
                """;

        Assertions.assertEquals(outString, out.toString());*/

        Assertions.assertFalse(out.toString().isEmpty());

    }



}