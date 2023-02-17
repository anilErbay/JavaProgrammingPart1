package methods;

public class Greatest {
    // method
    public static int greatest(int number1, int number2, int number3) {
        int greatest;
        if (number1 > number2 && number1 > number3) {
            greatest = number1;
        } else if (number2 > number1 && number2 > number3) {
            greatest = number2;
        } else {
            greatest = number3;
        }
        return greatest;
    }

    // main method
    public static void main(String[] args) {
        int answer = greatest(2, 7, 14);
        System.out.println("Greatest: " + answer);
    }
}
