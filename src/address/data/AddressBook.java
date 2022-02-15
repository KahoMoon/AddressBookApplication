package address.data;
import java.util.ArrayList;

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
     * @param addressEntry
     */

    public void add(AddressEntry addressEntry) {

        addressEntryList.add(addressEntry);

    }

}
