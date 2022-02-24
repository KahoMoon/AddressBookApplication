package address.data;
import java.util.ArrayList;

public class AddressBook {

    ArrayList<AddressEntry> addressEntryList = new ArrayList<AddressEntry>();
    int size = 0;

    /**
     * returns the number of entries in the address book
     * @return the number of entries in the address book
     */
    public int size() {

        return size;

    }

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
     * @param addressEntry the entry you want to add to the address book
     */

    public void add(AddressEntry addressEntry) {

        addressEntryList.add(addressEntry);
        size++;

    }

    /**
     * removes a specified entry from the address book
     * @param addressEntry the entry you want to remove from the address book
     */
    public void remove(AddressEntry addressEntry) {

        addressEntryList.remove(addressEntry);
        size--;

    }

    /**
     * returns entries that contain the specified search prompt along with index
     * @param prompt the string you are searching for
     */

    public void search(String prompt) {

        int index = 0;

        for (AddressEntry i : addressEntryList) {

            if (i.getFirstName().toLowerCase().contains(prompt.toLowerCase()) || i.getLastName().toLowerCase().contains(prompt.toLowerCase()) || i.getStreet().toLowerCase().contains(prompt.toLowerCase()) || i.getCity().toLowerCase().contains(prompt.toLowerCase()) || i.getState().toLowerCase().contains(prompt.toLowerCase()) || i.getPhone().toLowerCase().contains(prompt.toLowerCase()) || i.getEmail().toLowerCase().contains(prompt.toLowerCase())) {

                System.out.println("Index: " + index + "\n");
                System.out.println(i.toString());
                System.out.println(("\n"));

            }

            index++;

        }

    }

    /**
     * returns entries that contain the specified integer (zip) along with the index
     * @param prompt the integer you are searching for
     */
    public void search(int prompt) {

        int index = 0;

        for (AddressEntry i : addressEntryList) {

            if (i.getZip() == prompt) {

                System.out.println("Index: " + index + "\n");
                System.out.println(i.toString());
                System.out.println(("\n"));

            }

            index++;

        }

    }

}
