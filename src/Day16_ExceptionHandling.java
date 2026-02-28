public class Day16_ExceptionHandling {

    public static void main(String[] args) {

        System.out.println("Day 16: Exception Handling Practice");

        try {
            int a = 10;
            int b = 0;

            int result = a / b; // ArithmeticException
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Exception Caught: Division by zero");

        } finally {
            System.out.println("Finally block executed");
        }

        System.out.println("Program continues after exception");

        System.out.println("Day 16 Practice Completed");
    }
}