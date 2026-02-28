interface Calculator {
    int operate(int a, int b);
}

public class Day20_LambdaExpression {

    public static void main(String[] args) {

        System.out.println("Day 20: Lambda Practice");

        Calculator add = (a, b) -> a + b;
        Calculator multiply = (a, b) -> a * b;

        System.out.println("Addition: " + add.operate(10, 20));
        System.out.println("Multiplication: " + multiply.operate(5, 4));

        System.out.println("Day 20 Practice Completed");
    }
}