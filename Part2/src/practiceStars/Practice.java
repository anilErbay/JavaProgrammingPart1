package practiceStars;

import java.util.Scanner;

public class Practice {
    private static final Scanner scanner = new Scanner(System.in);
    private static boolean loopToogle = true;

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            while (loopToogle) {
                System.out.println("*****  Make a selection from 1 - 4  *****");
                mainMenu();
                System.out.print("Your selection: ");
                System.out.println(" ");
                int inputSelection = Integer.parseInt(scanner.nextLine());
                if (inputSelection == 5) {
                    System.out.println("Thanks...");
                    break;
                }
                if (inputSelection == 1) {
                    System.out.print("Enter number of stars : ");
                    int numStar = Integer.parseInt(scanner.nextLine());
                    printStars(numStar);
                    tryAgain();
                }
                if (inputSelection == 2) {
                    System.out.print("Enter edge-size of a square : ");
                    int size = Integer.parseInt(scanner.nextLine());
                    printSquare(size);
                    tryAgain();
                }
                if (inputSelection == 3) {
                    System.out.print("Enter width and height of the rectangle in this order : ");
                    int width = Integer.parseInt(scanner.nextLine());
                    int height = Integer.parseInt(scanner.nextLine());
                    printRectangle(width,height);
                    tryAgain();
                }
                if (inputSelection == 4) {
                    System.out.print("Height of the triangle : ");
                    int heightTriangle = Integer.parseInt(scanner.nextLine());
                    printTriangle(heightTriangle);
                    tryAgain();
                }
            }
            System.out.println(" ");
        }

        // wanna try again ?
        public static void tryAgain() {
            System.out.print("Wanna try again ? (y/n)");
            String input1 = scanner.nextLine();
            if (input1.equals("n")) loopToogle = false;
        }

        // main menu
        public static void mainMenu(){
            System.out.println("1. Print Stars");
            System.out.println("2. Print Square");
            System.out.println("3. Print Rectangle");
            System.out.println("4. Print Triangle");
            System.out.println("5. Exit");
        }

        // stars
        public static void printStars(int number) {
            for (int i = 1; i <= number; i++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        // square
        public static void printSquare(int size) {
            for (int i = 1; i <= size; i++) {
                printStars(size);
            }
        }

        // triangle
        public static void printTriangle(int height) {
            for (int i = 1; i <= height; i++) {
                printStars(i);
            }
        }

        // rectangle
        public static void printRectangle(int width, int height) {
            for (int i = 1; i <= height; i++) {
                printStars(width);
            }
        }
    }

