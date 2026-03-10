package M1PracticeQuestions;

public class InversionProgram {

    // function to count inversions
    public static int countInversions(String s) {

        int ones = 0;
        int inversions = 0;

        for(int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == '1') {
                ones++;
            }
            else {
                inversions += ones;
            }
        }

        return inversions;
    }

    public static int minInversion(String data, int maxFlip) {

        int minInv = countInversions(data);

        char[] arr = data.toCharArray();

        for(int i = 0; i < arr.length; i++) {

            char original = arr[i];

            // flip bit
            arr[i] = (arr[i] == '0') ? '1' : '0';

            String newStr = new String(arr);

            int inv = countInversions(newStr);

            minInv = Math.min(minInv, inv);

            // restore original
            arr[i] = original;
        }

        return minInv;
    }

    public static void main(String[] args) {

        String data1 = "0110";
        int maxFlip1 = 2;

        String data2 = "00111";
        int maxFlip2 = 4;

        String data3 = "1100";
        int maxFlip3 = 1;

        System.out.println(minInversion(data1, maxFlip1));
        System.out.println(minInversion(data2, maxFlip2));
        System.out.println(minInversion(data3, maxFlip3));
    }
}