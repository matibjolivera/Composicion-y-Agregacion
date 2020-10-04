package Ejercicio4;

import java.util.ArrayList;

/**
 * The type House.
 */
public class House {

    private Address address;
    private ArrayList<Person> people;
    private ArrayList<Furniture> furnitures;

    /**
     * Instantiates a new House.
     *
     * @param address the address
     */
    public House(Address address) {
        this.address = address;
        this.people = new ArrayList<>();
        this.furnitures = new ArrayList<>();
    }

    /**
     * Gets address.
     *
     * @return the address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * Gets people.
     *
     * @return the people
     */
    public ArrayList<Person> getPeople() {
        return people;
    }

    /**
     * Sets people.
     *
     * @param people the people
     */
    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }

    /**
     * Gets furnitures.
     *
     * @return the furnitures
     */
    public ArrayList<Furniture> getFurnitures() {
        return furnitures;
    }

    /**
     * Sets furnitures.
     *
     * @param furnitures the furnitures
     */
    public void setFurnitures(ArrayList<Furniture> furnitures) {
        this.furnitures = furnitures;
    }

    /**
     * Show info.
     */
    public void showInfo() {
    	System.out.println("--");
        System.out.println("Vivienda: ");

        this.getAddress().showInfo();
        System.out.println();

        this.showPeopleInfo();

        this.showFurnitureInfo();
    }

    private void showPeopleInfo() {
        System.out.println("Personas:");
        for (Person person : this.getPeople()) {
            person.showInfo();
        }
    }

    private void showFurnitureInfo() {
        System.out.println("Muebles:");
        for (Furniture furniture : this.getFurnitures()) {
            furniture.showInfo();
        }
    }

    /**
     * Gets quantity people.
     *
     * @return the quantity people
     */
    public int getQuantityPeople() {
        return this.getPeople().size();
    }

    /**
     * Delete people from house.
     */
    public void removePeople() {
        this.getPeople().clear();
    }

    /**
     * Remove furnitures.
     */
    public void removeFurnitures() {
        this.getFurnitures().clear();
    }

    /**
     * Add person.
     *
     * @param person the person
     */
    public void addPerson(Person person) {
        this.getPeople().add(person);
    }

    /**
     * Add furniture.
     *
     * @param furniture the furniture
     */
    public void addFurniture(Furniture furniture) {
        this.getFurnitures().add(furniture);
    }
}
