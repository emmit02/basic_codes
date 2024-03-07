Problem statement
You are given an array 'arr' of length 'n', consisting of integers.



A subarray is a contiguous segment of an array. In other words, a subarray can be formed by removing 0 or more integers from the beginning and 0 or more integers from the end of an array.



Find the sum of the subarray (including empty subarray) having maximum sum among all subarrays.



The sum of an empty subarray is 0.



Example :
Input: 'arr' = [1, 2, 7, -4, 3, 2, -10, 9, 1]
import java.util.* ;
import java.io.*; 

public class MaxSubarraySum {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
		long curSum[] = new long[n];
        long maxSum = 0;

        for(int i = 0; i < n; i++) {
            if(i == 0) {
                curSum[i] = Math.max(0L, arr[i]);
            } else {
                curSum[i] = Math.max(0L, curSum[i-1] + arr[i]);    
            }
        
            maxSum = Math.max(maxSum, curSum[i]);
        }

        return maxSum;
	}

}
