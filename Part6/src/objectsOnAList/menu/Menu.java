package objectsOnAList.menu;

import java.util.ArrayList;

public class Menu {
    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal) {
        if (!meals.contains(meal)) {
            this.meals.add(meal);
        }
    }

    public void clearMenu() {
        this.meals.clear();
    }

    public void printMeals() {
        for (String meal:meals) {
            System.out.println(meal);
        }
    }
}
