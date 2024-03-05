Problem statement
There is an array ‘A’ of size ‘N’ with an equal number of positive and negative elements.

Without altering the relative order of positive and negative numbers, you must return an array of alternative positive and negative values.

Note:

Start the array with a positive number. 
For example

Input:
A = [1, 2, -4, -5], N = 4
Output:
1 -4  2 -5
Explanation: 
Positive elements = 1, 2
Negative elements = -4, -5
To maintain relative ordering, 1 must occur before 2, and -4 must occur before -5.


//solution



import java.util.*;

public class AlternateNumbers {
    public static int[] alternateNumbers(int []a) {
        // Write your code here.
        int n=a.length;
        ArrayList<Integer> p=new ArrayList<>();
        ArrayList<Integer> q=new ArrayList<>();
  
        for(int i=0;i<n;i++)
        {
            if(a[i]>0) p.add(a[i]);
            else q.add(a[i]);
        }
        for(int i=0;i<n/2;i++)
        {      
            a[2*i] = p.get(i);
            a[2*i+1] = q.get(i);
        }

        return a;
    }
}