package removingRepCode.Example;

import java.util.ArrayList;

public class TestPet {
    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<>();

        pets.add(new Pet("Nagini", 7));
        pets.add(new Pet("Crookshanks"));
        pets.add(new Pet(6));

        for (Pet pet: pets) {
            System.out.print(pet + ", ");
        }
    }
}
