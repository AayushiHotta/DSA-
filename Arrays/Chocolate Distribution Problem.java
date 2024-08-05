class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // Sort the array
        Collections.sort(a);
        
        // Initialize the minimum difference as a large value
        long minDiff = Long.MAX_VALUE;
        
        // Slide the window of size M over the sorted array and find the minimum difference
        for (int i = 0; i <= n - m; i++) {
            long diff = a.get(i + m - 1) - a.get(i);
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
        
        // Return the minimum difference found
        return minDiff;
    }
}
