public class HW2_PR2_Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1,1.5,1);
        triangle.setColor("yellow");
        triangle.setFilled(true);
        System.out.println("Area is " + triangle.getArea());
        System.out.println("Perimeter is " + triangle.getPerimeter());
        System.out.println("Color is " + triangle.getColor());
        System.out.println("The triangle is filled is " + triangle.isFilled());
    }
}
