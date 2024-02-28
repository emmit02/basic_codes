Problem statement
Given an array 'arr' of 'n' non-negative integers, your task is to move all the zeros to the end of the array while keeping the non-zero elements at the start of the array in their original order. Return the modified array.



Example :
Input: ‘n’ = 5, ‘arr’ = [1, 2, 0, 0, 2, 3]
Output: [1, 2, 2, 3, 0, 0]

//solution

public class MoveZeros {
        public static int[] moveZeros(int n, int []a) {
        // Write your code here.
        if(n==0 || n==1)
        {
            System.out.print("-1");
            System.out.print(" ");
            System.out.print("-1");
            System.out.print("/n");
        }

        for(int i=0;i<n;i++)
        {
            int temp=0;
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==0)
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }    
        }

        return a;
    }
}