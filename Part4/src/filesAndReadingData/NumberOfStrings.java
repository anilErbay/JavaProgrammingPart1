package filesAndReadingData;

import java.util.Scanner;

public class NumberOfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        while (true) {
            String input = sc.nextLine();
            if (input.equals("end")) {
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
