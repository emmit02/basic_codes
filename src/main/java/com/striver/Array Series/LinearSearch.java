Problem statement
You are given an array ‘arr’ containing ‘n’ integers. You are also given an integer ‘num’, and your task is to find whether ‘num’ is present in the array or not.



If ‘num’ is present in the array, return the 0-based index of the first occurrence of ‘num’. Else, return -1.



Example:
Input: ‘n’ = 5, ‘num’ = 4 
'arr' =  [6,7,8,4,1] 

Output: 3


// solution 



import java.util.Scanner;
public class LinearSearch {
    public static int linearSearch(int n, int num, int []arr){
        int ans=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==num)
            {
                ans=i;
                break;
            }

        }
        return ans;
    }
    public static  void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
}