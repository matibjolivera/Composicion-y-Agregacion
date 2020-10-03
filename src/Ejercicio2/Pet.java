package Ejercicio2;

/**
 * The type Pet.
 */
public class Pet {

    private String name;
    private String animalType;

    /**
     * Instantiates a new Pet.
     *
     * @param name       the name
     * @param animalType the animal type
     */
    public Pet(String name, String animalType) {
        this.name = name;
        this.animalType = animalType;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets animal type.
     *
     * @return the animal type
     */
    public String getAnimalType() {
        return animalType;
    }

    /**
     * Sets animal type.
     *
     * @param animalType the animal type
     */
    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public void showInfo() {
        System.out.println(this.getAnimalType() + ", " + this.getName());
    }
}
