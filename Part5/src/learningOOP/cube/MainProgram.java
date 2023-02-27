package learningOOP.cube;

public class MainProgram {
    public static void main(String[] args) {
        Cube myCube = new Cube(4);
        System.out.println(myCube.volume());
        System.out.println(myCube);

        System.out.println();

        Cube anotherCube = new Cube(8);
        System.out.println(anotherCube);
    }
}
