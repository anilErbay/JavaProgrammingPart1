package moreLoops;

public class Intro {
    public static void main(String[] args) {
        int number = 1;

        while (number < 6) {
            System.out.println(number);
            number++;
        }
        // *****
        // for loop
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // for each loop
        int[] numbers = {1, 3, 5, 7, 9, 11};
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum: " + sum);

        // *****
        for (int i = 0; i <= 10; i++) {
            System.out.print("*");
        }

        System.out.println("");
        // *****
        int start = 3;
        int end = 7;
        for (int i = start; i < end; i++) {
            System.out.println(i);
        }
    }
}
