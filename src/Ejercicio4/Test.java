package Ejercicio4;

public class Test {

    public static void main(String[] args) {
        Building building = new Building();

        for (int i = 0; i < 3; i++) {
            int number = 270 + i;
            int age = 20 + i;

            Address address = new Address("Av. Medrano", ++number, ++i, "A");
            House house = new House(address);

            Person person1 = new Person("Matías", "Olivera", ++age);
            Person person2 = new Person("John", "Doe", ++age);

            Furniture furniture1 = new Furniture("Silla", "madera", "negra");
            Furniture furniture2 = new Furniture("Mesa", "melamina", "blanca");
            Furniture furniture3 = new Furniture("Escritorio", "melamina", "marrón");

            house.addPerson(person1);
            house.addPerson(person2);
            house.addFurniture(furniture1);
            house.addFurniture(furniture2);
            house.addFurniture(furniture3);

            building.addHouse(house);
        }
        building.showInfo();
        building.moveAllFromHouseToAnother(1, "A", 2, "A");
        building.showInfo();
    }
}
