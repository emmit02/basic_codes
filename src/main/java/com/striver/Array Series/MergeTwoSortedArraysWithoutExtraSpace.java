Problem statement
Given two non-decreasing sorted arrays, ‘A’ and ‘B’, having ‘N’ and ‘M’ elements, respectively.



You must merge these arrays, ‘A’ and ‘B’, into a sorted array without using extra space. Of all the 'N + M' sorted elements, array 'A' should contain the first 'N' elements, and array 'B' should have the last 'M' elements.


//solution



import java.util.Arrays;
public class MergeTwoSortedArraysWithoutExtraSpace {
    public static void mergeTwoSortedArraysWithoutExtraSpace(long []a, long []b){
        int n = a.length;
        int m = b.length;
        for(int i = 0; i < n; ++i)
        {
            int f = i;
            long l = a[i];
            for(int j = i; j < n; ++j)
            {
                if(a[j] < l)
                {
                    l = a[j];
                    f = j;
                }
            }
            for(int j = 0; j < m; ++j)
            {
                if(b[j] < l)
                {
                    l = b[j];
                    f = j;
                }
            }

            if(f < n && f >= i && a[f] == l)
                swap(a, a, i, f);
            else
                swap(a, b, i, f);
        }

        Arrays.sort(b);
    }
    public static void swap(long []arr1, long []arr2, int a, int b)
    {
        long temp = arr1[a];
        arr1[a] = arr2[b];
        arr2[b] = temp;
    }
}