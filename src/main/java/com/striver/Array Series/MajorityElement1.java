Problem statement
Given an array ‘A’ of ‘N’ integers, find the majority elements of the array.

A majority element in an array ‘A’ of size ‘N’ is an element that appears more than floor(N / 3) times.

Note: The floor function returns the number rounded down to the nearest integer.

Note: Return the array of majority elements in sorted order.

Example:
Input: ‘N’ = 9 ‘A’ = [2, 2, 1, 3, 1, 1, 3, 1, 1]

Output: 1



//solution



import java.util.*;
public class MajorityElement1 {
    public static List< Integer > majorityElement(int []v) {
        // Write your code here
        int n = v.length;

        List< Integer > ans = new ArrayList<>();
        List< Integer > r = new ArrayList<>();
        for(int i=0;i<n;++i) 
        {
            int current=v[i]; 
            int count = 0;
            for(int j=0;j<n;++j) 
            {
                if(current == v[j])
                ++count;
            }
            if(count > n/3) 
            {
                ans.add(current);
            }
        }

        for(int i=0;i<ans.size();++i) 
        {
            if(!r.contains(ans.get(i))) 
            {
                r.add(ans.get(i));
            }
        }
        Collections.sort(r);
        return r;
    }
}