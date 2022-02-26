package address;

import java.util.Scanner;

/** Menu class currently only has static methods to prompt to standard output information about a Contact like name,etc
 * @author kahom
 * @since 1.00
 **/

public class Menu {

    Scanner in = new Scanner(System.in); //reads in input
    String userInput;   //holds user input
    boolean isValid = true; //for checking user input validity

    /**
     * generates a standard output prompt for the First Name to be entered and returns the user input
     * @return the user input
     */
    public String prompt_FirstName() {

        System.out.print("First Name: ");
        userInput = in.nextLine();

        //input validation
        for(char c : userInput.toCharArray()){

            if(!Character.isLetter(c)) {
                isValid = false;
            }

        }

        while (!isValid){

            isValid = true;
            System.out.println("Invalid Input: contains a non-alphabetic character\n");
            System.out.print("First Name: ");
            userInput = in.nextLine();

            for(char c : userInput.toCharArray()){

                if(!Character.isLetter(c)) {
                    isValid = false;
                }

            }

        }

        System.out.print("\n");
        return userInput;

    }

    /**
     * generates a standard output prompt for the Last Name to be entered and returns the user input
     * @return the user input
     */
    public String prompt_LastName() {

        System.out.print("Last Name: ");
        userInput = in.nextLine();

        //input validation
        for(char c : userInput.toCharArray()){

            if(!Character.isLetter(c)) {
                isValid = false;
            }

        }

        while (!isValid){

            isValid = true;
            System.out.println("Invalid Input: contains a non-alphabetic character\n");
            System.out.print("Last Name: ");
            userInput = in.nextLine();

            for(char c : userInput.toCharArray()){

                if(!Character.isLetter(c)) {
                    isValid = false;
                }

            }

        }

        System.out.print("\n");
        return userInput;

    }

    /**
     * generates a standard output prompt for the Street to be entered and returns the user input
     * @return the user input
     */
    public String prompt_Street() {

        //lack of input validation as street names can contain any possible characters
        System.out.print("Street: ");
        userInput = in.nextLine();
        System.out.print("\n");
        return userInput;

    }

    /**
     * generates a standard output prompt for the City to be entered and returns the user input
     * @return the user input
     */
    public String prompt_City() {

        System.out.print("City: ");
        userInput = in.nextLine();

        //input validation
        for(char c : userInput.toCharArray()){

            if(!Character.isLetter(c)) {
                isValid = false;
            }

        }

        while (!isValid){

            isValid = true;
            System.out.println("Invalid Input: contains a non-alphabetic character\n");
            System.out.print("City: ");
            userInput = in.nextLine();

            for(char c : userInput.toCharArray()){

                if(!Character.isLetter(c)) {
                    isValid = false;
                }

            }

        }

        System.out.print("\n");
        return userInput;

    }

    /**
     * generates a standard output prompt for the State to be entered and returns the user input
     * @return the user input
     */
    public String prompt_State() {

        System.out.print("State: ");
        userInput = in.nextLine();

        //input validation
        for(char c : userInput.toCharArray()){

            if(!Character.isLetter(c)) {
                isValid = false;
            }

        }

        while (!isValid){

            isValid = true;
            System.out.println("Invalid Input: contains a non-alphabetic character\n");
            System.out.print("State: ");
            userInput = in.nextLine();

            for(char c : userInput.toCharArray()){

                if(!Character.isLetter(c)) {
                    isValid = false;
                }

            }

        }

        System.out.print("\n");
        return userInput;

    }

    /**
     * generates a standard output prompt for the Zip to be entered and returns the user input
     * @return the user input
     */
    public int prompt_Zip() {

        System.out.print("Zip: ");
        userInput = in.nextLine();

        //input validation
        for(char c : userInput.toCharArray()){

            if(!Character.isDigit(c)) {
                isValid = false;
            }

        }

        while (!isValid){

            isValid = true;
            System.out.println("Invalid Input: contains a alphabetic character\n");
            System.out.print("Zip: ");
            userInput = in.nextLine();

            for(char c : userInput.toCharArray()){

                if(!Character.isDigit(c)) {
                    isValid = false;
                }

            }

        }

        System.out.print("\n");
        return Integer.parseInt(userInput);

    }

    /**
     * generates a standard output prompt for the Telephone to be entered and returns the user input
     * @return the user input
     */
    public String prompt_Telephone() {

        //lack of input validation as phone numbers can contain both numbers and special characters
        System.out.print("Phone: ");
        userInput = in.nextLine();
        System.out.print("\n");
        return userInput;

    }

    /**
     * generates a standard output prompt for the Email to be entered and returns the user input
     * @return the user input
     */
    public String prompt_Email() {

        //lack of input validation as phone numbers can contain any characters
        System.out.print("Email: ");
        userInput = in.nextLine();
        System.out.print("\n");
        return userInput;

    }

    /**
     * displays prompt for program functions
     */
    public void displayMenu() {

        System.out.println("""
                a) Loading of entries from file
                b) Addition
                c) Removal
                d) Find
                e) Listing
                f) Quit
                """);

    }

}
