/*
=====================================================
Day 34 - Exception Handling Practice
=====================================================
*/

class InvalidAgeException extends Exception{

    InvalidAgeException(String msg){
        super(msg);
    }
}

public class Day34_ExceptionHandling {

    static void validateAge(int age) throws InvalidAgeException{

        if(age < 18){

            throw new InvalidAgeException("Age must be >= 18");
        }
    }

    public static void main(String[] args) {

        try{

            int a = 10;
            int b = 0;

            int result = a / b;

        }

        catch(ArithmeticException e){

            System.out.println("Division by zero error");
        }

        finally{

            System.out.println("Finally block executed");
        }


        try{

            validateAge(15);
        }

        catch(InvalidAgeException e){

            System.out.println(e.getMessage());
        }
    }
}
