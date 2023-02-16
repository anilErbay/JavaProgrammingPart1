package conditionalStatements;

import java.util.Scanner;

public class Same {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String firstStr = scanner.nextLine();
        System.out.println("Enter the second string:");
        String secondStr = scanner.nextLine();


        if (firstStr.equals(secondStr)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
