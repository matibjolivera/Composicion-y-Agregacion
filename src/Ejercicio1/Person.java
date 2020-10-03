package Ejercicio1;

import java.util.ArrayList;

/**
 * The type Person.
 */
public class Person {

    private String firstname;
    private String lastname;
    private ArrayList<Email> emails;
    private ArrayList<PhoneNumber> phoneNumbers;

    /**
     * Instantiates a new Person.
     *
     * @param firstname the firstname
     * @param lastname  the lastname
     */
    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    /**
     * Gets firstname.
     *
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets firstname.
     *
     * @param firstname the firstname
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Gets lastname.
     *
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets lastname.
     *
     * @param lastname the lastname
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * Gets emails.
     *
     * @return the emails
     */
    public ArrayList<Email> getEmails() {
        return emails;
    }

    /**
     * Sets emails.
     *
     * @param emails the emails
     */
    public void setEmails(ArrayList<Email> emails) {
        this.emails = emails;
    }

    /**
     * Gets phone numbers.
     *
     * @return the phone numbers
     */
    public ArrayList<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    /**
     * Sets phone numbers.
     *
     * @param phoneNumbers the phone numbers
     */
    public void setPhoneNumbers(ArrayList<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    /**
     * Show all.
     */
    public void showAll() {
        System.out.println(this.getLastname() + ", " + this.getFirstname());
        showPhones();
        showEmails();
    }

    private void showPhones() {
        System.out.println("Teléfonos: ");
        for (PhoneNumber phone : this.getPhoneNumbers()) {
            phone.showInfo();
        }
    }

    private void showEmails() {
        System.out.println("Emails: ");
        for (Email email : this.getEmails()) {
            System.out.println(email.getValue());
        }
    }
}
