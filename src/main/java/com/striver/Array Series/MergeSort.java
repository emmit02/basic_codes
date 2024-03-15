Problem statement
You are given the starting 'l' and the ending 'r' positions of the array 'ARR'.



You must sort the elements between 'l' and 'r'.



Note:
Change in the input array itself. So no need to return or print anything.
Example:
Input: ‘N’ = 7,
'ARR' = [2, 13, 4, 1, 3, 6, 28]

Output: [1 2 3 4 6 13 28]

Explanation: After applying 'merge sort' on the input array, the output is [1 2 3 4 6 13 28].



//solution




public class MergeSort {
     public static void mergeSort(int[] arr, int l, int r){
        if(l < r) 
        {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
    public static void merge(int[] arr, int l, int m, int r)
    {
        int num1 = m - l + 1;
        int num2 =  r - m;

        int []L = new int[num1];
        int []R = new int[num2];

        // Copy data to temporary arrays
        for(int i = 0; i < num1; ++i) {
            L[i] = arr[l + i];
        }
        for(int j = 0; j < num2; ++j) {
            R[j] = arr[m + 1 + j];
        }

        int i = 0; 
        int j = 0; 
        int k = l; 
        while (i < num1 && j < num2)
        {
            if (L[i] < R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < num1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        
        while (j < num2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
