Problem statement
You are given an array of ‘N’ integers where each integer value is between ‘1’ and ‘N’.



Each integer appears exactly once except for ‘P’, which appears exactly twice, and ‘Q’, which is missing.



Your task is to find ‘P’ and ‘Q’ and return them respectively.



Example:
Input: ‘N’ = 4
‘A’ = [1, 2, 3, 2]

Output: {2, 4}



//solution


public class FindMissingRepeatingNumbers {
    public static int[] findMissingRepeatingNumbers(int []a) {
        // Write your code here
        int n = a.length;
        int []count = new int[n + 1];
        for(int i = 0; i < n; ++i) 
        {
            ++count[a[i]];
        }
        int missing = 0;
        int repeating = 0;
        for(int i = 1; i <= n; ++i) 
        {
            if(count[i] == 0) missing = i;
            else if(count[i] == 2) repeating = i;
        }
        int []ans = new int[2];
        ans[0] = repeating;
        ans[1] = missing;
        return ans;
    }
}