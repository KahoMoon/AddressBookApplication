package address.data;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * AddressBook class that stores collection of AddressEntries
 * @author kahom
 * @since 1.00
 */

public class AddressBook {

    ArrayList<AddressEntry> addressEntryList = new ArrayList<AddressEntry>();   //holds the AddressEntries
    int size = 0;   //holds the number of elements

    /**
     * returns the number of entries in the address book
     * @return the number of entries in the address book
     */
    public int size() {

        return size;

    }

    /**
     * prints out the all information of all elements in the AddressBook
     */

    public void list() {

        for (AddressEntry i : addressEntryList) {
            System.out.println(i.toString());
            //System.out.println("test\n");
        }

    }

    /**
     * adds an AddressEntry into AddressBook
     * @param addressEntry the entry you want added to the address book
     */

    public void add(AddressEntry addressEntry) {

        addressEntryList.add(addressEntry);
        size++;

    }

    /**
     * removes a specified entry from the address book
     */
    public void removeWrapper(int index) {

        addressEntryList.remove(index);
        size--;

    }

    /**
     * returns entries that contain the specified search prompt along with index
     * @param prompt the string you are searching for
     */
    public Set<Integer> search(String prompt) {

        int index = 0;
        Set<Integer> indexList = new HashSet<Integer>();

        for (AddressEntry i : addressEntryList) {

            if (i.getFirstName().toLowerCase().contains(prompt.toLowerCase()) || i.getLastName().toLowerCase().contains(prompt.toLowerCase()) || i.getStreet().toLowerCase().contains(prompt.toLowerCase()) || i.getCity().toLowerCase().contains(prompt.toLowerCase()) || i.getState().toLowerCase().contains(prompt.toLowerCase()) || i.getPhone().toLowerCase().contains(prompt.toLowerCase()) || i.getEmail().toLowerCase().contains(prompt.toLowerCase())) {

                System.out.println("\nIndex: " + index + "\n");
                System.out.println(i.toString());
                System.out.print(("\n"));

            }

            indexList.add(index);
            index++;

        }

        return indexList;

    }

    /**
     * returns entries that contain the specified integer (zip) along with the index
     * @param prompt the integer you are searching for
     */
    //overloaded for when entering ZIP specifically
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
