package address.data;
import java.util.ArrayList;

/**
 * AddressBook class stores the individual AddressEntry(s) into a collective
 * @author kahom
 * @since 1.00
 */

public class AddressBook {

    ArrayList<AddressEntry> addressEntryList = new ArrayList<AddressEntry>();

    /**
     * list AddressBook: prints out the all information of all elements in the AddressBook
     */

    public void list() {

        for (AddressEntry i : addressEntryList) {
            System.out.println(i.toString());
            //System.out.println("test\n");
        }

    }

    /**
     * add AddressBook: add an AddressEntry into AddressBook
     * @param addressEntry the individual entry which you are adding to the address book
     */

    public void add(AddressEntry addressEntry) {

        addressEntryList.add(addressEntry);

    }

}
