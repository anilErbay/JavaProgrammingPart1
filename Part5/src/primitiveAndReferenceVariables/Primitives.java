package primitiveAndReferenceVariables;

public class Primitives {
    public static void main(String[] args) {
        // java has 8 different primitive variables
        boolean isOn = true;      // or false
        byte x = 7;               // a byte containing 8 bits, between the values -128 and 127
        char character = 'c';     // a 16-bit value representing a single character
        short y = 1231;           // a 16-bit value that represents a small integer, between the values -32768 and 32767
        int num = 238120931;      // a 32-bit value that represents a medium-sized integer, between the values -2^31 and 2^31-1
        long longNum = 231232224; // a 64-bit value that represents a large integer, between values -2^63 and 2^63-1
        float fNum = 2.33225122F; // a floating-point number that uses 32 bits
        double dNum = 3.12312312; // a floating-point number that uses 64 bits

        int number = 1;
        call(number);
        System.out.println("Number still: " + number);
    }
    public static void call(int number) {
        System.out.println("Number in the beginning: " + number);
        number = number + 1;
        System.out.println("Number in the end: " + number);
    }
}
