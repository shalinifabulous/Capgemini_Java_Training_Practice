public class Day02_Operators_ControlStatements {

    public static void main(String[] args) {

        System.out.println("Day 2: Operators & Control Statements");

        int a = 15;
        int b = 10;

        // ------------------ ARITHMETIC OPERATORS ------------------
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // ------------------ RELATIONAL OPERATORS ------------------
        System.out.println("a > b : " + (a > b));
        System.out.println("a == b : " + (a == b));

        // ------------------ LOGICAL OPERATORS ------------------
        boolean result = (a > b) && (b > 5);
        System.out.println("Logical AND Result: " + result);

        // ------------------ IF-ELSE ------------------
        if (a % 2 == 0) {
            System.out.println("a is Even");
        } else {
            System.out.println("a is Odd");
        }

        // ------------------ SWITCH ------------------
        int choice = 2;
        switch (choice) {
            case 1:
                System.out.println("Selected Java");
                break;
            case 2:
                System.out.println("Selected Python");
                break;
            default:
                System.out.println("Invalid Choice");
        }

        System.out.println("Day 2 Practice Completed");
    }
}