Problem statement
You have been given an array ‘a’ of ‘n’ non-negative integers.You have to check whether the given array is sorted in the non-decreasing order or not.



Your task is to return 1 if the given array is sorted. Else, return 0.



Example :
Input: ‘n’ = 5, ‘a’ = [1, 2, 3, 4, 5]
Output: 1


//solution of coding ninja

import java.util.Scanner;

public class IsSorted {
    public static int isSorted(int n, int []a) {
        for(int i=1;i<n;i++)
        {
            if(a[i-1]>a[i])
            {
                return 0;
            }

        }
        return 1;
    }
    public static  void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
    }
}



// solution of leetcode
class Solution {
        public boolean check(int[] A) {
        int k = 0, n = A.length;
        for (int i = 0; i < n; ++i) {
            if (A[i] > A[(i + 1) % n]) {
                k++;
            }
            if (k > 1) {
                return false;
            }
        }
        return true;
    }
    public static  void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] A=new int[n];

        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
    }
}