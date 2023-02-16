package conditionalStatements;

import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number = 11;
        if (number > 10) {
            System.out.println("The number was greater than 10");
        }

        boolean isItTrue = true;
        if (isItTrue) {
            System.out.println("Pretty wild!");
        }
        int first = 1;
        int second = 3;
        boolean isGreater = first > second;
        System.out.println(isGreater);

        // modulo operator (remainder)
        int remainder = 7 % 2;
        System.out.println(remainder); // prints 1
        System.out.println(5 % 3); // prints 2
        System.out.println(7 % 4); // prints 3
        System.out.println(8 % 4); // prints 0
        System.out.println(1 % 2); // prints 1

        // *****
        int numberInput = Integer.valueOf(reader.nextLine());
        int remainderFrom400 = number % 400;

        if (remainderFrom400 == 0) {
            System.out.println("The number " + numberInput + " is divisible by four hundred.");
        } else {
            System.out.println("The number " + numberInput + " is not divisible by four hundred.");
        }

        // *****
        System.out.println(7 % 5);

        // comparing strings
        /*
        When comparing strings we use the equals-command, which is related to string variables. The command works in the following way:
        */
        System.out.println("Enter a string:");
        String inputStr = reader.nextLine();

        if (inputStr.equals("a string")) {
            System.out.println("Great! You read the instructions correctly.");
        } else {
            System.out.println("Missed the mark!");
        }

    }
}
