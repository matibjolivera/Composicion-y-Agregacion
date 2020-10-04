package Ejercicio2;

import java.util.ArrayList;

/**
 * The type Person.
 */
public class Person {

    private String firstname;
    private String lastname;
    private ArrayList<Email> emails;
    private ArrayList<PhoneNumber> phoneNumbers;
    private ArrayList<Pet> pets;

    /**
     * Instantiates a new Person.
     *
     * @param firstname the firstname
     * @param lastname  the lastname
     */
    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.emails = new ArrayList<>();
        this.phoneNumbers = new ArrayList<>();
        this.pets = new ArrayList<>();
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
        showPets();
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

    /**
     * Gets pets.
     *
     * @return the pets
     */
    public ArrayList<Pet> getPets() {
        return pets;
    }

    /**
     * Sets pets.
     *
     * @param pets the pets
     */
    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }

    /**
     * Add pet.
     *
     * @param pet the pet
     */
    public void addPet(Pet pet) {
        this.getPets().add(pet);
    }

    /**
     * Delete pet.
     *
     * @param pet the pet
     */
    public void deletePet(Pet pet) {
        this.getPets().remove(pet);
    }

    private void showPets() {
        System.out.println("Mascotas: ");
        for (Pet pet : this.getPets()) {
            pet.showInfo();
        }
    }

    /**
     * Add email.
     *
     * @param email the email
     */
    public void addEmail(Email email) {
        this.getEmails().add(email);
    }

    /**
     * Add phone number.
     *
     * @param phoneNumber the phone number
     */
    public void addPhoneNumber(PhoneNumber phoneNumber) {
        this.getPhoneNumbers().add(phoneNumber);
    }
}
