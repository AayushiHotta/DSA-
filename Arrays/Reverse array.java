import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static void reverseArray(ArrayList<Integer> arr, int m) {
        // Considering 0-based indexing
        int startIndex = m + 1;
        int endIndex = arr.size() - 1;

        // Check if the range is valid
        if (startIndex >= endIndex) {
            return; // Nothing to reverse
        }

        // Reverse the subarray [startIndex, endIndex]
        while (startIndex < endIndex) {
            Collections.swap(arr, startIndex, endIndex);
            startIndex++;
            endIndex--;
        }
    }
}
