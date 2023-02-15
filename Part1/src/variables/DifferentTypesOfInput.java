package variables;

import java.util.Scanner;

public class DifferentTypesOfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a string:");
        String str = scanner.nextLine();

        System.out.println("Give an integer:");
        int numInt = Integer.parseInt(scanner.nextLine());

        System.out.println("Give a double:");
        double numDouble = Double.parseDouble(scanner.nextLine());

        System.out.println("Give a boolean:");
        boolean boolValue = Boolean.valueOf(scanner.nextLine());

        System.out.println("You gave the string " + str);
        System.out.println("You gave the integer " + numInt);
        System.out.println("You gave the double " + numDouble);
        System.out.println("You gave the boolean " + boolValue);
    }
}
