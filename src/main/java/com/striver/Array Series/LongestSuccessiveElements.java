Problem statement
There is an integer array ‘A’ of size ‘N’.

A sequence is successive when the adjacent elements of the sequence have a difference of 1.

You must return the length of the longest successive sequence.

Note:

You can reorder the array to form a sequence. 
For example,

Input:
A = [5, 8, 3, 2, 1, 4], N = 6
Output:
5
Explanation: 
The resultant sequence can be 1, 2, 3, 4, 5.    
The length of the sequence is 5.




//solution



import java.util.*;
class LongestSuccessiveElements {
    public static int longestSuccessiveElements(int []a) {
        // Write your code here.
        int n = a.length;
        if (n == 0)
            return 0;

        int l = 1;
        Set<Integer> set = new HashSet<>();

        for (int i=0;i<n;i++) 
        {
            set.add(a[i]);
        }

        for (int it : set)
        {
            if (!set.contains(it - 1)) 
            {
                int count = 1;
                int m = it;
                while (set.contains(m + 1)) {
                    m = m + 1;
                    count = count + 1;
                }
                l = Math.max(l, count);
            }
        }
        return l;
    }
}