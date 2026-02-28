class Employee {
    int id;
    String name;
    double salary;

    // Constructor
    Employee(int id, String name, double salary) {
        this.id = id;        // this keyword usage
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class Day06_ClassesObjects {

    public static void main(String[] args) {

        System.out.println("Day 6: Classes and Objects Practice");

        Employee e1 = new Employee(101, "Shalini", 45000);
        Employee e2 = new Employee(102, "Aman", 40000);

        e1.displayDetails();
        System.out.println("----------------");
        e2.displayDetails();

        System.out.println("Day 6 Practice Completed");
    }
}