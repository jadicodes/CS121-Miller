import java.util.ArrayList;

public class BinarySearchDemo {
    public int binarySearch(int key, ArrayList<Integer> array)
    {
        int counter = 0; // keeps track of comparisons
        int low = 0;
        int high = array.size() - 1;
        int mid = (low + high) / 2;
        while (low <= high && array.get(mid) != key)
        {
            if (array.get(mid) < key) // if mid is less than key...
            {
                low = mid + 1; // low is reset to position after key
            }
            else  // if mid is greater than key...
            {
                high = mid - 1; // high is reset to position before key
            }
            mid = (low + high) / 2; //mid is reset to mid between new low/high
            System.out.println("comparison: " + ++counter);
        }
        if (low > high) // if not found
        {
            mid = -1;
        }
        return mid;
    }
}
