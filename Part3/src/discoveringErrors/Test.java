package discoveringErrors;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int values = 0;
        int sum = 0;

        // try to find the bug

        while (true) {
            System.out.println("-- values: " + values + ", sum: " + sum);

            System.out.println("Provide a value, a negative value ends the program");
            int value = Integer.valueOf(scanner.nextLine());
            if (value < 0) {
                System.out.println("-- value is negative, exiting loop");
                break;
            }

            values = values + 1;
            sum = sum + value;
        }

        System.out.println("-- loop exited");
        System.out.println("-- values: " + values + ", sum: " + sum);

        if (sum == 0) {
            System.out.println("The average of the values could not be calculated.");
        } else {
            System.out.println("Average of values: " + (1.0 * sum / values));
        }
    }
}
