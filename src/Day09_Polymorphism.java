class Shape {

    void draw() {
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape {

    void draw() {
        System.out.println("Drawing Circle");
    }

    void area() {
        System.out.println("Area = πr²");
    }
}

public class Day09_Polymorphism {

    public static void main(String[] args) {

        System.out.println("Day 9: Polymorphism Practice");

        // Upcasting
        Shape s = new Circle();
        s.draw();

        // Downcasting
        Circle c = (Circle) s;
        c.area();

        System.out.println("Day 9 Practice Completed");
    }
}