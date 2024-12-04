import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findSecondLargest(int n, int[] arr) {
		// Write your code here.
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		if(arr.length < 2){
			return -1;
		}
		for(int i = 0;i<arr.length;i++){
			if(arr[i] > first){
				second = first;
				first = arr[i];
			}else if(arr[i] != first && arr[i] > second){
				second = arr[i];
			}
		}

		if(second != Integer.MIN_VALUE){
			return second;
		} else {
			return -1;
		}
	}
}
