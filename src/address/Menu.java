package address;

/** Menu class currently only has static methods to prompt to standard output information about a Contact like name,etc
 * @author kahom
 * @since 1.00
 **/

class Menu {

    /**
     * prompt_FirstName  generates a standard output prompt for the First Name to be entered
     * @return prompt for first name
     */
    public String prompt_FirstName() {

        return "First Name:";

    }

    /**
     * prompt_LastName  generates a standard output prompt for the Last Name to be entered
     * @return prompt for last name
     */
    public String prompt_LastName() {

        return "Last Name:";

    }

    /**
     * prompt_LastName  generates a standard output prompt for the Street to be entered
     * @return prompt for street name
     */
    public String prompt_Street() {

        return "Street:";

    }

    /**
     * prompt_LastName  generates a standard output prompt for the City to be entered
     * @return prompt for name of city
     */
    public String prompt_City() {

        return "City:";

    }

    /**
     * prompt_LastName  generates a standard output prompt for the State to be entered
     * @return prompt for state
     */
    public String prompt_State() {

        return "State:";

    }

    /**
     * prompt_LastName  generates a standard output prompt for the Zip to be entered
     * @return prompt for zip code
     */
    public String prompt_Zip() {

        return "Zip:";

    }

    /**
     * prompt_LastName  generates a standard output prompt for the Telephone to be entered
     * @return prompt for telephone number
     */
    public String prompt_Telephone() {

        return "Telephone:";

    }

    /**
     * prompt_LastName  generates a standard output prompt for the Email to be entered
     * @return prompt for email address
     */
    public String prompt_Email() {

        return "Email:";

    }

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
