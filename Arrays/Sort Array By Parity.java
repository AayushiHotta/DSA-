class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) { // Use < to avoid redundant checks
            if (nums[low] % 2 == 0) {
                low++; // Move the low pointer if the current element is even
            } else if (nums[high] % 2 != 0) {
                high--; // Move the high pointer if the current element is odd
            } else {
                // Swap elements when nums[low] is odd, and nums[high] is even
                int temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp;
                low++;
                high--;
            }
        }
        return nums;
    }
}
