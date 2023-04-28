import java.util.Scanner;

public class Sorting {
    public int[] getArray() {
        Scanner input = new Scanner(System.in);

        int[] array  = new int [5];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Input an integer: ");
            array[i] = input.nextInt();
        }
        return array;
    }
    public static void sortArray(int[] array) {
        //variable to temporarily hold a value during switch
        int temp;

        //loop through the whole array once for each element in the array
        for (int i = 0; i < array.length - 1; i++) {
            for (int index = 0; index < array.length - i - 1; index++) {
                if (array[index] > array[index + 1]) {
                    temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                }
            }
        }
    }
}
