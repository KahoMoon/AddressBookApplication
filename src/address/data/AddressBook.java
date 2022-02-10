package address.data;
import java.util.ArrayList;

public class AddressBook {

    ArrayList<AddressEntry> addressEntryList = new ArrayList<AddressEntry>();

    public void list() {

        for (AddressEntry i : addressEntryList) {
            System.out.println(i.toString());
            //System.out.println("test\n");
        }

    }

    public void add(AddressEntry addressEntry) {

        addressEntryList.add(addressEntry);

    }

}
