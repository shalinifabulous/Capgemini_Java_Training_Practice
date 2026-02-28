public class Day03_Loops {

    public static void main(String[] args) {

        System.out.println("Day 3: Loop Practice");

        // ------------------ FOR LOOP ------------------
        for (int i = 1; i <= 5; i++) {
            System.out.println("For Loop Count: " + i);
        }

        // ------------------ WHILE LOOP ------------------
        int num = 5;
        while (num > 0) {
            System.out.println("While Loop Count: " + num);
            num--;
        }

        // ------------------ DO-WHILE LOOP ------------------
        int x = 1;
        do {
            System.out.println("Do-While Executed: " + x);
            x++;
        } while (x <= 3);

        // ------------------ BREAK & CONTINUE ------------------
        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                continue; // skip 4
            }
            if (i == 8) {
                break; // stop loop
            }
            System.out.println("Value: " + i);
        }

        System.out.println("Day 3 Practice Completed");
    }
}