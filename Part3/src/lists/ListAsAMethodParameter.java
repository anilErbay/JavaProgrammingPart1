package lists;

import java.util.ArrayList;

public class ListAsAMethodParameter {

    // print items (string)
    public static void print(ArrayList<String> list) {
        for (String value : list) {
            System.out.println(value);
        }
    }

    // print smaller than
    public static void printSmallerThan(ArrayList<Integer> numbers, int threshold) {
        for (Integer num : numbers) {
            if (num < threshold) {
                System.out.println(num);
            }
        }
    }

    // method with return value
    public static int size(ArrayList<Integer> numbers) {
        return numbers.size();
    }

    // another one
    public static double average(ArrayList<Integer> numbers) {
        if (numbers.size() == 0) {
            return -1;
        }
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        return 1.0 * sum / numbers.size();
    }


    public static void main(String[] args) {
        ArrayList<String> myTeam = new ArrayList<>();
        myTeam.add("Jax");
        myTeam.add("Ope");
        myTeam.add("Bobby");
        myTeam.add("Tig");

        print(myTeam);

        // printSmallerThan
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(11);
        numbers.add(17);
        numbers.add(9);
        numbers.add(21);
        numbers.add(8);
        printSmallerThan(numbers, 9);

        // size
        int sizeOfNumbersList = size(numbers);
        System.out.println(sizeOfNumbersList);

        double avg = average(numbers);
        System.out.println(avg);
    }
}
