package objectsAndReferences.dateInJava;

import java.time.LocalDate;

public class Example {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int month = now.getMonthValue();
        int day = now.getDayOfYear();

        System.out.println("today is " + day + "." + month + "." + year);
    }
}
