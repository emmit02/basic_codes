Problem statement
You are given an array 'a' of size 'n' and an integer 'k'.



Find the length of the longest subarray of 'a' whose sum is equal to 'k'.



Example :
Input: ‘n’ = 7 ‘k’ = 3
‘a’ = [1, 2, 3, 1, 1, 1, 1]

Output: 3

Explanation: Subarrays whose sum = ‘3’ are:

[1, 2], [3], [1, 1, 1] and [1, 1, 1]


//solution


public class LongestSubarrayWithSumK {
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        int n = a.length;
        int max = 0;
        
        for (int i = 0; i < n; ++i)     
        {
            long curSum = 0l;
            for(int j = i; j < n; ++j)
            {
                curSum += a[j];

                if(curSum == k) 
                {
                    max = Math.max(max, j - i + 1);
                }
            }
        }

        return max;
    }
}