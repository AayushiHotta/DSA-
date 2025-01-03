class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Step 1: Calculate prefix product for each index
        result[0] = 1; // No elements to the left of the first element
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Step 2: Calculate suffix product and multiply with prefix product
        int suffix = 1; // No elements to the right of the last element
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffix; // Multiply with suffix product
            suffix *= nums[i];  // Update suffix product
        }

        return result;
    }
}