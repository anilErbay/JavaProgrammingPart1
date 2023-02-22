package arrays;

public class SumOfArray {

    // method which computes and returns the sum of the numbers in the array
    public static int sumOfNumbersInArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    // main method
    public static void main(String[] args) {
        int[] numbers = {5, 1, 7, 11, 41, 9};

        int sum = sumOfNumbersInArray(numbers);
        System.out.println(sum);
    }
}
