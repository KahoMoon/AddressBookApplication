package address;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import address.data.AddressBook;
import address.data.AddressEntry;

/** main AddressBookApplication: purpose is to invoke some methods of the Menu classs
 * @author kahom
 * @since 1.00
 **/

class AddressBookApplication {

    public static void main(String args[]) {

        Menu myMenu = new Menu();

        AddressBook addressBook = new AddressBook();
        initAddressBookExercise(addressBook);
        init("C:\\Users\\User\\IdeaProjects\\AddressBookApplication\\src\\address\\data\\AddressInputDataFile.txt", addressBook);
        addressBook.list();

    }

    /**
     * initializes two entries and adds it to the address book
     * @param ab the address book in which you are adding the two entries to
     */

    static void initAddressBookExercise(AddressBook ab) {

        AddressEntry one = new AddressEntry();
        AddressEntry two = new AddressEntry("Kaho", "Moon", "street", "Hayward", "California", 99999, "510999999", "thisisanemail@gmail.com");

        ab.add(one);
        ab.add(two);

    }

    /**
     * init: generates AddressEntry(s) using a provided file and adds it to specified AddressBook ab
     * @param fileName the file name of the file in which the entries will be read off of
     * @param ab the name of the address book which you are adding the read entries into
     * @throws FileNotFoundException if the specified file cannot be found
     */

    static void init(String fileName, AddressBook ab) {

        try{

            int lineFromFileCount = 0;
            ArrayList<String> lineFromFile = new ArrayList<String>();
            File inFile = new File(fileName);
            Scanner myReader = new Scanner(inFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                lineFromFile.add(data);
            }
            myReader.close();

            while (lineFromFileCount < lineFromFile.size()){

                AddressEntry temp = new AddressEntry(lineFromFile.get(lineFromFileCount), lineFromFile.get(lineFromFileCount + 1), lineFromFile.get(lineFromFileCount + 2), lineFromFile.get(lineFromFileCount + 3), lineFromFile.get(lineFromFileCount + 4), Integer.parseInt(lineFromFile.get(lineFromFileCount + 5)), lineFromFile.get(lineFromFileCount + 6), lineFromFile.get(lineFromFileCount + 7));

                ab.add(temp);


                lineFromFileCount = lineFromFileCount + 8;

            }
        }
        catch (FileNotFoundException e){

            System.out.println("An error occurred.");
            e.printStackTrace();

        }
    }
}
