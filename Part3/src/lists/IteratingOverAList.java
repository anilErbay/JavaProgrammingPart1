package lists;

import java.util.ArrayList;

public class IteratingOverAList {
    public static void main(String[] args) {
        ArrayList<String> teachers = new ArrayList<>();

        teachers.add("Simon");
        teachers.add("Samuel");
        teachers.add("Ann");
        teachers.add("Anna");

        for (int i = 0; i < teachers.size(); i++) {
            System.out.println(teachers.get(i));
        }

        System.out.println("***000***");
        // or
        for (String teacher : teachers) {
            System.out.println(teacher);
        }

        System.out.println("***000***");
        // reverse iterating
        for (int i = teachers.size() - 1; i >= 0; i--) {
            System.out.println(teachers.get(i));
        }

        System.out.println("***000***");
        // with while loop
        int index = 0;
        while (index < teachers.size()) {
            System.out.println(teachers.get(index));
            index++;
        }

        System.out.println("Size of the list: " + teachers.size());

    }
}
