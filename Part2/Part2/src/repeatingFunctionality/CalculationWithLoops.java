package repeatingFunctionality;

import java.util.Scanner;

public class CalculationWithLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // task is to keep count of 1's
        int ones = 0;

        // task is to read input from the user
        while (true) {
            System.out.println("Input a number (0 exits): ");
            int num = Integer.parseInt(scanner.nextLine());

            // task is to exit the loop if user inputs 0
            if (num == 0) {
                break;
            }

            // task is to increase the amount of 1's
            if (num == 1) {
                ones += 1;
            }
        }
        // task is to print out the total of ones
        System.out.println("The total of ones: " + ones);
    }
}
