package address;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import address.data.AddressBook;
import address.data.AddressEntry;

/** main AddressBookApplication: purpose is to invoke some methods of the Menu class
 * @author kahom
 * @since 1.00
 **/

public class AddressBookApplication {

    /**
     * displays and allows the user to choose functions
     * @param args command line arguments, not applicable
     */

    public static void main(String args[]) {

        Menu myMenu = new Menu();
        AddressBook ab = new AddressBook();
        String answer = "garbage";  //holds user input pertaining to the main menu selection
        String innerAnswer;  //holds input from user for functions within each menu case
        Scanner in = new Scanner(System.in);

        while(!answer.equalsIgnoreCase("f")) {

            myMenu.displayMenu();
            answer = in.nextLine();
            System.out.print("\n");

            switch(answer){
                case "a":

                    System.out.print("Enter the path of the file: ");
                    innerAnswer = in.nextLine();
                    init(innerAnswer, ab);
                    System.out.println("Entries added from: " + innerAnswer + "\n");
                    ab.list();
                    break;

                case "b":

                    AddressEntry temp = new AddressEntry();

                    temp.setFirstName(myMenu.prompt_FirstName());
                    temp.setLastName(myMenu.prompt_LastName());
                    temp.setStreet(myMenu.prompt_Street());
                    temp.setCity(myMenu.prompt_City());
                    temp.setState(myMenu.prompt_State());
                    temp.setZip(myMenu.prompt_Zip());
                    temp.setPhone(myMenu.prompt_Telephone());
                    temp.setEmail(myMenu.prompt_Email());

                    System.out.print("\nAdded!");
                    ab.add(temp);
                    break;

                case "c":

                    System.out.print("Which index are you removing? ");
                    innerAnswer = in.nextLine();
                    boolean isValid = true;

                    for(char c : innerAnswer.toCharArray()){

                        if(!Character.isDigit(c)) {
                            isValid = false;
                        }

                    }

                    while (!isValid){

                        isValid = true;
                        System.out.println("Invalid Input: contains a alphabetic character\n");
                        System.out.print("Which index are you removing? ");
                        innerAnswer = in.nextLine();

                        for(char c : innerAnswer.toCharArray()){

                            if(!Character.isDigit(c)) {
                                isValid = false;
                            }

                        }

                    }

                    System.out.print("\n");
                    ab.removeWrapper(Integer.parseInt(innerAnswer));
                    break;

                case "d":

                    System.out.print("What are you looking for? ");
                    innerAnswer = in.nextLine();

                    ab.search(innerAnswer);
                    break;

                case "e":

                    ab.list();
                    break;

                case "f":

                    System.out.print("Goodbye");
                    break;

                default:

                    System.out.println("Invalid Input: that menu selection does not exist\n");

            }

        }


    }

    /**
     * initializes two entries and adds it to the address book
     * @param ab the address book in which you are adding the two entries to
     */

    static void initAddressBookExercise(AddressBook ab) {

        AddressEntry one = new AddressEntry();
        AddressEntry two = new AddressEntry("Kaho", "Moon", "street", "Hayward", "California", 99999, "thisisanemail@gmail.com", "510999999");

        ab.add(one);
        ab.add(two);

    }

    /**
     * init: generates AddressEntry(s) using a provided file and adds it to specified AddressBook ab
     * @param fileName the file name of the file in which the entries will be read off of
     * @param ab the name of the address book which you are adding the read entries into
     * @throws FileNotFoundException if the specified file cannot be found
     */

    public static void init(String fileName, AddressBook ab) {

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


                lineFromFileCount = lineFromFileCount + 8;  //increments by 8 because of 8 variables in AddressEntry

            }
        }
        catch (FileNotFoundException e){

            System.out.println("An error occurred.");
            e.printStackTrace();

        }
    }
}
