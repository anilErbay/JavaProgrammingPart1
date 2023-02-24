package car;

import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();

        // empty string will break the loop
        System.out.println("Enter the car info (seperated by a comma) ;");
        while (true) {
            System.out.print("[Manufacturer] , [Model] , [Year] : ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            String[] pieces = input.split(",");
            String manufacturer = pieces[0];
            String model = pieces[1];
            int year = Integer.parseInt(pieces[2]);

            cars.add(new Car(manufacturer, model, year));
        }

        System.out.println();
        System.out.println("Car Database");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println((i + 1) + ") " + cars.get(i));
        }
    }
}
