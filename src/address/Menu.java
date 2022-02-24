package address;

import java.util.Scanner;

/** Menu class currently only has static methods to prompt to standard output information about a Contact like name,etc
 * @author kahom
 * @since 1.00
 **/

class Menu {

    String namePattern = "[^\\p{P}|^\\d+]+";
    String zipPattern = "[0-9]+";
    boolean result = false;
    Scanner in;

    /**
     * generates a standard output prompt for the First Name to be entered and returns the user input
     * @return the user input
     */
    public String prompt_FirstName() {

        while(!result){

            in = new Scanner(System.in);
            System.out.println("-First Name-");
            result = in.nextLine().matches(namePattern);

        }

        result = false;
        return in.nextLine();

    }

    /**
     * prompt_LastName  generates a standard output prompt for the Last Name to be entered and returns the user input
     * @return the user input
     */
    public String prompt_LastName() {

        while(!result){

            in = new Scanner(System.in);
            System.out.println("-Last Name-");
            result = in.nextLine().matches(namePattern);

        }

        result = false;
        return in.nextLine();

    }

    /**
     * prompt_LastName  generates a standard output prompt for the Street to be entered and returns the user input
     * @return the user input
     */
    public String prompt_Street() {

        while(!result){

            in = new Scanner(System.in);
            System.out.println("-Street-");
            result = in.nextLine().matches(namePattern);

        }

        result = false;
        return in.nextLine();

    }

    /**
     * prompt_LastName  generates a standard output prompt for the City to be entered and returns the user input
     * @return the user input
     */
    public String prompt_City() {

        while(!result){

            in = new Scanner(System.in);
            System.out.println("-City-");
            result = in.nextLine().matches(namePattern);

        }

        result = false;
        return in.nextLine();

    }

    /**
     * prompt_LastName  generates a standard output prompt for the State to be entered and returns the user input
     * @return the user input
     */
    public String prompt_State() {

        while(!result){

            in = new Scanner(System.in);
            System.out.println("-State-");
            result = in.nextLine().matches(namePattern);

        }

        result = false;
        return in.nextLine();

    }

    /**
     * prompt_LastName  generates a standard output prompt for the Zip to be entered and returns the user input
     * @return the user input
     */
    public int prompt_Zip() {

        while(!result){

            in = new Scanner(System.in);
            System.out.println("-Zip-");
            result = in.nextLine().matches(namePattern);

        }

        result = false;
        return Integer.parseInt(in.nextLine());

    }

    /**
     * prompt_LastName  generates a standard output prompt for the Telephone to be entered and returns the user input
     * @return the user input
     */
    public String prompt_Telephone() {

        while(!result){

            in = new Scanner(System.in);
            System.out.println("-Phone Number-");
            result = in.nextLine().matches(namePattern);

        }

        result = false;
        return in.nextLine();

    }

    /**
     * prompt_LastName  generates a standard output prompt for the Email to be entered and returns the user input
     * @return the user input
     */
    public String prompt_Email() {

        while(!result){

            in = new Scanner(System.in);
            System.out.println("-Email-");
            result = in.nextLine().matches(namePattern);

        }

        result = false;
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
