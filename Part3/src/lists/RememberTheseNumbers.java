package lists;

import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num == -1) {
                break;
            }
            numbers.add(num);
        }
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}