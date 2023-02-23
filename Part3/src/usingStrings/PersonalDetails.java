package usingStrings;

import java.util.Scanner;

public class PersonalDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        String nameLongest = "";

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] parts = input.split(",");
            sum += Integer.parseInt(parts[1]);
            count++;

            if (parts[0].length() > nameLongest.length()) {
                nameLongest = parts[0];
            }
        }
        System.out.println("Longest name: " + nameLongest);
        System.out.println("Average of the birth years: " + (1.0 * sum / count));
    }
}
