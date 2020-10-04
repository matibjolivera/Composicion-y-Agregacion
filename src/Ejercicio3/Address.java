package Ejercicio3;

import java.util.ArrayList;

/**
 * The type Address.
 */
public class Address {

    private String street;
    private int number;
    private int floor;
    private String door;

    /**
     * Instantiates a new Address.
     *
     * @param street the street
     * @param number the number
     * @param floor  the floor
     * @param door   the door
     */
    public Address(String street, int number, int floor, String door) {
        this.street = street;
        this.number = number;
        this.floor = floor;
        this.door = door;
    }

    /**
     * Gets street.
     *
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets street.
     *
     * @param street the street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Gets number.
     *
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets number.
     *
     * @param number the number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Gets floor.
     *
     * @return the floor
     */
    public int getFloor() {
        return floor;
    }

    /**
     * Sets floor.
     *
     * @param floor the floor
     */
    public void setFloor(int floor) {
        this.floor = floor;
    }

    /**
     * Gets door.
     *
     * @return the door
     */
    public String getDoor() {
        return door;
    }

    /**
     * Sets door.
     *
     * @param door the door
     */
    public void setDoor(String door) {
        this.door = door;
    }

    /**
     * Show info.
     */
    public void showInfo() {
        System.out.print("Dirección: ");
        System.out.print(this.getStreet() + " " + this.getNumber() + " " +
                           this.getFloor() + "°'" + this.getDoor() + "'");
    }
}
