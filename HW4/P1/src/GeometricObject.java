//GeometricObject.java – The original GeometricObject class
public abstract class GeometricObject implements Comparable <GeometricObject> {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    /** Construct a default geometric object */
    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }

    /** Construct a geometric object with color and filled value */
    protected GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /** Return color */
    public String getColor() {
        return color;
    }

    /** Set a new color */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Return filled. Since filled is boolean, the get method is named isFilled
     */
    public boolean isFilled() {
        return filled;
    }

    /** Set a new filled */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Get dateCreated */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }

    /** Abstract method getArea */
    public abstract double getArea();

    /** Abstract method getPerimeter */
    public abstract double getPerimeter();

    /**
     * Compares two GeometricObjects and returns -1, 0, or 1 depending on which has greater area
     * @param obj GeometricObject being compared to
     * @return Returns -1 if this is less than obj, 0 if they are equal, and 1 if this is greater than obj
     */
    @Override
    public int compareTo(GeometricObject obj) {
        return Double.compare(this.getArea(), obj.getArea());
    }
}