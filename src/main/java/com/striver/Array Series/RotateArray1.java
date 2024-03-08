Problem statement
Given an array 'arr' containing 'n' elements, rotate this array left once and return it.



Rotating the array left by one means shifting all elements by one place to the left and moving the first element to the last position in the array.



Example:
Input: 'a' = 5, 'arr' = [1, 2, 3, 4, 5]

Output: [2, 3, 4, 5, 1]

\\solution


import java.util.* ;
import java.io.*; 

public class RotateArray1 
{
    static int[] rotateArray(int[] arr, int n) {
         int[] rotatedArr = new int[n];

        for (int i = 1; i < n; i++)
        {
            rotatedArr[i - 1] = arr[i];
        }

        rotatedArr[n - 1] = arr[0];
        return rotatedArr;
   }
}