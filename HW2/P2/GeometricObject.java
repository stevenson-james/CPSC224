/**
 * Homework #2
 * Program #2
 * @author Maxwell Sherman
 *
 * Abstract GeometricObject object
 */

public abstract class GeometricObject {
    private String color;
    private boolean filled;

    /**
     * Default value constructor
     */
    GeometricObject() {
        this.color = "white";
        this.filled = false;
    }

    /**
     * Explicit value constructor
     * @param color color of geometric object
     * @param filled whether or not geometric object is filled
     */
    GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /**
     * Getter for color
     * @return color of geometric object
     */
    public String getColor() {
        return color;
    }

    /** Set a new color */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Getter for filled
     * @return whether or not geometric object is filled
     */
    public boolean isFilled() {
        return filled;
    }

    /** Set a new filled */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * Calculates area of geometric object
     * @return area of geometric object
     */
    public abstract double getArea();

    /**
     * Calculates perimeter of geometric object
     * @return perimeter of geometric object
     */
    public abstract double getPerimeter();
}
