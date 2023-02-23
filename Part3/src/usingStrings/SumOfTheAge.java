package usingStrings;

import java.util.Scanner;

public class SumOfTheAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            sum += Integer.parseInt(parts[1]);
            count++;
        }

        if (count > 0) {
            System.out.println("The average: " + (1.0 * sum / count));
        } else {
            System.out.println("No input.");
        }
    }
}
