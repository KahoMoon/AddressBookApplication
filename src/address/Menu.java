package address;

import java.util.Scanner;

/** Menu class currently only has static methods to prompt to standard output information about a Contact like name,etc
 * @author kahom
 * @since 1.00
 **/

class Menu {

    /**
     * generates a standard output prompt for the First Name to be entered and returns the user input
     * @return the user input
     */
    public String prompt_FirstName() {

        Scanner in = new Scanner(System.in);
        System.out.println("First Name: ");
        return in.nextLine();

    }

    /**
     * prompt_LastName  generates a standard output prompt for the Last Name to be entered and returns the user input
     * @return the user input
     */
    public String prompt_LastName() {

        Scanner in = new Scanner(System.in);
        System.out.println("Last Name: ");
        return in.nextLine();

    }

    /**
     * prompt_LastName  generates a standard output prompt for the Street to be entered and returns the user input
     * @return the user input
     */
    public String prompt_Street() {

        Scanner in = new Scanner(System.in);
        System.out.println("Street: ");
        return in.nextLine();

    }

    /**
     * prompt_LastName  generates a standard output prompt for the City to be entered and returns the user input
     * @return the user input
     */
    public String prompt_City() {

        Scanner in = new Scanner(System.in);
        System.out.println("City: ");
        return in.nextLine();

    }

    /**
     * prompt_LastName  generates a standard output prompt for the State to be entered and returns the user input
     * @return the user input
     */
    public String prompt_State() {

        Scanner in = new Scanner(System.in);
        System.out.println("State:");
        return in.nextLine();

    }

    /**
     * prompt_LastName  generates a standard output prompt for the Zip to be entered and returns the user input
     * @return the user input
     */
    public String prompt_Zip() {

        Scanner in = new Scanner(System.in);
        System.out.println("Zip:");
        return in.nextLine();

    }

    /**
     * prompt_LastName  generates a standard output prompt for the Telephone to be entered and returns the user input
     * @return the user input
     */
    public String prompt_Telephone() {

        Scanner in = new Scanner(System.in);
        System.out.println("Telephone:");
        return in.nextLine();

    }

    /**
     * prompt_LastName  generates a standard output prompt for the Email to be entered and returns the user input
     * @return the user input
     */
    public String prompt_Email() {

        Scanner in = new Scanner(System.in);
        System.out.println("Email:");
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
