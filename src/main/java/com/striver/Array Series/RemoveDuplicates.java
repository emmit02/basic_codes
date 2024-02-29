Problem statement
You are given a sorted integer array 'arr' of size 'n'.



You need to remove the duplicates from the array such that each element appears only once.



Return the length of this new array.



Note:
Do not allocate extra space for another array. You need to do this by modifying the given input array in place with O(1) extra memory. 

\\solution

public class RemoveDuplicates {
    public static int removeDuplicates(int[] arr,int n) {
        // Write your code here.
        int count=0;
        for(int j=1;j<n;j++)
        {
            if(arr[count]!=arr[j])
            {
                count++;
                arr[count]=arr[j];                      
            }   
        }
        return count+1;
        
    }
}