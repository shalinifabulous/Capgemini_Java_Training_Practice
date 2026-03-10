package org.example;

public class StringProcessor {
    private final String b;
    private final String a;

    public StringProcessor(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public String concatenate(String a, String b){
        if(a == null || b == null){
            throw new IllegalArgumentException("Strings cannot be null");
        }
        return a+b;
    }

    public boolean isPalindrome(String str){
        if(str == null){
            return false;
        }
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
