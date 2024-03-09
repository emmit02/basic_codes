Problem statement
You are given an array ‘a’ of ‘n’ integers.



You have to return the lexicographically next to greater permutation.



Note:

If such a sequence is impossible, it must be rearranged in the lowest possible order.


Example:

Input: 'a' = [1, 3, 2]

Output: 2 1 3




\\solution\\  




import java.util.*;
public class NextGreaterPermutation {
    public static List< Integer > nextGreaterPermutation(List< Integer > A) {
        // Write your code here.
        int n = A.size();
        int index = -1; 
        for(int i=n-2;i>=0;i--) 
        {
            if (A.get(i)<A.get(i + 1)) 
            {
                index=i;
                break;
            }
        }

        if (index == -1)
        {
            Collections.reverse(A);
            return A;
        }

        for (int i=n-1;i>index;i--) 
        {
            if (A.get(i) > A.get(index)) 
            {
                int tmp = A.get(i);
                A.set(i, A.get(index));
                A.set(index, tmp);
                break;
            }
        }

        List<Integer> sublist = A.subList(index + 1, n);
        Collections.reverse(sublist);

        return A;
    }
}