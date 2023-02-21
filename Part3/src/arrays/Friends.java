package arrays;

import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many 'actual' friends do you have? : ");
        int numFriends = scanner.nextInt();

        String[] friends = new String[numFriends];
        System.out.println("Please manually type first names of your friends");
        for (int i = 0; i < friends.length; i++) {
            friends[i] = scanner.next();
        }

        System.out.println("");
        System.out.println("You have " + numFriends + " friends.");
        System.out.println("They are ;");

        for (String friend : friends) {
            System.out.println(friend);
        }
    }
}
