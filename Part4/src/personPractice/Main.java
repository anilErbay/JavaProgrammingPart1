package personPractice;

public class Main {
    public static void main(String[] args) {
        Person ada = new Person("Ada");
        Person antti = new Person("Antti");

        ada.printPerson();
        antti.printPerson();

        System.out.println("");

        ada.growOlder();
        ada.growOlder();

        ada.printPerson();
        antti.printPerson();

        int adaAge = ada.returnAge();
        System.out.println(adaAge);
        System.out.println(ada.isOfLegalAge());
        System.out.println(ada.getName());

        System.out.println(ada);

        // ******
        System.out.println();
        // ******

        Person2 matti = new Person2("Matti");
        Person2 juhana = new Person2("Juhana");

        matti.setHeight(180);
        matti.setWeight(86);

        juhana.setHeight(175);
        juhana.setWeight(64);

        System.out.println(matti.getName() + ", body mass index is " + matti.bodyMassIndex());
        System.out.println(juhana.getName() + ", body mass index is " + juhana.bodyMassIndex());
    }
}
