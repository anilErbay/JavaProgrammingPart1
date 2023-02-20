package lists;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchIndex {
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
        System.out.println("");
        System.out.print("What index you'd like to search for ? ");
        int indexSearch = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbers.size(); i++) {
            if (i == indexSearch) {
                System.out.println("The number at the index " + indexSearch + " is " + numbers.get(i));
            }
        }
    }
}
