class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        int n = nums.length;
        //store the counts of each element in the count array
        int[] count = new int[n+1];
        for(int i = 0;i<n;i++){
            count[nums[i]]++;
        }
        //traverse the count array
        //add all the i's for which the count[i] > 1
        for(int i = 0;i<count.length;i++){
            if(count[i] > 1){
                result.add(i);
            }
        }

        return result;
    }
}
