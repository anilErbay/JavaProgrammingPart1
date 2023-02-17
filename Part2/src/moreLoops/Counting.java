package moreLoops;

import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= number; i++) {
            System.out.println(i);
        }


        /* or with while loop
        while (i <= number) {
            System.out.println(i);
            i++;
        }
        */
    }
}
