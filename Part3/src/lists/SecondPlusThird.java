package lists;

import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbersList = new ArrayList<>();

        while (true) {
            int numberInput = input.nextInt();
            if (numberInput == 0) {
                break;
            }
            numbersList.add(numberInput);
        }
        System.out.println(numbersList.get(1) + numbersList.get(2));
    }
}
