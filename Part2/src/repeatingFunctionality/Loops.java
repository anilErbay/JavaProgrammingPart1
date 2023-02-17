package repeatingFunctionality;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        int sum = 0;
        System.out.println("Input a number: ");
        sum = sum + Integer.valueOf(scanner.nextLine());

        System.out.println("Input a number: ");
        sum = sum + Integer.valueOf(scanner.nextLine());

        System.out.println("Input a number: ");
        sum = sum + Integer.valueOf(scanner.nextLine());

        System.out.println("Input a number: ");
        sum = sum + Integer.valueOf(scanner.nextLine());

        System.out.println("Input a number: ");
        sum = sum + Integer.valueOf(scanner.nextLine());

        System.out.println("The sum of the numbers is " + sum);
         */

        //it does the job ,but not elegantly...

        // sum of 5 numbers with loops
        int count = 0;
        int sum = 0;

        while (true) {
            if (count == 5) {
                break;
            }

            System.out.println("Input number");
            sum += Integer.parseInt(scanner.nextLine());
            count++;
        }
        System.out.println("The sum of the numbers is " + sum);

        // *****
        int number = 1;
        while (true) {
            System.out.println(number);
            if (number >= 5) {
                break;
            }
            number++;
        }
        System.out.println("READY!");

        // *****

        while (true) {
            System.out.println("Exit ? (y exits)");
            String input = scanner.nextLine();
            if (input.equals("y")) {
                break;
            }
            System.out.println("Ok! Let's carry on!");
        }
        System.out.println("Ready....");

        // ******
        while (true) {
            System.out.println("Input a number, 0 to quit");
            int command = Integer.parseInt(scanner.nextLine());
            if (command == 0) {
                break;
            }
            System.out.println("You input " + command);
        }
        System.out.println("Done, thank you!");
    }
}
