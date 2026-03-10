package M1PracticeQuestions;

import java.util.*;

public class GenerateParenthesesBruteForce {

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        char[] arr = new char[2 * n];

        // Step 1: generate all combinations
        generateAll(arr, 0, result);

        return result;
    }

    // Generates all possible combinations of '(' and ')'
    private static void generateAll(char[] arr, int index, List<String> result) {

        // If string length becomes 2*n, check validity
        if (index == arr.length) {
            if (isValid(arr)) {
                result.add(new String(arr));
            }
            return;
        }

        // Try placing '('
        arr[index] = '(';
        generateAll(arr, index + 1, result);

        // Try placing ')'
        arr[index] = ')';
        generateAll(arr, index + 1, result);
    }

    // Checks if parentheses string is valid
    private static boolean isValid(char[] arr) {
        int balance = 0;

        for (char c : arr) {
            if (c == '(') {
                balance++;
            } else {
                balance--;
            }

            // More ')' than '(' → invalid
            if (balance < 0) {
                return false;
            }
        }

        // At end, balance must be zero
        return balance == 0;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(generateParenthesis(n));
    }
}