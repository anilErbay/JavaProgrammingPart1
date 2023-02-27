package learningOOP.person;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your name? ");
        String name = scanner.nextLine();
        System.out.print("What's your age? ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("What's your weight? ");
        double weight = Double.parseDouble(scanner.nextLine());
        System.out.print("What's your height? ");
        double height = Double.parseDouble(scanner.nextLine());

        Person person = new Person(name,age,weight,height);

        System.out.println(person);
    }
}
