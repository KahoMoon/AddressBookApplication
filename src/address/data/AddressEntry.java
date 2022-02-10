package address.data;

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
     */
    public AddressEntry(String firstName, String lastName, String street, String city, String state, int zip, String phone, String email) {

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
     */
    public String toString() {
        return firstName + "\n" + lastName + "\n" + street + "\n" + city + "\n" + state + "\n" + zip + "\n" + phone + "\n" + email + "\n";
    }

    /**
     * AdressEntry(other)  creates a deep copy of other
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
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    /**
     * setLastName(lastName)  sets lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * setStreet(street)  sets street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * setCity(city)  sets city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * setState(state)  sets state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * setPhone(phone)  sets phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }


    /**
     * setEmail(email)  sets email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * setZip(zip)  sets zip
     */
    public void setZip(int zip) {
        this.zip = zip;
    }

    /**
     * getFirstName()  returns firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * getLastName()  returns lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * getStreet()  returns street
     */
    public String getStreet() {
        return street;
    }

    /**
     * getCity()  returns city
     */
    public String getCity() {
        return city;
    }

    /**
     * getState()  returns state
     */
    public String getState() {
        return state;
    }

    /**
     * getPhone()  returns phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * getEmail()  returns email
     */
    public String getEmail() {
        return email;
    }

    /**
     * getZip()  returns zip
     */
    public int getZip() {
        return zip;
    }

}
