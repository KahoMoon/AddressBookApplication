package tests;

import address.data.AddressEntry;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class AddressEntryTest {

    @Test
    public void testDefaultConstructor(){

        AddressEntry first = new AddressEntry();
        Assertions.assertEquals(first.getFirstName(), "first");
        Assertions.assertEquals(first.getLastName(), "last");
        Assertions.assertEquals(first.getStreet(), "street");
        Assertions.assertEquals(first.getCity(), "city");
        Assertions.assertEquals(first.getState(), "state");
        Assertions.assertEquals(first.getPhone(), "phone");
        Assertions.assertEquals(first.getEmail(), "email");
        Assertions.assertEquals(first.getZip(), 99999);

    }

    @Test
    public void testConstructor(){

        AddressEntry first = new AddressEntry("Lynne", "Grewe", "123 3rd Ave", "Hayward", "Ca", 28666, "lynne.grewe@csueastbay.edu", "510-885-4167");

        Assertions.assertEquals(first.getFirstName(), "Lynne");
        Assertions.assertEquals(first.getLastName(), "Grewe");
        Assertions.assertEquals(first.getStreet(), "123 3rd Ave");
        Assertions.assertEquals(first.getCity(), "Hayward");
        Assertions.assertEquals(first.getState(), "Ca");
        Assertions.assertEquals(first.getPhone(), "510-885-4167");
        Assertions.assertEquals(first.getEmail(), "lynne.grewe@csueastbay.edu");
        Assertions.assertEquals(first.getZip(), 28666);

    }

    @Test
    public void testToString(){

        AddressEntry first = new AddressEntry();
        String example = """
                first
                last
                street
                city
                state
                99999
                phone
                email
                """;

        Assertions.assertEquals(first.toString(), example);

    }

    @Test
    public void testSettersGetters(){

        AddressEntry first = new AddressEntry();

        first.setFirstName("sadf");
        Assertions.assertEquals(first.getFirstName(), "sadf");

        first.setLastName("asdf");
        Assertions.assertEquals(first.getLastName(), "asdf");

        first.setStreet("asdf");
        Assertions.assertEquals(first.getStreet(), "asdf");

        first.setCity("asdf");
        Assertions.assertEquals(first.getCity(), "asdf");

        first.setState("asdf");
        Assertions.assertEquals(first.getState(), "asdf");

        first.setZip(12345);
        Assertions.assertEquals(first.getZip(), 12345);

        first.setPhone("123456789");
        Assertions.assertEquals(first.getPhone(), "123456789");

        first.setEmail("asdf@");
        Assertions.assertEquals(first.getEmail(), "asdf@");

    }

}