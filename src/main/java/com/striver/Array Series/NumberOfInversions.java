Problem statement
There is an integer array ‘A’ of size ‘N’.



Number of inversions in an array can be defined as the number of pairs of ‘i’, ‘j’ such that ‘i’ < ‘j’ and ‘A[i]’ > ‘A[j]’.

You must return the number of inversions in the array.



For example,
Input:
A = [5, 3, 2, 1, 4], N = 5
Output:
7


//solution


import java.util.*;
public class NumberOfInversions {
    private static int merge(int[] a, int low, int mid, int high) 
    {
        ArrayList<Integer> temp = new ArrayList<>();
        int l = low;      
        int r = mid + 1; 
        int count = 0;

        while (l <= mid && r <= high)
        {
            if (a[l] <= a[r]) 
            {
                temp.add(a[l]);
                l++;
            } 
            else 
            {
                temp.add(a[r]);
                count += (mid - l + 1);
                r++;
            }
        }

        while (l <= mid) 
        {
            temp.add(a[l]);
            l++;
        }

        while (r <= high) 
        {
            temp.add(a[r]);
            r++;
        }

        for (int i = low; i <= high; i++) 
        {
            a[i] = temp.get(i - low);
        }
        return count;
    }

    public static int mergeSort(int[] a, int low, int high) 
    {
        int count = 0;
        if (low >= high) 
        {
            return count;
        }
        int mid = (low + high) / 2 ;
        count += mergeSort(a, low, mid); 
        count += mergeSort(a, mid + 1, high);
        count += merge(a, low, mid, high);  
        return count;
    }

    public static int numberOfInversions(int[] a, int n) 
    {
        return mergeSort(a, 0, n - 1);
    }
}