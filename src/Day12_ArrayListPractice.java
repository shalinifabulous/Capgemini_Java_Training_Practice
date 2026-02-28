import java.util.ArrayList;
import java.util.Iterator;

public class Day12_ArrayListPractice {

    public static void main(String[] args) {

        System.out.println("Day 12: ArrayList Practice");

        // Creating ArrayList
        ArrayList<String> languages = new ArrayList<>();

        // Adding elements
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");

        System.out.println("Initial List: " + languages);

        // Accessing elements
        System.out.println("First Language: " + languages.get(0));

        // Updating element
        languages.set(2, "C");
        System.out.println("After Update: " + languages);

        // Removing element
        languages.remove("Python");
        System.out.println("After Removal: " + languages);

        // Checking size
        System.out.println("Size of List: " + languages.size());

        // Iteration using for-each
        System.out.println("Using for-each loop:");
        for (String lang : languages) {
            System.out.println(lang);
        }

        // Iteration using Iterator
        System.out.println("Using Iterator:");
        Iterator<String> itr = languages.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Day 12 Practice Completed");
    }
}