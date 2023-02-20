package lists;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        int sum = 0;
        int count = 0;
        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            sum += num;
            count++;
        }
        System.out.println("");
        System.out.println("Average:" + (1.0 * sum / count));
    }
}
