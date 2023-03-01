package objectsAndReferences.archive;

import java.util.ArrayList;
import java.util.Scanner;

public class ArchiveProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            Item inputItem = new Item(identifier, name);

            if (!items.contains(inputItem)) {
                items.add(inputItem);
            }
        }

        System.out.println("==Items==");
        for (Item item : items) {
            System.out.println(item);
        }
    }
}
