package filesAndReadingData;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String fileName = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.parseInt(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.parseInt(scanner.nextLine());

        ArrayList<Integer> numbers = new ArrayList<>();

        try (Scanner input = new Scanner(Paths.get(fileName))) {
            while (input.hasNextLine()) {
                int num = Integer.parseInt(input.nextLine());
                if (num >= lowerBound && num <= upperBound) {
                    numbers.add(num);
                }
            }
        } catch (Exception e) {
            System.out.println("Error Message : " + e.getMessage());
        }

        System.out.print("Numbers: " + numbers.size());
    }
}
