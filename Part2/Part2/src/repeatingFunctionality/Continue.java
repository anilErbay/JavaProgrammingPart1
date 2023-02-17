package repeatingFunctionality;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Insert a positive integer");
            int num = Integer.parseInt(scanner.nextLine());

            if (num == 0) {
                break;
            }
            if (num < 0) {
                System.out.println("Unfit number! Try again.");
                continue;
            }
            System.out.println("Your input was " + num);
        }
    }
}
