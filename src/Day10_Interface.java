interface Payment {

    void pay();

    default void paymentStatus() {
        System.out.println("Payment Processing...");
    }

    static void paymentInfo() {
        System.out.println("Payment via Secure Gateway");
    }
}

class UPI implements Payment {

    public void pay() {
        System.out.println("Payment done using UPI");
    }
}

public class Day10_Interface {

    public static void main(String[] args) {

        System.out.println("Day 10: Interface Practice");

        Payment p = new UPI();
        p.pay();
        p.paymentStatus();

        Payment.paymentInfo(); // static method

        System.out.println("Day 10 Practice Completed");
    }
}