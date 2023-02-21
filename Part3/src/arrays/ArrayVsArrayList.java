package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        // Array (fixed in size ,does not grow and shrink!) static
        // can hold primitives or objects
        String[] friendsArray = new String[4];
        String[] friendsArray2 = {"John", "Chris", "Eric", "Luke"};
        friendsArray[0] = "John";
        friendsArray[1] = "Chris";
        friendsArray[2] = "Eric";
        friendsArray[3] = "Luke";


        System.out.println(friendsArray2.length);  // field
        System.out.println(friendsArray2[3]);

        // ArrayList , grow and shrink ,not fixed in size , dynamic
        // can only hold objects ,can't hold primitives but support wrapper types for primitives
        ArrayList<String> friendsArrayList = new ArrayList<>();
        ArrayList<String> friendsArrayList2 = new ArrayList<>(Arrays.asList("John", "Chris", "Eric", "Luke"));

        System.out.println(friendsArrayList2.size());  // method call
        System.out.println(friendsArrayList2.get(3));

        friendsArrayList2.set(0, "Jax");
        System.out.println(friendsArrayList2.get(0));

        friendsArrayList2.remove("Luke");

        friendsArrayList2.clear();
        System.out.println(friendsArrayList2);

        friendsArrayList.add("Jax");
        friendsArrayList.add("Opie");
        friendsArrayList.add("Chibs");
        friendsArrayList.add("Happy");
        friendsArrayList.add("Tig");

        for (String member : friendsArrayList) {
            System.out.println(member);
        }
    }
}
