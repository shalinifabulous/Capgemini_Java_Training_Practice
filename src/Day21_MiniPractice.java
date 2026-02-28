import java.util.ArrayList;

public class Day21_MiniPractice {

    public static void main(String[] args) {

        System.out.println("Day 21: Mini Practice Project");

        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(80);
        marks.add(90);
        marks.add(70);

        int total = 0;
        for (int m : marks) {
            total += m;
        }

        double average = total / marks.size();
        System.out.println("Average Marks: " + average);

        if (average >= 75) {
            System.out.println("Grade: Distinction");
        } else {
            System.out.println("Grade: Pass");
        }

        System.out.println("Day 21 Practice Completed");
    }
}