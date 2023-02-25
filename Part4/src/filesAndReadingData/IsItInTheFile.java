package filesAndReadingData;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        System.out.println("Search for:");
        String searchedName = scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();

        // read the file and add it to the list
        try (Scanner input = new Scanner(Paths.get(fileName))) {
            while (input.hasNextLine()) {
                String line = input.nextLine();
                list.add(line);
            }
            if (list.contains(searchedName)) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }

        } catch (Exception e) {
            System.out.println("Reading the file " + fileName + " failed.");
        }
    }
}
