package lists;

import java.util.ArrayList;

public class ForLoopWithArrayList {

    // Method for generating a list of numbers in a specified range
    public static void generateListOfNumbers(ArrayList<Integer> numbers, int begin, int end) {
        for (int i = begin; i <= end; i++) {
            numbers.add(i);
        }
    }

    // Method for generating a list with even numbers in a specified range
    public static void generateEvensList(ArrayList<Integer> evens, int begin, int end) {
        for (int i = begin; i <= end; i++) {
            if (i % 2 == 0) {
                evens.add(i);
            }
        }
    }

    // main
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<>();
        generateListOfNumbers(myNumbers, 7, 77);
        System.out.println(myNumbers);

        ArrayList<Integer> anEvenList = new ArrayList<>();
        generateEvensList(anEvenList, 0, 80);
        System.out.println(anEvenList);
    }
}
