import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        // Sort the array to facilitate the two-pointer technique and duplicate handling
        Arrays.sort(nums);

        // Iterate through the array, selecting one element at a time
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate elements to avoid duplicate triplets in the result
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            // Initialize two pointers, one from the next element of the current element
            // and the other from the end of the array
            int left = i + 1;
            int right = nums.length - 1;

            // Use the two-pointer technique to find pairs that sum up to the negative
            // of the selected element (nums[i])
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                // If the sum of the three elements is zero, add the triplet to the result list
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Move the left pointer to the right and the right pointer to the left
                    left++;
                    right--;
                    
                    // Skip duplicate elements to avoid duplicate triplets in the result
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (sum < 0) {
                    // If the sum is less than zero, move the left pointer to the right
                    // to increase the sum
                    left++;
                } else {
                    // If the sum is greater than zero, move the right pointer to the left
                    // to decrease the sum
                    right--;
                }
            }
        }
        // Return the list of triplets that sum up to zero
        return result;
    }
}
