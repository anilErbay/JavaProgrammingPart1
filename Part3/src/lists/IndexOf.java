package lists;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num == -1) {
                break;
            }
            list.add(num);
        }
        System.out.println("");
        System.out.print("Search for? ");
        int searchNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == searchNumber) {
                System.out.println(searchNumber + " is at index " + i);
            }
        }
    }
}
