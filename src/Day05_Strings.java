public class Day05_Strings {

    public static void main(String[] args) {

        System.out.println("Day 5: String Practice");

        String input = "level";
        String reversed = "";

        // Reverse string manually
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);

        // Palindrome check
        if (input.equals(reversed)) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        // StringBuilder usage
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Practice");
        System.out.println("StringBuilder Output: " + sb);

        System.out.println("Day 5 Practice Completed");
    }
}