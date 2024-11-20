class Solution {
    public static double helper(double x, int n){
        if(n == 0) return 1.0;
        double partial_ans = helper(x,n/2);
        if(n % 2 == 0){
            return partial_ans * partial_ans;
        } else {
            return partial_ans * partial_ans * x;
        }
    }
    public double myPow(double x, int n) {
        if(n == 0) return 1;
        if (n > 0){
            return helper(x,n);
        } else {
            return 1/helper(x,-n);
        }
    }
}
