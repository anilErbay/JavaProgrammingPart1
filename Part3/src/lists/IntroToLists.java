package lists;

import java.util.ArrayList;

public class IntroToLists {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(21);
        System.out.println(numbers);

        ArrayList<Double> numberDouble = new ArrayList<>();
        numberDouble.add(7.37);

        ArrayList<String> myTeam = new ArrayList<>();
        myTeam.add("Chris");
        myTeam.add("Tom");
        myTeam.add("Brandon");
        System.out.println(myTeam.get(1));


        ArrayList<Boolean> boolList = new ArrayList<>();
        boolList.add(true);

        // *****
        // removing from list and checking the existence of a value
        ArrayList<String> list = new ArrayList<>();

        list.add("First");
        list.add("Second");
        list.add("Third");

        list.remove(1);
        System.out.println("Index 0 so the first value: " + list.get(0));
        System.out.println("Index 1 so the second value: " + list.get(1));

        list.remove("Third");
        System.out.println(list);

        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(15);
        numberList.add(21);
        numberList.add(9);
        numberList.add(47);
        System.out.println(numberList);
        numberList.remove(Integer.valueOf(9));
        System.out.println(numberList);

        System.out.println("");
        // contains method
        ArrayList<String> randomList = new ArrayList<>();
        randomList.add("first");
        randomList.add("second");
        randomList.add("third");

        System.out.println("Is the 'first' found? : " + randomList.contains("first"));

        boolean isFound = randomList.contains("third");
        if (isFound) {
            System.out.println("second is found");
        }
        // or
        if (randomList.contains("Second")) {
            System.out.println("Second can still be found");
        }

    }

}
