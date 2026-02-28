public class Day04_Arrays {

    public static void main(String[] args) {

        System.out.println("Day 4: Array Practice");

        // ------------------ 1D ARRAY ------------------
        int[] marks = {85, 90, 78, 92};

        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
            System.out.println("Marks[" + i + "] = " + marks[i]);
        }

        System.out.println("Total Marks: " + sum);
        System.out.println("Average Marks: " + (sum / marks.length));

        // ------------------ 2D ARRAY ------------------
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("2D Array Output:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Day 4 Practice Completed");
    }
}