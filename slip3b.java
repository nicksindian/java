import java.util.Scanner;

abstract class Shape {
    int a, b;
    Shape(int x, int y) {
        a = x;
        b = y;
    }

    abstract double area();
    abstract double volume();
}

class Cone extends Shape {
    Cone(int x, int y) {
        super(x, y); // a = radius, b = slant height
    }

    double area() {
        return Math.PI * a * b;
    }

    double volume() {
        return (1.0 / 3) * Math.PI * a * a * b;
    }
}

class Cylinder extends Shape {
    Cylinder(int x, int y) {
        super(x, y); // a = radius, b = height
    }

    double area() {
        return 2 * Math.PI * a * (a + b);
    }

    double volume() {
        return Math.PI * a * a * b;
    }
}

public class slip3b {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius, Height, and Slant Height:");
        int r = sc.nextInt();
        int h = sc.nextInt();
        int s = sc.nextInt();

        Shape shape;

        shape = new Cone(r, s);
        System.out.printf("Cone - Lateral Area: %.2f\n", shape.area());
        System.out.printf("Cone - Volume: %.2f\n", shape.volume());

        shape = new Cylinder(r, h);
        System.out.printf("Cylinder - Surface Area: %.2f\n", shape.area());
        System.out.printf("Cylinder - Volume: %.2f\n", shape.volume());

        sc.close();
    }
}
