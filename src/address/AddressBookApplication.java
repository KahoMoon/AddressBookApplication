package address;

import address.data.AddressBook;
import address.data.AddressEntry;

/** main AddressBookApplication: purpose is to invoke some methods of the Menu classs
 **/

class AddressBookApplication {

    public static void main(String args[]) {

        Menu myMenu = new Menu();

        AddressBook addressBook = new AddressBook();
        initAddressBookExercise(addressBook);

    }

    static void initAddressBookExercise(AddressBook ab) {

        AddressEntry one = new AddressEntry();
        AddressEntry two = new AddressEntry("Kaho", "Moon", "street", "Hayward", "California", 99999, "510999999", "thisisanemail@gmail.com");

        ab.add(one);
        ab.add(two);

        ab.list();

    }

}
