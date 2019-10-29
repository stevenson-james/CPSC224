public class Triangle extends GeometricObject {
    private double side1, side2, side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double newSide1, double newSide2, double newSide3) {
        this.side1 = newSide1;
        this.side2 = newSide2;
        this.side3 = newSide3;
    }

    public double getSide1(){
        return side1;
    }

    public double getSide2(){
        return side2;
    }

    public double getSide3(){
        return side3;
    }

    public double getArea() {
        double halfPerimeter = getPerimeter() / 2.0;
        return Math.pow(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3), .5);
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}
