package arrays;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int howMany = scanner.nextInt();

        int[] numbers = new int[howMany];

        System.out.println("Enter the numbers:");
        int index = 0;
        while (index < numbers.length) {
            numbers[index] = scanner.nextInt();
            index++;
        }

        System.out.println("Here are the numbers again:");
        index = 0;
        while (index < numbers.length) {
            System.out.println(numbers[index]);
            index++;
        }
    }
}
