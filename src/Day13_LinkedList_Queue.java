import java.util.LinkedList;
import java.util.Queue;

public class Day13_LinkedList_Queue {

    public static void main(String[] args) {

        System.out.println("Day 13: LinkedList & Queue Practice");

        // LinkedList as List
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.addFirst(5);
        numbers.addLast(30);

        System.out.println("LinkedList: " + numbers);

        numbers.removeFirst();
        numbers.removeLast();

        System.out.println("After removals: " + numbers);

        // LinkedList as Queue
        Queue<String> tasks = new LinkedList<>();
        tasks.offer("Login");
        tasks.offer("Validate");
        tasks.offer("Logout");

        System.out.println("Queue: " + tasks);

        System.out.println("Removed Task: " + tasks.poll());
        System.out.println("Next Task: " + tasks.peek());

        System.out.println("Remaining Tasks: " + tasks);

        System.out.println("Day 13 Practice Completed");
    }
}