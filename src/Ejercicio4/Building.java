package Ejercicio4;

import java.util.ArrayList;

/**
 * The type Building.
 */
public class Building {
    private ArrayList<House> houses;

    /**
     * Instantiates a new Building.
     */
    public Building() {
        this.houses = new ArrayList<>();
    }

    /**
     * Gets houses.
     *
     * @return the houses
     */
    public ArrayList<House> getHouses() {
        return houses;
    }

    /**
     * Sets houses.
     *
     * @param houses the houses
     */
    public void setHouses(ArrayList<House> houses) {
        this.houses = houses;
    }

    /**
     * Move all from house to another
     *
     * @param floorOrigin      the floor origin
     * @param doorOrigin       the door origin
     * @param floorDestination the floor destination
     * @param doorDestination  the door destination
     */
    public void moveAllFromHouseToAnother(int floorOrigin, String doorOrigin, int floorDestination, String doorDestination) {
        House houseOrigin = this.searchHouse(floorOrigin, doorOrigin);
        House houseDestination = this.searchHouse(floorDestination, doorDestination);
        if (houseOrigin != null && houseDestination != null) {
            movePeople(houseOrigin, houseDestination);
            moveFurnitures(houseOrigin, houseDestination);
            System.out.println("Se ha realizado la mudanza");
        }
    }

    private void movePeople(House houseOrigin, House houseDestination) {
        ArrayList<Person> peopleToMove = houseOrigin.getPeople();
        houseOrigin.removePeople();
        houseDestination.addPeople(peopleToMove);
    }

    private void moveFurnitures(House houseOrigin, House houseDestination) {
        ArrayList<Furniture> furnitureToMove = houseOrigin.getFurnitures();
        houseOrigin.removeFurnitures();
        houseDestination.addFurnitures(furnitureToMove);
    }

    private House searchHouse(int floor, String door) {
        House house = null;
        int i = 0;
        int quantityHouses = getQuantityHouses();

        while (i < quantityHouses && house == null) {
            House tempHouse = this.getHouses().get(i);
            Address address = tempHouse.getAddress();
            if (address.getFloor() == floor && address.getDoor().equals(door)) {
                house = tempHouse;
            } else {
                i++;
            }
        }
        return house;
    }

    private int getQuantityHouses() {
        return this.getHouses().size();
    }

    /**
     * Show info.
     */
    public void showInfo() {
        System.out.println("Viviendas:");
        for (House house : this.getHouses()) {
            house.showInfo();
        }
    }
}
