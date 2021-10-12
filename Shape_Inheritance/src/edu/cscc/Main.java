package edu.cscc;

public class Main {
    public static void main(String[] args) {

        Location loc_a = new Location(10, 20);
        Location loc_b = new Location(-10, 20);

        Circle circle = new Circle(loc_a, "MyCircle", 3.0);
        System.out.println(circle.toString() + "\n" +
                "The area of " + circle.getName() + " is " + circle.area());

        Triangle triangle = new Triangle(loc_b, "MyTriangle", 25.0, 40.0);
        System.out.println(triangle.toString() + "\n" +
                "The area of " + triangle.getName() + " is " + triangle.area());

    }
}
