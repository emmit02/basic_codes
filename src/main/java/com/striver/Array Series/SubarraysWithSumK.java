Problem statement
Given an array ‘A’ consisting of ‘N’ integers and an integer ‘B’, find the number of subarrays of array ‘A’ whose bitwise XOR( ⊕ ) of all elements is equal to ‘B’.



A subarray of an array is obtained by removing some(zero or more) elements from the front and back of the array.



Example:
Input: ‘N’ = 4 ‘B’ = 2
‘A’ = [1, 2, 3, 2]

Output: 3

Explanation: Subarrays have bitwise xor equal to ‘2’ are: [1, 2, 3, 2], [2], [2].



//solution



import java.util.*;
public class SubarraysWithSumK {
    public static int subarraysWithSumK(int []a, int b) {
        // Write your code here
        int n=a.length;
        int xor=0;
        Map<Integer, Integer> map=new HashMap<>();
        map.put(xor, 1);
        int count=0;

        for(int i=0;i<n;i++)
        {
            xor = xor ^ a[i];
            int x = xor ^ b;
            
            if(map.containsKey(x))
            {
                count += map.get(x);
            }
            if(map.containsKey(xor))
            {
                map.put(xor, map.get(xor)+1);
            }
            else
            {
                map.put(xor, 1);
            }
        }
        return count;
    }
}