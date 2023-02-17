package methods;

public class StarSign {
    // printing stars
    public static void printStars(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    // printing a square
    public static void printSquare(int size) {
        for (int i = 1; i <= size; i++) {
            printStars(size);
        }
    }


    // printing a rectangle
    public static void printRectangle(int width, int height) {
        for (int i = 1; i <= height; i++) {
            printStars(width);
        }
    }

    // printing a triangle
    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printStars(i);
        }
    }

    //main method
    public static void main(String[] args) {
        printStars(7);
        printStars(2);
        printStars(5);
        System.out.println("BLOCK");
        printSquare(4);
        System.out.println("BLOCK");
        printRectangle(17, 3);
        System.out.println("BLOCK");
        printTriangle(4);
    }
}
