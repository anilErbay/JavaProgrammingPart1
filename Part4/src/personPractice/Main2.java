package personPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Person2> persons = new ArrayList<>();

        // a person object can be created first
        Person2 john = new Person2("John");
        // add it to the list
        persons.add(john);

        // person objects can also be created "in the same sentence" that they are added to the list
        persons.add(new Person2("Matthew"));
        persons.add(new Person2("Martin"));

        for (Person2 person : persons) {
            System.out.println(person);
        }
        System.out.println();

        // adding user inputted objects to the list
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person2> persons2 = new ArrayList<>();

        // read names of the persons from the user
        while (true) {
            System.out.print("Enter a name, empty will stop: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            persons2.add(new Person2(name));
        }

        // Print the number of the entered persons, and their individual information
        System.out.println();
        System.out.println("Persons in total: " + persons2.size());
        System.out.println("Persons:");
        for (Person2 person : persons2) {
            System.out.println(person);
        }
    }
}
