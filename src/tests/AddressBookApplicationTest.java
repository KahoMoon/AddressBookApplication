package tests;

import address.AddressBookApplication;
import address.data.AddressBook;
import address.data.AddressEntry;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


class AddressBookApplicationTest {

    /**
     * checks if init creates the entries in the specified file
     */
    @Test
    public void shouldCreateTwoEntries(){

        AddressEntry first = new AddressEntry("Lynne", "Grewe", "123 3rd Ave", "Hayward", "Ca", 28666, "lynne.grewe@csueastbay.edu", "510-885-4167");

        AddressEntry second = new AddressEntry("Butch", "Grewe", "Bay Avenue", "Capitoal", "Ca", 99999, "bg@gmail.com", "415-389-1239");

        AddressBook ab = new AddressBook();
        AddressBook fileab = new AddressBook();
        fileab.add(first);
        fileab.add(second);

        AddressBookApplication.init("C:\\Users\\User\\IdeaProjects\\AddressBookApplication\\src\\address\\data\\AddressInputDataFile.txt", ab);

        Assertions.assertFalse(first.toString().isEmpty());
        Assertions.assertFalse(second.toString().isEmpty());
        Assertions.assertEquals(2, ab.size());

    }

}