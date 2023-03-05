package objectsOnAList.stack;

import java.util.ArrayList;

public class Stack {
    ArrayList<String> list = new ArrayList<>();

    public Stack() {
        this.list = new ArrayList<>();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void add(String value) {
        this.list.add(value);
    }

    public String take() {
        String lastOne = this.list.remove(list.size() - 1);
        return lastOne;
    }

    public ArrayList<String> values() {
        ArrayList<String> copyList = new ArrayList<>();
        copyList.addAll(list);
        return copyList;
    }
}
