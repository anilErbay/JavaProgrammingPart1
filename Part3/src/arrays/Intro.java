package arrays;

import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 42;
        numbers[1] = 13;
        numbers[2] = 12;
        numbers[3] = 7;
        numbers[4] = 1;
        System.out.println(numbers[2]);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Which index should we acces? ");
        int index = scanner.nextInt();

        System.out.println(numbers[index]);

        // assigning array value to a variable
        int numVar = numbers[3];
        System.out.println(numVar);

        // swapping array values
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        int helper = numbers[0];
        numbers[0] = numbers[1];
        numbers[1] = helper;

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        // size and iterating

        int[] numbersArray = new int[4];
        numbersArray[0] = 42;
        numbersArray[1] = 13;
        numbersArray[2] = 12;
        numbersArray[3] = 7;

        index = 0;
        while (index < numbersArray.length) {
            System.out.println(numbersArray[index]);
            index++;
        }

        // ***********************
        String[] arrayOfStrings = {"Matti L.", "Matti P.", "Matti V."};
        double[] arrayOfFloatingpoints = {1.20, 3.14, 100.0, 0.6666666667};
        for (int i = 0; i < arrayOfStrings.length; i++) {
            System.out.println(arrayOfStrings[i] + " " + arrayOfFloatingpoints[i]);
        }
    }
}
