package variables;

import java.util.Scanner;

public class IntegerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a value");
        int value = Integer.parseInt(scanner.nextLine());
        /*
        or
        int value = Integer.valueOf(scanner.nextLine());
         */
        System.out.println("You wrote " + value);
    }
}
