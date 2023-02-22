package arrays;

public class PrintNeatly {

    public static void printNeatly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + " ,");

            }
        }
    }
    /*
    this one works too for the method above
    if (i != array.length-1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
     */

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2, 11, 6, 19};
        printNeatly(array);
    }
}
