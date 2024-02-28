Problem statement
You have been given an array ‘a’ of ‘n’ unique non-negative integers.



Find the second largest and second smallest element from the array.



Return the two elements (second largest and second smallest) as another array of size 2.



Example :
Input: ‘n’ = 5, ‘a’ = [1, 2, 3, 4, 5]
Output: [4, 2]

The second largest element after 5 is 4, and the second smallest element after 1 is 2.

//solution


public class GetSecondOrderElements {
    public static int[] getSecondOrderElements(int n, int []a) {
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
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        
        int[] sample={a[n-2],a[1]};

        return sample;
    }
}