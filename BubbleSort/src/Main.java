//Jadi Miller
//4/21/2023
//Uses bubble sort to sort 5 integers that are given by the user
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Sorting classObj = new Sorting();
        int[] array = classObj.getArray();
        String unsortedString = Arrays.toString(array);
        System.out.println("Unsorted array: " + unsortedString);
        Sorting.sortArray(array);
        String sortedString = Arrays.toString(array);
        System.out.println("Sorted array: " + sortedString);
    }
}