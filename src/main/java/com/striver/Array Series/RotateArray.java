Problem statement
Given an array 'arr' with 'n' elements, the task is to rotate the array to the left by 'k' steps, where 'k' is non-negative.



Example:
'arr '= [1,2,3,4,5]
'k' = 1  rotated array = [2,3,4,5,1]
'k' = 2  rotated array = [3,4,5,1,2]
'k' = 3  rotated array = [4,5,1,2,3] and so on.

\\solution


import java.util.ArrayList;

public class RotateArray {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        int n=arr.size();
        for(int i=0;i<k;i++)
        {
            int temp=arr.get(0);
            for(int j=0;j<n-1;j++)
            {
                arr.set(j,arr.get(j+1));
            }
            arr.set(n-1,temp);
        }
        return arr;
    }
}