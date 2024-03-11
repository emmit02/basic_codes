Problem statement
Ninja and his friend are playing a game of subarrays. They have an array ‘NUMS’ of length ‘N’. Ninja’s friend gives him an arbitrary integer ‘K’ and asks him to find the length of the longest subarray in which the sum of elements is equal to ‘K’.

Ninjas asks for your help to win this game. Find the length of the longest subarray in which the sum of elements is equal to ‘K’.

If there is no subarray whose sum is ‘K’ then you should return 0.

Example:
Input: ‘N’ = 5,  ‘K’ = 4, ‘NUMS’ = [ 1, 2, 1, 0, 1 ]

Output: 4

There are two subarrays with sum = 4, [1, 2, 1] and [2, 1, 0, 1]. Hence the length of the longest subarray with sum = 4 is 4.




//soluution



import java.util.* ;
import java.io.*; 
public class GetLongestSubarray {
	public static int getLongestSubarray(int []nums, int k) {
		// Write your code here.
		int ans = 0;
		int n = nums.length;
        for (int i = 0; i < n; i++) 
		{
            int sum = 0;
		    for (int j = i; j < n; j++) 
			{
                sum =sum+nums[j];

                if (sum == k) 
				{
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }
        return ans;
	}
}