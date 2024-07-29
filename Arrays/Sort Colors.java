class Solution {
    public void sortColors(int[] nums){
        sortColors1(nums);
        sortColors2(nums);
    }
    //Approach 1: using sort method
    public void sortColors1(int[] nums){
        Arrays.sort(nums);
    }

    //Approach 2: Without using sort method
    public void sortColors2(int[] nums) {
        // Initialize pointers for the start, mid, and end positions
        int start = 0; // Pointer for the position of 0s
        int mid = 0; // Pointer for the current element being evaluated
        int end = nums.length - 1; // Pointer for the position of 2s

        // Traverse the array until the mid pointer surpasses the end pointer
        while (mid <= end) {
            switch (nums[mid]) {
                case 0:
                    // If the current element is 0, swap it with the element at the start pointer
                    swap(nums, start, mid);
                    start++; // Move the start pointer forward
                    mid++; // Move the mid pointer forward
                    break;
                case 1:
                    // If the current element is 1, move the mid pointer forward
                    mid++;
                    break;
                case 2:
                    // If the current element is 2, swap it with the element at the end pointer
                    swap(nums, mid, end);
                    end--; // Move the end pointer backward
                    break;
            }
        }
    }

    // Helper function to swap two elements in the array
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
