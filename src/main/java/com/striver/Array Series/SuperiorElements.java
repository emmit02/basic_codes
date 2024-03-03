Problem statement
There is an integer array ‘a’ of size ‘n’.



An element is called a Superior Element if it is greater than all the elements present to its right.



You must return an array all Superior Elements in the array ‘a’.



Note:

The last element of the array is always a Superior Element. 


Example

Input: a = [1, 2, 3, 2], n = 4

Output: 2 3

//solution

import java.util.*;
public class SuperiorElements 
{
    public static List< Integer > superiorElements(int []a)
    {
        // Write your code here.
        int n=a.length;
        int max= a[n - 1];

        List < Integer > ans= new ArrayList<>();
        ans.add(a[n - 1]);
        for (int i = n - 2; i >= 0; i--) 
        {
            if(a[i]>max)
            {
                ans.add(a[i]);
                max=a[i];
            }
        }

        return ans;
    }
}