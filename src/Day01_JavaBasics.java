public class Day01_JavaBasics {

    public static void main(String[] args) {

        // Program entry point
        System.out.println("Day 1: Java Basics Practice");

        // ------------------ VARIABLES ------------------
        int age = 21;
        double salary = 35000.75;
        char grade = 'A';
        boolean isTrainingCompleted = false;

        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Training Completed: " + isTrainingCompleted);

        // ------------------ TYPE CASTING ------------------
        // Implicit casting (int → double)
        double updatedSalary = age;
        System.out.println("Implicit Casting Result: " + updatedSalary);

        // Explicit casting (double → int)
        int roundedSalary = (int) salary;
        System.out.println("Explicit Casting Result: " + roundedSalary);

        // ------------------ CONSTANT ------------------
        final int MAX_ATTEMPTS = 3;
        System.out.println("Max Attempts Allowed: " + MAX_ATTEMPTS);

        System.out.println("Day 1 Practice Completed");
    }
}