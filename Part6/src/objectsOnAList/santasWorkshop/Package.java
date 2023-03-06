package objectsOnAList.santasWorkshop;

import java.util.ArrayList;

public class Package {

    private ArrayList<Gift> gifts;

    public Package() {
        gifts = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        gifts.add(gift);
    }

    public int totalWeight() {
        if (gifts.isEmpty()) {
            return -1;
        }

        int sumOfWeight = 0;

        for (Gift present : gifts) {
            sumOfWeight += present.getWeight();
        }

        return sumOfWeight;
    }
}
