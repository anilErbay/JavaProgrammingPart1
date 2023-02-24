package plane;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Plane> fleet = new ArrayList<>();

        // empty string in manufacturer will end the loop
        while (true) {
            System.out.print("Manufacturer: ");
            String manufacturer = scanner.nextLine();
            if (manufacturer.isEmpty()) {
                break;
            }
            System.out.print("Model: ");
            String model = scanner.nextLine();
            System.out.print("Registration: ");
            String registration = scanner.nextLine();
            System.out.print("Production Date: ");
            LocalDate productionDate = LocalDate.parse(scanner.nextLine());

            fleet.add(new Plane(manufacturer, model, registration, productionDate));
        }

        System.out.println();

        // choose what to print out
        System.out.print("What information you would like to display ? (Enter one of - > all/manufacturer/model/registration/production date)");
        String displayInfo = scanner.nextLine();

        if (displayInfo.toLowerCase().equals("all")) {
            for (Plane plane : fleet) {
                System.out.println(plane);
            }
        }
        if (displayInfo.toLowerCase().equals("manufacturer")) {
            for (Plane plane : fleet) {
                System.out.println(plane.getManufacturer());
            }
        }
        if (displayInfo.toLowerCase().equals("registraion")) {
            for (Plane plane : fleet) {
                System.out.println(plane.getRegistration());
            }
        }
        if (displayInfo.toLowerCase().equals("production date")) {
            for (Plane plane : fleet) {
                System.out.println(plane.getProductionYear());
            }
        }
    }
}
