package objectsInAList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        // string can be stored in a variable
        String name1 = "Betty Jennings";
        // then add it to the list
        names.add(name1);

        // strings can also be directy added to the list
        names.add("Betty Snyder");
        names.add("Frances Spence");
        names.add("Kay McNulty");
        names.add("Marlyn Wescoff");
        names.add("Ruth Lichterman");

        // several different repeat statements can be
        // used to go through the list elements

        // while loop
        int index = 0;
        while (index < names.size()) {
            System.out.println(names.get(index));
            index++;
        }
        System.out.println();
        // for loop
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        System.out.println();
        
        // for each loop
        for (String name : names) {
            System.out.println(name);
        }
    }
}
