package Ejercicio4;

/**
 * The type Furniture.
 */
public class Furniture {

    private String name;
    private String material;
    private String colour;

    /**
     * Instantiates a new Furniture.
     *
     * @param name     the name
     * @param material the material
     * @param colour   the colour
     */
    public Furniture(String name, String material, String colour) {
        this.name = name;
        this.material = material;
        this.colour = colour;
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
     * Gets material.
     *
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Sets material.
     *
     * @param material the material
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * Gets colour.
     *
     * @return the colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * Sets colour.
     *
     * @param colour the colour
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    /**
     * Show info.
     */
    public void showInfo() {
        System.out.println(this.getName() + " de " + this.getMaterial() + " color " + this.getColour());
    }
}
