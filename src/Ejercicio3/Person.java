package Ejercicio3;

/**
 * The type Person.
 */
public class Person {

    private String firstname;
    private String lastname;
    private int age;

    /**
     * Instantiates a new Person.
     *
     * @param firstname the firstname
     * @param lastname  the lastname
     * @param age       the age
     */
    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
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
     * Gets age.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets age.
     *
     * @param age the age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Show info.
     */
    public void showInfo() {
        System.out.println("Nombre: " + this.getFirstname() + ", " + this.getLastname() +
                           ", Edad: " + this.getAge());
    }
}
