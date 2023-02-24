package personPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class readingInputSpecificFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person4> persons = new ArrayList<>();

        System.out.println("Enter the person details separated by a comma, e.g.: Randall,2. ( And empty will stop)");
        while (true) {
            System.out.print("Enter the details: ");
            String details = scanner.nextLine();
            if (details.isEmpty()) {
                break;
            }
            String[] parts = details.split(",");
            String name = parts[0];
            int age = Integer.parseInt(parts[1]);
            persons.add(new Person4(name, age));
        }

        System.out.println();
        System.out.println("Total number of persons: " + persons.size());
        System.out.println("Persons: ");

        for (Person4 person : persons) {
            System.out.println(person);
        }

        System.out.println();
        // filtered printing from the list
        System.out.print("What is the age limit? ");
        int ageLimit = Integer.parseInt(scanner.nextLine());
        for (Person4 person : persons) {
            if (person.getAge() >= ageLimit) {
                System.out.println(person);
            }
        }
    }
}
