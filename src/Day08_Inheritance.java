class Vehicle {

    int speed = 60;

    void display() {
        System.out.println("Vehicle speed: " + speed);
    }
}

class Bike extends Vehicle {

    int speed = 100;

    void display() {
        System.out.println("Bike speed: " + speed);
        System.out.println("Vehicle speed using super: " + super.speed);
    }
}

public class Day08_Inheritance {

    public static void main(String[] args) {

        System.out.println("Day 8: Inheritance Practice");

        Bike bike = new Bike();
        bike.display();

        System.out.println("Day 8 Practice Completed");
    }
}