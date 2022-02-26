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

        Menu myMenu = new Menu();   //main Menu object
        AddressBook ab = new AddressBook(); //main AddressBook object
        String answer = "garbage";  //holds user input pertaining to the main menu selection
        String innerAnswer;  //holds user input for functions within each menu case
        Scanner in = new Scanner(System.in);    //object to read in user input

        while(!answer.equalsIgnoreCase("f")) {

            myMenu.displayMenu();
            answer = in.nextLine();
            System.out.print("\n");

            switch(answer){

                //add entries from a file
                case "a":

                    System.out.print("Enter the path of the file: ");
                    innerAnswer = in.nextLine();
                    init(innerAnswer, ab);
                    System.out.println("Entries added from: " + innerAnswer + "\n");
                    ab.list();
                    break;

                //add entry
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

                    System.out.println("Added!\n");
                    ab.add(temp);
                    break;

                //remove entry
                case "c":

                    System.out.print("Which index are you removing? ");
                    innerAnswer = in.nextLine();
                    boolean isValid = true;

                    //input validation
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

                    if(Integer.parseInt(innerAnswer) < ab.size()){

                        ab.removeWrapper(Integer.parseInt(innerAnswer));
                        System.out.println("Removed!\n");

                    }else{

                        System.out.println("Invalid Input: non-existent index\n");

                    }

                    break;

                //search for entry
                case "d":

                    System.out.print("What are you looking for? ");
                    innerAnswer = in.nextLine();

                    ab.search(innerAnswer);
                    break;

                //list all existing entries
                case "e":

                    ab.list();
                    break;

                //exit the program
                case "f":

                    System.out.print("Goodbye");
                    break;

                //invalid input message
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
     * generates AddressEntry(s) using a provided file and adds it to specified AddressBook ab
     * @param fileName the file name of the file in which the entries will be read off of
     * @param ab the name of the address book which you are adding the read entries into
     * @throws FileNotFoundException if the specified file cannot be found
     */

    public static void init(String fileName, AddressBook ab) {

        try{

            //create an ArrayList of all the lines in the file
            int lineFromFileCount = 0;
            ArrayList<String> lineFromFile = new ArrayList<String>();
            File inFile = new File(fileName);
            Scanner myReader = new Scanner(inFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                lineFromFile.add(data);
            }
            myReader.close();

            //create AddressEntries from each line in the ArrayList
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
