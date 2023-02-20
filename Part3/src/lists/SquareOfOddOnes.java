package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SquareOfOddOnes {
    // calculate the square of odd numbers in an arrayList
    public static void squareOfOdds(ArrayList<Integer> numbers) {
        for (Integer num : numbers) {
            if (num % 2 != 0) {
                System.out.println("Square of " + num + " is : " + num * num);
            }
        }
    }

    // main method
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
        squareOfOdds(numbers);

        System.out.println("*****************");

        // let's ask user to enter integers and apply the method we defined above
        // enter 0 to exit
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();
        while (true) {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            numberList.add(number);
        }

        squareOfOdds(numberList);
    }
}
