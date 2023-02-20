package lists;

import java.util.ArrayList;
import java.util.Scanner;

public class ListSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        while (true) {
            String str = scanner.nextLine();
            if (str.equals("")) {
                break;
            }
            words.add(str);
        }
        System.out.println("In total: " + words.size());
    }
}
