Problem statement
You are given an integer array 'arr' of size 'N' and an integer 'K'.

Your task is to find the total number of subarrays of the given array whose sum of elements is equal to k.

A subarray is defined as a contiguous block of elements in the array.

Example:
Input: ‘N’ = 4, ‘arr’ = [3, 1, 2, 4], 'K' = 6

Output: 2

Explanation: The subarrays that sum up to '6' are: [3, 1, 2], and [2, 4].



//solution


import java.util.* ;
import java.io.*; 
public class FindAllSubarraysWithGivenSum {
    public static int findAllSubarraysWithGivenSum(int arr[], int s) {
        // Write your code here.  
        int n = arr.length;
        int res = 0;
    
        for (int i=0;i<n;i++) 
        {
            int sum = 0;
    
            for (int j=i;j<n;j++) 
            {
                sum += arr[j];
    
                if (sum == s) {
                    res += 1;
                }
            }
        }
    
        return res;
    }
}