Problem statement
Given an array ‘arr’ of size ‘n’ find the largest element in the array.



Example:

Input: 'n' = 5, 'arr' = [1, 2, 3, 4, 5]

Output: 5


//solution

    
import java.util.* ;
import java.io.*; 

public class LargestElement {

    static int largestElement(int[] arr, int n) {
        // Write your code here.
        for(int i=0;i<n;i++)
        { 
            int temp=0;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr[arr.length - 1];
    }
}
