package lists;

import java.util.ArrayList;

public class ReverseList {

    // generate a reversed list in a specified range
    public static void generateReversed(ArrayList<Integer> nums, int begin, int end) {
        for (int i = end; i >= begin; i--) {
            nums.add(i);
        }
    }

    // reverse - odd square
    public static void generateSquareOfOddsReversed(ArrayList<Integer> nums, int begin, int end) {
        for (int i = end; i >= begin; i--) {
            if (i % 2 != 0) {
                nums.add(i * i);
            }
        }
    }

    // main
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        generateReversed(myList, 7, 41);
        System.out.println(myList);

        ArrayList<Integer> oddSquares = new ArrayList<>();
        generateSquareOfOddsReversed(oddSquares, 7, 41);
        System.out.println(oddSquares);
    }
}
