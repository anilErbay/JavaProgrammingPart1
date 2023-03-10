package objectsOnAList.cargoHold;

import java.util.ArrayList;

public class Hold {

    private int maxWeight = 0;
    private ArrayList<Suitcase> suitcasesLocker;


    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcasesLocker = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {

        if (holdWeight() + suitcase.totalWeight() <= maxWeight) {
            suitcasesLocker.add(suitcase);
        }
    }

    public int holdWeight() {
        int holdWeight = 0;
        for (Suitcase element : suitcasesLocker) {
            holdWeight += element.totalWeight();
        }
        return holdWeight;
    }

    public void printItems() {
        for (Suitcase element : suitcasesLocker) {
            element.printItems();
        }
    }

    public String toString() {
        return this.suitcasesLocker.size() + " suitcases (" + this.holdWeight() + " kg)";
    }

}