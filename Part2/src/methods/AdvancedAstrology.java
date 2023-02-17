package methods;

public class AdvancedAstrology {
    // printing stars
    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    // print spaces
    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    // print right leaning triangle
    public static void printTriangle(int size) {
        for (int i = size; i > 0; i--) {
            printSpaces(i - 1);
            printStars(size - i + 1);
        }
    }

    // print a christmas tree
    public static void christmasTree(int height) {
        int spaces = height - 1;
        for (int i = 1; i <= height; i++) {
            printSpaces(spaces);
            printStars(i * 2 - 1);
            spaces--;
        }

        for (int j = 2; j > 0; j--) {
            printSpaces(height - 2);
            printStars(3);
        }

    }

    // main method
    public static void main(String[] args) {
        christmasTree(9);
    }
}
