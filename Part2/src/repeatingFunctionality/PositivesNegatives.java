package repeatingFunctionality;

import java.util.Scanner;

public class PositivesNegatives {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positives = 0;
        int negatives = 0;
        while (true) {
            System.out.print("Give a number (0 to stop): ");
            int number = Integer.parseInt(scanner.nextLine());

            if (number == 0) {
                break;
            }

            if (number > 0) {
                positives += 1;
            } else {
                negatives += 1;
            }
        }
        System.out.println("The number of positives : " + positives);
        System.out.println("The number of negatives : " + negatives);
    }
}
