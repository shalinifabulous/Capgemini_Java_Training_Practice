package M1PracticeQuestions;

import java.util.HashSet;

public class CompareSubstring {
    public static boolean hasCommonChar(String a, String b){
        HashSet<Character> set = new HashSet<>();

        for(char ch : a.toCharArray()){
            set.add(ch);
        }

        for (char ch : b.toCharArray()){
            if(set.contains(ch)) return true;
        }
        return false;
    }

    public static void main(String[] args) {

        String[] a = {"ab","cd","ef"};
        String[] b = {"af","ee","ef"};

        for(int i = 0; i < a.length; i++) {

            if(hasCommonChar(a[i], b[i]))
                System.out.println("YES");
            else
                System.out.println("NO");

        }
    }
}
