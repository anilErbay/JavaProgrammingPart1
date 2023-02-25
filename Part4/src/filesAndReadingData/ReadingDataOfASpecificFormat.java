package filesAndReadingData;

import java.util.Scanner;

public class ReadingDataOfASpecificFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter name and age (,): ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] parts = input.split(",");
            String name = parts[0];
            int age = Integer.parseInt(parts[1]);

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }
}
/*
Reading the same data from a file called records.txt would look like so:
try (Scanner scanner = new Scanner(Paths.get("records.txt"))) {

    while (scanner.hasNextLine()) {
        String line = scanner.nextLine();

        String[] parts = line.split(",");
        String name = parts[0];
        int age = Integer.valueOf(parts[1]);

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
 */
