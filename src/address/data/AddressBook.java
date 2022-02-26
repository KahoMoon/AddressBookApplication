package address.data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * AddressBook class that stores collection of AddressEntries
 * @author kahom
 * @since 1.00
 */

public class AddressBook {

    /**
     * holds the AddressEntries
     */
    ArrayList<AddressEntry> addressEntryList = new ArrayList<AddressEntry>();

    /**
     * holds the number of elements
     */
    int size = 0;

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
     * removes a specified entry from a given index in the address book
     * @param index the index of the entry to be removed
     */
    public void removeWrapper(int index) {

        addressEntryList.remove(index);
        size--;

    }

    /**
     * returns set containing entries that have the specified search prompt along with index
     * @param prompt the string you are searching for
     * @return a set containing all the indexes of entries relevant ot the search query
     */
    public Set<Integer> search(String prompt) {

        int index = 0;  //index of the AddressBook
        Set<Integer> indexList = new HashSet<Integer>();    //holds the indexes of the entries that fit the search prompt

        for (AddressEntry i : addressEntryList) {

            //checks if any of the AddressEntry fields fit the search prompt
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
     * @return a set containing all the indexes of entries relevant ot the search query
     */
    //overloaded for when entering ZIP specifically
    public Set<Integer> search(int prompt) {

        int index = 0;  //index of the AddressBook
        Set<Integer> indexList = new HashSet<Integer>();    //holds the indexes of the entries that fit the search prompt

        for (AddressEntry i : addressEntryList) {

            //checks if zip fits the search prompt
            if (i.getZip() == prompt) {

                System.out.println("\nIndex: " + index + "\n");
                System.out.println(i.toString());
                System.out.print(("\n"));

            }

            indexList.add(index);
            index++;

        }

        return indexList;

    }

}
