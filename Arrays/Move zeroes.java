class Solution {
    public void moveZeroes(int[] a) {
        int n = a.length;
        int right = 0, left = 0;
        while(right < n){
            if(a[right] != 0){
                int temp = a[right];
                a[right] = a[left];
                a[left] = temp;
                left++;
            }
            right++;
        }
    }
}
