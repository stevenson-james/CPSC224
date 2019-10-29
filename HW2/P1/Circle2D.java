public class Circle2D {
    final double pi = 3.14159;
    double x = 0.0;
    double y = 0.0;
    double radius = 1.0;

    Circle2D() {
    }

    Circle2D(double newX, double newY, double newRadius) {
        x = newX;
        y = newY;
        radius = newRadius;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    double getRadius() {
        return radius;
    }

    double getArea() {
        return Math.pow(radius, 2) * pi;
    }

    double getPerimeter() {
        return 2 * pi * radius;
    }

    boolean contains(double x, double y) {
        return (x <= (Math.abs(this.x) + this.radius) && y <= (Math.abs(this.y) + this.radius));
    }

    boolean contains(Circle2D circle) {
        double distance = Math.pow(Math.pow(this.x + circle.getX(), 2) + Math.pow(this.y + circle.getY(), 2), 1/2);
        return distance + circle.getRadius() < this.radius;
    }

    boolean overlaps(Circle2D circle) {
        double rad1 = this.radius;
        double rad2 = circle.getRadius();
        double distanceSquared = Math.pow(this.x + circle.getX(), 2) + Math.pow(this.y + circle.getY(), 2);
        return distanceSquared >= Math.pow(rad1 - rad2, 2) && distanceSquared <= Math.pow(rad1 + rad2, 2);
    }
}
