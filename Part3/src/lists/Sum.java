package lists;

import java.util.ArrayList;

public class Sum {
    // static method to sum all items in the list
    public static int sum(ArrayList<Integer> numbers) {
        if (numbers.size() == 0) {
            return -1;
        }
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        return sum;
    }

    // main method
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(5);
        nums.add(11);
        nums.add(21);
        nums.add(2);
        System.out.println(sum(nums));

        nums.add(41);
        nums.add(77);
        nums.add(0);
        System.out.println(sum(nums));
    }
}
