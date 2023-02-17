package moreLoops;

import java.util.Scanner;

public class RepeatingBreakingRemembering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");
        int sum = 0;
        int count = 0;
        int evens = 0;
        int odds = 0;
        while (true) {
            int numberInput = Integer.parseInt(scanner.nextLine());
            if (numberInput == -1) {
                break;
            }
            sum += numberInput;
            count++;

            if (numberInput % 2 == 0) {
                evens++;
            } else {
                odds++;
            }
        }

        double avg = 1.0 * sum / count;
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + evens);
        System.out.println("Odd: " + odds);
    }
}
