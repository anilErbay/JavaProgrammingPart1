package usingStrings;

import java.util.ArrayList;
import java.util.Scanner;

public class ListAll737Pilots {
    public static void main(String[] args) {
        // just a practice with using array ,,arrayList , strings
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> pilots = new ArrayList<>();
        ArrayList<String> fleet = new ArrayList<>();

        String pilot = "";
        String plane = "";
        System.out.println("Enter the name and the fleet in order ,seperated by comma (i.e Anil,737): ");
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] parts = input.split(",");
            pilot = parts[0];
            plane = parts[1];
            if (parts[1].equals("737")) {
                fleet.add(plane);
                pilots.add(pilot);
            }
        }

        for (int i = 0; i < pilots.size(); i++) {
            System.out.println("Name: " + pilots.get(i) + ", Fleet: " + fleet.get(i));
        }
    }
}
