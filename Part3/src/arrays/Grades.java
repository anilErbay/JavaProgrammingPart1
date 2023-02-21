package arrays;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        // calculate the pass or fail
        // m1 = midterm 1 , m2 = midterm 2, fin = final exam. (m1 %30 ,m2 %30, fin %40)

        Scanner input = new Scanner(System.in);
        double[] grades = new double[3];
        System.out.println("Enter your grades in order (m1 ,m2 ,fin): ");
        int index = 0;
        while (index < grades.length) {
            grades[index] = input.nextDouble();
            index++;
        }
        double m1Percent = grades[0] * 0.3;
        double m2Percent = grades[1] * 0.3;
        double finPercent = grades[2] * 0.4;

        if (m1Percent + m2Percent + finPercent >= 70) {
            System.out.println("You passed!");
        } else {
            System.out.println("Failed... =/");
        }
    }
}
