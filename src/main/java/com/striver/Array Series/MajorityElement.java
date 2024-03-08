Problem statement
You are given an array 'a' of 'n' integers.



A majority element in the array ‘a’ is an element that appears more than 'n' / 2 times.



Find the majority element of the array.



It is guaranteed that the array 'a' always has a majority element.



Example:
Input: ‘n’ = 9, ‘a’ = [2, 2, 1, 3, 1, 1, 3, 1, 1]

Output: 1



//solution



public class MajorityElement {
    public static int majorityElement(int []v) {
        // Write your code here
        int n=v.length;

        for(int i=0;i<n;++i)
        {
            int el=v[i];
            int count = 0;
            for(int j=0;j<n;++j) 
            {
                if(el==v[j])
                 ++count;
            }
            if(count>(n/2))
            {
                return el;
            }
        }
        return 0;
    }
}