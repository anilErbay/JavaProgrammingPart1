package personPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person4> persons = new ArrayList<>();

        while (true) {
            System.out.print("Enter name , empty will end: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.print("Enter the age of the person " + name + ": ");
            int age = Integer.parseInt(scanner.nextLine());

            persons.add(new Person4(name, age));
        }

        System.out.println();
        System.out.println("Total number of persons: " + persons.size());
        System.out.println("Persons: ");

        for (Person4 person : persons) {
            System.out.println(person);
        }
    }
}
