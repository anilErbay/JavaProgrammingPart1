package methods;

public class FromOneToParameter {
    public static void main(String[] args) {
        printUntilNumber(7);
    }

    // print the numbers from 1 to the parameter
    public static void printUntilNumber(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }
}
