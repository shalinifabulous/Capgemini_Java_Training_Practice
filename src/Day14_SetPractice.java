import java.util.HashSet;
import java.util.TreeSet;

public class Day14_SetPractice {

    public static void main(String[] args) {

        System.out.println("Day 14: Set Practice");

        // HashSet example
        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(10); // duplicate
        hs.add(30);

        System.out.println("HashSet Output (No Order, No Duplicates):");
        System.out.println(hs);

        // TreeSet example
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(40);
        ts.add(10);
        ts.add(30);
        ts.add(20);

        System.out.println("TreeSet Output (Sorted):");
        System.out.println(ts);

        System.out.println("First Element: " + ts.first());
        System.out.println("Last Element: " + ts.last());

        System.out.println("Day 14 Practice Completed");
    }
}