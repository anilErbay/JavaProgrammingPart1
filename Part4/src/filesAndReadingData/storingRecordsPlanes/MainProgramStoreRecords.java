package filesAndReadingData.storingRecordsPlanes;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class MainProgramStoreRecords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File name: ");
        String fileName = scanner.nextLine();

        ArrayList<Plane> fleetData = readDataFromFile(fileName);
        System.out.println("Fleet Size: " + fleetData.size());
        System.out.println("Fleet");
        for (Plane plane : fleetData) {
            System.out.println(plane);
        }
    }


    public static ArrayList<Plane> readDataFromFile(String fileName) {
        ArrayList<Plane> fleet = new ArrayList<>();
        try (Scanner input = new Scanner(Paths.get(fileName))) {
            while (input.hasNextLine()) {
                String line = input.nextLine();

                String[] parts = line.split(",");
                String manufacturer = parts[0];
                String model = parts[1];
                int productionYear = Integer.parseInt(parts[2]);

                fleet.add(new Plane(manufacturer, model, productionYear));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return fleet;
    }
}
