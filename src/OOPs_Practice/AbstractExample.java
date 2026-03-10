package OOPs_Practice;

public class AbstractExample {
    public static void main(String[] args) {
        Car obj = new UpdatedWagonR();
    }
}

abstract class Car{
    public abstract void drive();
    public void music(){
        System.out.println("Listen");
    }
    public abstract void fly();
}

abstract class WagonR extends Car{
    @Override
    public void drive() {
        System.out.println("Driving...");
    }

    @Override
    public void fly() {
        System.out.println("Flying...");
    }
}

class UpdatedWagonR extends WagonR{

}
