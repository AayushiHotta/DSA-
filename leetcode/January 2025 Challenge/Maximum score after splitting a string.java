/*Approach:
    1. Count the total number of ones
    2. As we traverse from left to right, add the no. of zeros from the left and 
    to tackle the no. of ones on the right, we remove the current no. one_count (i.e the count of ones in the left substring)
    Hence the no. of ones in the right substring will be the score from the right substring
    add to the current Score and update the final score with the max of the final score and the current score
*/
class Solution {
    public int maxScore(String s) {
        int zero_count = 0;
        int one_count = 0;
        int total_one = 0;
        int score = Integer.MIN_VALUE;

        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '1'){
                total_one++;
            }
        }

        for(int i = 0;i<s.length()-1;i++){
            if(s.charAt(i) == '0'){
                zero_count++;
            } else{
                one_count++;
            }
            int currentScore = zero_count + (total_one - one_count);
            score = Math.max(currentScore, score);
        }
        return score;


    }
}
