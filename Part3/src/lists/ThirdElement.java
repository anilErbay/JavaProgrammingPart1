package lists;

import java.util.ArrayList;
import java.util.Scanner;

public class ThirdElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> myList = new ArrayList<>();

        while (true) {
            String str = input.nextLine();
            if (str.equals("")) {
                break;
            }
            myList.add(str);
        }
        System.out.println(myList.get(2));
    }
}
