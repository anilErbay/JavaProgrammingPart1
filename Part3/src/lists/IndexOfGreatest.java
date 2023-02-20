package lists;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfGreatest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number == 9999) {
                break;
            }
            list.add(number);
        }
        System.out.println("");

        int greatest = list.get(0);
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > greatest) {
                greatest = list.get(i);
                index = i;
            }
        }
        System.out.println("Greatest number: " + greatest);
        System.out.println("Found at index: " + index);
    }
}
