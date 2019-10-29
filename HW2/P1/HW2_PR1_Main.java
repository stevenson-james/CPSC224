public class HW2_PR1_Main {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        System.out.println("Area of c1 is " + c1.getArea());
        System.out.println("Perimeter of c1 is " + c1.getPerimeter());
        System.out.println("c1 contains (3,3) is " + c1.contains(3,3));
        System.out.println("c1 contains circle with radius 10.5 and center (4,5) is " + c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println("c1 overlaps circle with radius 2.3 and center (3,5) is " + c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
}