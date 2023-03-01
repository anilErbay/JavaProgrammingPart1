package objectsAndReferences.objAsObjVariable;

public class MainP {
    public static void main(String[] args) {
        SimpleDate date = new SimpleDate(1, 1, 780);
        PersonD chris = new PersonD("Chris", date);
        PersonD karl = new PersonD("Karl", 19, 6, 1844);
        System.out.println(chris);
        System.out.println(karl);

    }
}
