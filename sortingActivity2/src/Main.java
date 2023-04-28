import java.util.*;
public class Main {
    public static void main(String[] args) {
        Sorting classObj = new Sorting();
        int[] array = classObj.getArray();
        String unsortedString = Arrays.toString(array);
        System.out.println("Unsorted array: " + unsortedString);
        Sorting.quickSort(array, 0, array.length - 1);
        String sortedString = Arrays.toString(array);
        System.out.println("Sorted array: " + sortedString);
        }
    }