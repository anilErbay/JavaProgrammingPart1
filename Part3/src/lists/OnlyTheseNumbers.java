package lists;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {
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
        System.out.print("From where? ");
        int begin = Integer.parseInt(scanner.nextLine());
        System.out.print("To where? ");
        int end = Integer.parseInt(scanner.nextLine());

        for (int i = begin; i <= end; i++) {
            System.out.println(numbers.get(i));
        }
    }
}
