package moreLoops;

import java.util.Scanner;

public class ProgramStructure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write numbers,negative numbers are invalid: ");
        int sum = 0;
        int validNumbers = 0;
        int invalidNumbers = 0;

        while (true) {
            int numberInput = Integer.parseInt(scanner.nextLine());

            if (numberInput == 0) {
                break;
            }
            if (numberInput < 0) {
                invalidNumbers++;
                continue;
            }
            sum += numberInput;
            validNumbers++;
        }
        System.out.println("Sum of valid numbers: " + sum);
        System.out.println("Valid numbers: " + validNumbers);
        System.out.println("Invalid numbers: " + invalidNumbers);

    }
}
