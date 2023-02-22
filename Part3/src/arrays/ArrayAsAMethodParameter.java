package arrays;

public class ArrayAsAMethodParameter {

    public static void listElements(int[] integerArray) {
        System.out.println("the elements of the array are: ");
        int index = 0;
        while (index < integerArray.length) {
            System.out.print(integerArray[index] + " ");
            index++;
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        listElements(numbers);
    }
}
