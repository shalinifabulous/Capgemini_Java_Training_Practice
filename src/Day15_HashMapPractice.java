import java.util.HashMap;
import java.util.Map;

public class Day15_HashMapPractice {

    public static void main(String[] args) {

        System.out.println("Day 15: HashMap Practice");

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Shalini");
        students.put(102, "Rahul");
        students.put(103, "Aditi");

        System.out.println("Student Map: " + students);

        // Access by key
        System.out.println("Student 101: " + students.get(101));

        // Iteration using entrySet
        System.out.println("Iterating Map:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Remove entry
        students.remove(102);
        System.out.println("After Removal: " + students);

        System.out.println("Day 15 Practice Completed");
    }
}