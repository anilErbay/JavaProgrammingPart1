package arrays;

public class PrintInStars {

    // print stars  method
    public static void printArrayInStars(int[] array) {
        for (int value : array) {
            for (int i = 1; i <= value; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // main method
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);

        System.out.println(" 0000000000000000000000");

        printStarsArray(array);
    }


    // **********
    // or this is another way with two for loops instead of for each
    public static void printStarsArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j <= array[i]; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
