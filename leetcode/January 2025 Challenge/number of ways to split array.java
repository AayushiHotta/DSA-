class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long total = 0;
        long curr = 0;
        int count = 0;

        //Find the total sum of the entire array

        for(int i = 0;i<n;i++){
            total += nums[i];
        }

        //Search for the split where the sum of i+1 elements is greater than or equal to n-i-i elements and count them
        for(int i = 0;i<n-1;i++){
            curr += nums[i];
            if(curr >= total - curr){
                count++;
            }
        }
        return count;
    }
}
