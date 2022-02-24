package address.data;

/**
 * AddressEntry class that stores the information pertaining to a single person in the AddressBook
 * @author kahom
 * @since 1.00
 */

public class AddressEntry {

    private String firstName, lastName, street, city, state, phone, email;
    private int zip;

    /**
     * AddressEntry()  initializes all members variables of AddressEntry with appropriate placeholders
     */
    public AddressEntry() {
        firstName = "first";
        lastName = "last";
        street = "street";
        city = "city";
        state = "state";
        phone = "phone";
        email = "email";
        zip = 99999;
    }

    /**
     * AddressEntry(firstName, lastName, street, city, state, zip, phone, email)  initializes the member variables of AddressEntry with given parameters
     * @param firstName the first name of the person
     * @param lastName the last name of the person
     * @param street the street where the person lives
     * @param state the state in which the person resides in
     * @param zip the zip code in which the person resides in
     * @param phone the phone number of the person
     * @param email the email address of the person
     */
    public AddressEntry(String firstName, String lastName, String street, String city, String state, int zip, String email, String phone) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;

    }

    /**
     * toString()  generates a formatted string containing all member variable values
     * @return all the data in the entry seperated by new line
     */
    public String toString() {
        return firstName + "\n" + lastName + "\n" + street + "\n" + city + "\n" + state + "\n" + zip + "\n" + phone + "\n" + email + "\n";
    }

    /**
     * creates a deep copy of other
     * @param other  AddressEntry whose information is to be copied
     */
    public AddressEntry(AddressEntry other) {

        this.firstName = other.firstName;
        this.lastName = other.lastName;
        this.street = other.street;
        this.city = other.city;
        this.state = other.state;
        this.zip = other.zip;
        this.phone = other.phone;
        this.email = other.email;

    }


    /**
     * setFirstName(firstName)  sets firstName
     * @param firstName the name which you are setting as the first name of the entry
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    /**
     * setLastName(lastName)  sets lastName
     * @param lastName the name which you are setting as the last name of the entry
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * setStreet(street)  sets street
     * @param street the street which you are setting as the residence of the entry
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * setCity(city)  sets city
     * @param city the city which you are setting as the residence of the entry
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * setState(state)  sets state
     * @param state the state which you are setting as the residence of the entry
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * setPhone(phone)  sets phone
     * @param phone the phone number which you are setting belonging to the entry
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }


    /**
     * setEmail(email)  sets email
     * @param email the email address which you are setting to the entry
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * setZip(zip)  sets zip
     * @param zip the zip code of the residence of the entry
     */
    public void setZip(int zip) {
        this.zip = zip;
    }

    /**
     * getFirstName()  returns firstName
     * @return the first name of the entry
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * getLastName()  returns lastName
     * @return the last name of the entry
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * getStreet()  returns street
     * @return the street name of the entry
     */
    public String getStreet() {
        return street;
    }

    /**
     * getCity()  returns city
     * @return the city of the entry
     */
    public String getCity() {
        return city;
    }

    /**
     * getState()  returns state
     * @return the state of the entry
     */
    public String getState() {
        return state;
    }

    /**
     * getPhone()  returns phone
     * @return the phone number tied to the entry
     */
    public String getPhone() {
        return phone;
    }

    /**
     * getEmail()  returns email
     * @return the email address tied to the entry
     */
    public String getEmail() {
        return email;
    }

    /**
     * getZip()  returns zip
     * @return the zip code of the entry
     */
    public int getZip() {
        return zip;
    }

}
