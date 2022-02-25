package address;

import java.util.Scanner;

/** Menu class currently only has static methods to prompt to standard output information about a Contact like name,etc
 * @author kahom
 * @since 1.00
 **/

public class Menu {

    String namePattern = "[^\\p{P}|^\\d+]+";    //used for checking user input validity
    //String zipPattern = "[0-9]+"; //used for checking user zip input validity
    boolean result = false; //shows if input is valid or not

    Scanner in = new Scanner(System.in); //reads in input
    String userInput;
    boolean isValid = true;

    /**
     * generates a standard output prompt for the First Name to be entered and returns the user input
     * @return the user input
     */
    public String prompt_FirstName() {

        System.out.print("First Name: ");
        userInput = in.nextLine();

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
     * prompt_LastName  generates a standard output prompt for the Last Name to be entered and returns the user input
     * @return the user input
     */
    public String prompt_LastName() {

        System.out.print("Last Name: ");
        userInput = in.nextLine();

        for(char c : userInput.toCharArray()){

            if(!Character.isLetter(c)) {
                isValid = false;
            }

        }

        while (!isValid){

            isValid = true;
            System.out.println("Invalid Input: contains a non-alphabetic character\n");
            System.out.print("Laast Name: ");
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
     * prompt_LastName  generates a standard output prompt for the Street to be entered and returns the user input
     * @return the user input
     */
    public String prompt_Street() {

        //while(!result){

            in = new Scanner(System.in);
            System.out.println("ALPHANUMERICAL\n");
            System.out.println("-Street-");
            //result = in.nextLine().matches(namePattern);

        //}

        //result = false;
        return in.nextLine();

    }

    /**
     * prompt_LastName  generates a standard output prompt for the City to be entered and returns the user input
     * @return the user input
     */
    public String prompt_City() {

        //while(!result){

            in = new Scanner(System.in);
            System.out.println("ALPHABETICAL\n");
            System.out.println("-City-");
            //result = in.nextLine().matches(namePattern);

        //}

        //result = false;
        return in.nextLine();

    }

    /**
     * prompt_LastName  generates a standard output prompt for the State to be entered and returns the user input
     * @return the user input
     */
    public String prompt_State() {

        //while(!result){

            in = new Scanner(System.in);
            System.out.println("ALPHABETICAL\n");
            System.out.println("-State-");
            //result = in.nextLine().matches(namePattern);

       //}

        //result = false;
        return in.nextLine();

    }

    /**
     * prompt_LastName  generates a standard output prompt for the Zip to be entered and returns the user input
     * @return the user input
     */
    public int prompt_Zip() {

        int temp = 0;

        while(!result){

            try{

                in = new Scanner(System.in);
                System.out.println("NUMERICAL\n");
                System.out.println("-Zip-");
                temp = Integer.parseInt(in.nextLine());
                result = true;

            }
            catch(NumberFormatException e){

            }

        }

        result = false;
        System.out.println("\n");
        return temp;

    }

    /**
     * prompt_LastName  generates a standard output prompt for the Telephone to be entered and returns the user input
     * @return the user input
     */
    public String prompt_Telephone() {

        in = new Scanner(System.in);
        System.out.println("ALPHABETICAL + SPECIAL\n");
        System.out.println("-Phone Number-");
        return in.nextLine();

    }

    /**
     * prompt_LastName  generates a standard output prompt for the Email to be entered and returns the user input
     * @return the user input
     */
    public String prompt_Email() {

        in = new Scanner(System.in);
        System.out.println("ALPHABETICAL + SPECIAL\n");
        System.out.println("-Email-");
        return in.nextLine();

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
